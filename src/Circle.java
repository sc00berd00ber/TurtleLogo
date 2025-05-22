import java.awt.*;

public class Circle extends Shape {
    private int width;
//    private int height;

    Circle(Turtle turtle, int xPosition, int yPosition, String colorName, int borderWidth, int width) {
        super(turtle, xPosition, yPosition, colorName, borderWidth);
        this.width = width;
//        this.height = height;
    }

    @Override
    public void draw() {
        super.draw();

        int sides = 20;
        int angle = 360 / sides;
        int length = (int) (width / Math.PI);

        for (int s = 0; s < sides; s++){
            turtle.forward(length);
            turtle.turnRight(angle);
        }
    }
}
