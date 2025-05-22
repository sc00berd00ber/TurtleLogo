import java.awt.*;

abstract class Shape implements IDrawable {

    //  turtle: the turtle that is used to paint the shape
    protected Turtle turtle;

    //  location: Point -- the x,y coordinate where the shape should be drawn
    protected int xPosition;
    protected int yPosition;

    //  color: the color used for the border
    protected String colorName;

    //  border: the width of the shape border
    protected int borderWidth;

    @Override
    public void draw() {
        //  CHILD CLASS WILL OVERRIDE
        setColor();
        turtle.penUp();
        turtle.goTo(xPosition, yPosition);
        turtle.setHeading(0);
        turtle.setPenWidth(borderWidth);
        turtle.penDown();
    }

    public Shape(Turtle turtle, int xPosition, int yPosition, String colorName, int borderWidth) {
        this.turtle = turtle;
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.colorName = colorName;
        this.borderWidth = borderWidth;
    }

    protected void setColor() {
        if (colorName.equalsIgnoreCase("GREEN")) {
            turtle.setColor(Color.GREEN);
        }
        if (colorName.equalsIgnoreCase("BLUE")) {
            turtle.setColor(Color.BLUE);
        }
        if (colorName.equalsIgnoreCase("MAGENTA")) {
            turtle.setColor(Color.MAGENTA);
        }
        if (colorName.equalsIgnoreCase("BLACK")) {
            turtle.setColor(Color.BLACK);
        }
        if (colorName.equalsIgnoreCase("RED")) {
            turtle.setColor(Color.RED);
        }
    }
}
