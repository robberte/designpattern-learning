package com.jockey.designpattern.learning.singleton;

public class SingleObject {

    private static SingleObject instance = new SingleObject();

    private SingleObject() {

    }

    public static SingleObject getInstance() {
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello World singleton object.");
    }
}
