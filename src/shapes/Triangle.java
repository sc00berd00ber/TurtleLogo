package shapes;

import turtleWorld.Turtle;

public class Triangle extends Shape {
    private int width;
//    private int height;

    public Triangle(Turtle turtle, int xPosition, int yPosition, String colorName, int borderWidth, int width) {
        super(turtle, xPosition, yPosition, colorName, borderWidth);
        this.width = width;
//        this.height = height;
    }

    @Override
    public void draw() {
        super.draw();

        turtle.forward(width);
        turtle.turnRight(120);

        turtle.forward(width);
        turtle.turnRight(120);

        turtle.forward(width);
        turtle.turnRight(120);

    }
}
