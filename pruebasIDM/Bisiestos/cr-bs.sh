#!/bin/sh

case $# in
	0 ) echo '0'
		javac -cp .:./../hamcrest-core-1.3.jar:./../junit-4.12.jar BisiestosTest.java
		javac -cp .:./../hamcrest-core-1.3.jar:./../junit-4.12.jar AllTests.java
		java -cp .:./../hamcrest-core-1.3.jar:./../junit-4.12.jar AllTests
		;;
	* ) echo '*'
		exit 1
		;;
esac
exit 0