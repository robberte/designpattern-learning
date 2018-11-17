package com.jockey.designpattern.learning.bridge;

/**
 * @author robberte
 * @date 2018/8/8 下午11:57
 */
public class Circle extends Shape {
    private int x;
    private int y;
    private int radius;

    public Circle(int x, int y, int radius, Color color) {
        super(color);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Draw circle, radius:" + radius + ", x:" + x + ", y:" + y);
        color.fill();
    }
}
