#!/bin/sh

javac -cp .:../../hamcrest-core-1.3.jar:../../junit-4.12.jar RomanNumeral.java
javac -cp .:../../hamcrest-core-1.3.jar:../../junit-4.12.jar RomanNumeralTest.java
javac -cp .:../../hamcrest-core-1.3.jar:../../junit-4.12.jar AllTests.java
java -cp .:../../hamcrest-core-1.3.jar:../../junit-4.12.jar AllTests
echo "FIN DEL SCRIPT"
