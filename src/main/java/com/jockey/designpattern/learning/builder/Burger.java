package com.jockey.designpattern.learning.builder;

/**
 * @author robberte
 * @date 2018/8/7 下午11:50
 */
public abstract class Burger implements Item {

    @Override
    public Packing packing() {
        return new Wrapper();
    }
}
