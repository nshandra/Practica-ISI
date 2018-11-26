#!/bin/sh

case $# in
	0 ) echo '0'
		javac -cp .:./../hamcrest-core-1.3.jar:./../junit-4.12.jar EmbotelladoraTest.java
		javac -cp .:./../hamcrest-core-1.3.jar:./../junit-4.12.jar AllTests.java
		java -cp .:./../hamcrest-core-1.3.jar:./../junit-4.12.jar AllTests
		;;
	1 ) echo '1'
		javac -cp .:./../hamcrest-core-1.3.jar:./../junit-4.12.jar DataDrivenEmbotelladoraTest.java
		javac -cp .:./../hamcrest-core-1.3.jar:./../junit-4.12.jar AllTestsDD.java
		java -cp .:./../hamcrest-core-1.3.jar:./../junit-4.12.jar AllTestsDD
		;;
	* ) echo '*'
		exit 1
		;;
esac
exit 0