package com.jockey.designpattern.learning.absfactory;

public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Squere::draw() method.");
    }
}
