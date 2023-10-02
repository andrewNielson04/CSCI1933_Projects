// Written by Andrew Nielson, niels880 and Will Borgerding, borge369
import java.awt.Color;
public class Circle {

    public double xPosition;
    public double yPosition;
    public double radius;
    Color C = new Color(0,0,0);
    public Circle(double initXPos, double initYPos, double initRad) {
        xPosition = initXPos;
        yPosition = initYPos;
        radius = initRad;
    }

    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public void setColor(Color color) {
        C = color;
    }

    public void setPos(double xPos, double yPos) {
        xPosition = xPos;
        yPosition = yPos;
    }

    public void setRadius(double rad) {
        radius = rad;
    }

    public Color getColor() {
        return C;
    }

    public double getXPos() {
        return xPosition;
    }

    public double getYPos() {
        return yPosition;
    }

    public double getRadius() {
        return radius;
    }
} // Circle Class

