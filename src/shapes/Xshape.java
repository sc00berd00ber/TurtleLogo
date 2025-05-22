package shapes;

import turtleWorld.Turtle;

import java.awt.*;

public class Xshape extends Shape {
    private int width;
    private int height;

    Xshape(Turtle turtle, int xPosition, int yPosition, String colorName, int borderWidth, int width, int height) {
        super(turtle, xPosition, yPosition, colorName, borderWidth);
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {
        super.draw();

        int width = 200;
        int height = 200;

        // calculate the hypotenuse (diagonal)
        // a2 + b2 = c2
        double widthSquared = Math.pow(width, 2);
        double heightSquared = Math.pow(height, 2);
        double hypotenuse = Math.sqrt(widthSquared + heightSquared);


        turtle.setPenWidth(3);
        turtle.setColor(Color.GREEN);

        turtle.turnRight(45);
        turtle.forward(hypotenuse);

        turtle.penUp();
        turtle.goTo(width / 2.0, height / 2.0);
        turtle.turnRight(90);

        turtle.penDown();
        turtle.forward(hypotenuse);
    }
}
