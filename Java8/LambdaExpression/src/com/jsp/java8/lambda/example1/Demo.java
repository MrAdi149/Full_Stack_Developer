package com.jsp.java8.lambda.example1;

@FunctionalInterface
interface Demo {
    void printHello();
}

class DemoMain implements Demo {
    @Override
    public void printHello() {
        System.out.println("hello: 1");
    }
}