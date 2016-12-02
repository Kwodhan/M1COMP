export CLASSPATH=.:./src:./antlr-3.5.2-complete.jar


for i in tests/testlevel3/*.vsl ; do
	java VslComp $i > ./nachos/test/output.s
	cd nachos
	
	./asm2bin.sh output
	var=`./exec.sh output`

	cd ..
	file=$(echo $i | sed -e "s/vsl/mips_out/g")
	result_string=`cat $file`
	var2=$(echo $var | sed -e "s/ Machine halting Cleaning up...//g")
	var2=$(echo $var2 | sed -e "s/Machine halting Cleaning up...//g")
	echo $var2
	echo $result_string
	if [ "$result_string" = "$var2" ]; then
		echo -e "$file \n Good"
	else
		echo -e "$file \n bad"
	fi
	
	
done



