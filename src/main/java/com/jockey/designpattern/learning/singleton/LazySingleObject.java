package com.jockey.designpattern.learning.singleton;

public class LazySingleObject {

    private static LazySingleObject singleObject;

    private LazySingleObject() {

    }

    public synchronized static LazySingleObject getInstance() {
        if(singleObject == null) {
            singleObject = new LazySingleObject();
        }
        return singleObject;
    }

    public void showMessage() {
        System.out.println("Hello World lazy singleton object.");
    }
}
