#!/bin/sh

if [ $# = 0 ]; then
	javac -cp .:../../hamcrest-core-1.3.jar:../../junit-4.12.jar RomanNumeral.java
	javac -cp .:../../hamcrest-core-1.3.jar:../../junit-4.12.jar RomanNumeralTest.java
	javac -cp .:../../hamcrest-core-1.3.jar:../../junit-4.12.jar AllTests.java
	java -cp .:../../hamcrest-core-1.3.jar:../../junit-4.12.jar AllTests
	echo "FIN DEL SCRIPT"
else
        javac -cp .:../../hamcrest-core-1.3.jar:../../junit-4.12.jar RomanNumeral.java
	java -cp .:../../hamcrest-core-1.3.jar:../../junit-4.12.jar RomanNumeral
fi
exit 0
