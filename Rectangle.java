// Written by Andrew Nielson, niels880 and Will Borgerding, borge369
import java.awt.Color;

public class Rectangle {

    public double xPosition;
    public double yPosition;
    public double width;
    public double height;
    Color R = new Color(0,0,0);
    public Rectangle(double initXPos, double initYPos, double initWidth, double initHeight) {
        xPosition = initXPos;
        yPosition = initYPos;
        width = initWidth;
        height = initHeight;
    }

    public double calculatePerimeter() {
        return 2 * width + 2 * height;
    }

    public double calculateArea() {
        return width * height;
    }

    public void setColor(Color color) {
        R = color;
    }

    public void setPos(double xPos, double yPos) {
        xPosition = xPos;
        yPosition = yPos;
    }

    public void setHeight(double ht) {
        height = ht;
    }

    public void setWidth(double wd) {
        width = wd;
    }

    public Color getColor() {
        return R;
    }

    public double getXPos() {
        return xPosition;
    }

    public double getYPos() {
        return yPosition;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }
} // Rectangle Class
