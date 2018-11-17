package com.jockey.designpattern.learning.bridge;

/**
 * @author robberte
 * @date 2018/8/9 上午12:01
 */
public class Square extends Shape {

    private int x, y, length;

    public Square(int x, int y, int length, Color color) {
        super(color);
        this.x = x;
        this.y = y;
        this.length = length;
    }

    @Override
    public void draw() {
        System.out.println("Draw square, x:" + x + ", y:" + y + ", length:" + length);
        color.fill();
    }
}
