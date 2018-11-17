package com.jockey.designpattern.learning.bridge;

/**
 * @author robberte
 * @date 2018/8/9 上午12:03
 */
public class BridgePatternDemo {

    public static void main(String[] args) {
        Color red = new Red();
        Color green = new Green();

        Shape circleRed = new Circle(1, 2, 2, red);
        circleRed.draw();

        Shape circleGreen = new Circle(1, 3, 2, green);
        circleGreen.draw();

        Shape squareRed = new Square(1, 4, 2, red);
        squareRed.draw();
    }
}
