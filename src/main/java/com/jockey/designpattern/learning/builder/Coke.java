package com.jockey.designpattern.learning.builder;

/**
 * @author robberte
 * @date 2018/8/7 下午11:55
 */
public class Coke extends ColdDrink {
    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public float price() {
        return 30.0f;
    }
}
