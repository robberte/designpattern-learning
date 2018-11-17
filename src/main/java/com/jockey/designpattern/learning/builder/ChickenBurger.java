package com.jockey.designpattern.learning.builder;

/**
 * @author robberte
 * @date 2018/8/7 下午11:54
 */
public class ChickenBurger extends Burger {
    @Override
    public String name() {
        return "Chicken Burger";
    }

    @Override
    public float price() {
        return 50.0f;
    }
}
