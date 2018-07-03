# Observer Pattern

## Overview
This pattern allows to wrap a component with decorator to add new behaviour with composition (at runtime).

Take into account that both components and decorators extends the same Component abstract class to have the correct type,
while the behaviour comes in through the composition of decorators with the specific component.

## Pattern info
![Alt text](documentation/decorator-pattern-basic-info.png?raw=true "Decorator pattern")

### New OO principles
_Classes should be open for extension,  but close for modification ._

> Decorator pattern is a way to extend system behaviour at runtime without modify existing code.

### Observations
Follow a short list of observations that could help you to understand better how this pattern works: 
+ it provides an alternative to subclassing for extending behaviour
+ each decorator can wrap a concrete component of the same type (that extends the same super abstract component class)
+ decorators and components are the same type, either through inheritance or interface
+ it add new funcionality before and/or after method calls to the component
+ a component can be wrapped with any number of decorators

## Pattern implementation
This project propose a simple implementation of decorator taking as example a bar where you can drink an Espresso or Cappuccino. 
You can require extra ingredients like milk and cocoa.

Decorator pattern is implemented to provide the following information about products required by client:
+ description of the main product (Components) accompanied by extra ingredients (Decorators)
+ the total cost of main product and extra ingredients

## Implementation examples
Java I/O classes are a concrete implementation example of Decorator pattern. 

Java components that are being decorated:
+ [java.io.FileInputStream](https://docs.oracle.com/javase/7/docs/api/java/io/FileInputStream.html)
+ [java.io.StringBufferInputStream](https://docs.oracle.com/javase/7/docs/api/java/io/StringBufferInputStream.html)
+ [java.io.ByteArrayInputStream](https://docs.oracle.com/javase/7/docs/api/java/io/ByteArrayInputStream.html)

Java decorators that can wrap previous components:
+ [java.io.BufferedInputStream](https://docs.oracle.com/javase/7/docs/api/java/io/BufferedInputStream.html)
+ [java.io.LineNumberInputStream](https://docs.oracle.com/javase/7/docs/api/java/io/LineNumberInputStream.html)