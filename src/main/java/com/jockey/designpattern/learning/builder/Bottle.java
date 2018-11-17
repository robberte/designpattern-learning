package com.jockey.designpattern.learning.builder;

/**
 * @author robberte
 * @date 2018/8/7 下午11:49
 */
public class Bottle implements Packing {

    @Override
    public String pack() {
        return "Bottle";
    }
}
