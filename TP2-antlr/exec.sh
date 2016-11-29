export CLASSPATH=.:./src:./antlr-3.5.2-complete.jar

make
java VslComp ./src/test.vsl
