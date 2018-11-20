#!/bin/sh

if [ $# = 1 ]; then
	java -cp .:./../hamcrest-core-1.3.jar:./../junit-4.12.jar AllTests
else
	javac -cp .:./../hamcrest-core-1.3.jar:./../junit-4.12.jar EmbotelladoraTest.java
	javac -cp .:./../hamcrest-core-1.3.jar:./../junit-4.12.jar AllTests.java
	java -cp .:./../hamcrest-core-1.3.jar:./../junit-4.12.jar AllTests
fi
exit 0