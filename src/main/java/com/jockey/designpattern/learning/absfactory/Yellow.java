package com.jockey.designpattern.learning.absfactory;

public class Yellow implements Color {

    @Override
    public void fill() {
        System.out.println("Inside Yellow::fill() method.");
    }
}
