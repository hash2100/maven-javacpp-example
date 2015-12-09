maven-javacpp-example
=====================

This is a simple example on how to call methods from a shared library written in C++, using JavaCPP 1.1. It defines a maven project configuration
and the required plugins to get it compiled and built as a single jar with all dependencies contained.

The shared library is defined as a shared object for Linux. The build specifications are contained in a Makefile and the interface with the
Java code is assured by means of a header file.

To compile and unit test:

```
$ mvn clean install
```

For execution, issue (also see expected result):

```
$ java -jar target/maven-javacpp-example-1.0-SNAPSHOT-jar-with-dependencies.jar
initial value: 0 is zero: 1
new value: 5 is zero: 0
x: 5.0 y: 50.0
```

Check the pom.xml for further details.
