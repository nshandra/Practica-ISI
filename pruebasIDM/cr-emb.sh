#!/bin/sh

case $# in
	0 ) echo '0'
		javac -cp .:./../hamcrest-core-1.3.jar:./../junit-4.12.jar EmbotelladoraTest.java
		javac -cp .:./../hamcrest-core-1.3.jar:./../junit-4.12.jar AllTestsEmb.java
		java -cp .:./../hamcrest-core-1.3.jar:./../junit-4.12.jar AllTestsEmb
		;;
	1 ) echo '1'
		javac -cp .:./../hamcrest-core-1.3.jar:./../junit-4.12.jar DataDrivenEmbotelladoraTest.java
		javac -cp .:./../hamcrest-core-1.3.jar:./../junit-4.12.jar AllTestsDDEmb.java
		java -cp .:./../hamcrest-core-1.3.jar:./../junit-4.12.jar AllTestsDDEmb
		;;
	2 ) echo '2'
		javac -cp .:./../hamcrest-core-1.3.jar:./../junit-4.12.jar Embotelladora.java
		java -cp .:./../hamcrest-core-1.3.jar:./../junit-4.12.jar Embotelladora
		;;
	* ) echo '*'
		exit 1
		;;
esac
exit 0