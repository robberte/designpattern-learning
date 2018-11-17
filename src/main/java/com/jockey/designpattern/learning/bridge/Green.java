package com.jockey.designpattern.learning.bridge;

/**
 * @author robberte
 * @date 2018/8/8 下午11:51
 */
public class Green implements Color {
    @Override
    public void fill() {
        System.out.println("Color green fill");
    }
}
