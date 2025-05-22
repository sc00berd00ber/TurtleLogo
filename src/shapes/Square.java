package shapes;
import turtleWorld.Turtle;

public class Square extends Shape {
    private int width;
//    private int height;

    public Square(Turtle turtle, int xPosition, int yPosition, String colorName, int borderWidth, int width) {
        super(turtle, xPosition, yPosition, colorName, borderWidth);
        this.width = width;
//        this.height = height;
    }

    @Override
    public void draw() {
        super.draw();

        turtle.forward(width);
        turtle.turnRight(90);

        turtle.forward(width);
        turtle.turnRight(90);

        turtle.forward(width);
        turtle.turnRight(90);

        turtle.forward(width);
        turtle.turnRight(90);

    }
}
