package com.jockey.designpattern.learning.singleton;

public class DoubleCheckSingleObject {

    private static DoubleCheckSingleObject singleObject;

    private DoubleCheckSingleObject() {

    }

    public static DoubleCheckSingleObject getInstance() {
        if(singleObject == null) {
            synchronized (DoubleCheckSingleObject.class) {
                if(singleObject == null) {
                    singleObject = new DoubleCheckSingleObject();
                }
            }
        }
        return singleObject;
    }

    public void showMessage() {
        System.out.println("Hello World double check singleton object.");
    }
}
