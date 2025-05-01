package com.jsp.java8.lambda.example2;

@FunctionalInterface
interface Demo {
    void add(int a, int b);
}

class DemoMain implements Demo {
    @Override
    public void add(int a, int b) {
    	System.out.println(a+b);
    }
}