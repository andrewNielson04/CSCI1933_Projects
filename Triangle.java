// Written by Andrew Nielson, niels880 and Will Borgerding, borge369
import java.awt.Color;
public class Triangle {
    public double xPosition;
    public double yPosition;
    public double width;
    public double height;
    Color T = new Color(0,0,0);

    public Triangle(double initXPos, double initYPos, double initWidth, double initHeight) {
        xPosition = initXPos;
        yPosition = initYPos;
        width = initWidth;
        height = initHeight;
    } // Triangle

    public double calculatePerimiter() {
        double hypotenuse = Math.sqrt(Math.pow(0.5 * width, 2) + Math.pow(height, 2));
        return 2 * hypotenuse + width;
    } // calculatePerimiter

    public double calculateArea() {
        return 0.5 * width * height;
    } // calculateArea

    public void setColor(Color color) {
        T = color;
    } // setColor

    public void setPos(double xPos, double yPos) {
        xPosition = xPos;
        yPosition = yPos;
    } // setPos

    public void setHeight(double ht) {
        height = ht;
    } // setHeight

    public void setWidth(double wd) {
        width = wd;
    } // setWidth

    public Color getColor() {
        return T;
    } // getColor

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
} // Triangle Class
