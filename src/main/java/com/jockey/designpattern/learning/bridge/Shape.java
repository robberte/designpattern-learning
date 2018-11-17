package com.jockey.designpattern.learning.bridge;

/**
 * @author robberte
 * @date 2018/8/8 下午11:52
 */
public abstract class Shape {
    protected Color color;

    public Shape(Color color) {
        this.color = color;
    }

    public abstract void draw();

}
