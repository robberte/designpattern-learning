package com.jockey.designpattern.learning.builder;

/**
 * @author robberte
 * @date 2018/8/7 下午11:56
 */
public class Pepsi extends ColdDrink {
    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public float price() {
        return 35.0f;
    }
}
