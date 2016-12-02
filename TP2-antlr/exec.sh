export CLASSPATH=.:./src:./antlr-3.5.2-complete.jar

make > /dev/null
java VslComp $1 > ./nachos/test/output.s
cd nachos
./asm2bin.sh output
./exec.sh output

