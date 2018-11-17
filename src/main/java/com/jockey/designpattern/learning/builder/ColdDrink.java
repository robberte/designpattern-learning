package com.jockey.designpattern.learning.builder;

/**
 * @author robberte
 * @date 2018/8/7 下午11:52
 */
public abstract class ColdDrink implements Item {


    @Override
    public Packing packing() {
        return new Bottle();
    }

}
