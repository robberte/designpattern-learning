package com.jockey.designpattern.learning.singleton;

public class SingletonPatternDemo {

    public static void main(String[] args) {
        SingleObject singleObject = SingleObject.getInstance();

        singleObject.showMessage();

        LazySingleObject lazySingleObject = LazySingleObject.getInstance();

        lazySingleObject.showMessage();

        DoubleCheckSingleObject doubleCheckSingleObject = DoubleCheckSingleObject.getInstance();

        doubleCheckSingleObject.showMessage();
    }
}
