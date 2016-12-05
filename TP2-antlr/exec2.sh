export CLASSPATH=.:./src:./antlr-3.5.2-complete.jar

make > /dev/null
java VslComp $1 

