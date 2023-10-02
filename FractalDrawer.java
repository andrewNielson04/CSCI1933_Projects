// FractalDrawer class draws a fractal of a shape indicated by user input
// Written by Andrew Nielson, niels880 and Will Borgerding, borge369
import java.awt.Color;
import java.util.Random;
import java.util.Scanner;

public class FractalDrawer {
    private double totalArea = 0;  // member variable for tracking the total area

    public FractalDrawer() {
    }  // contructor

    Canvas drawing = new Canvas();
    //TODO:
    // drawFractal creates a new Canvas object
    // and determines which shapes to draw a fractal by calling appropriate helper function
    // drawFractal returns the area of the fractal
    public double drawFractal(String type) {
        // Initial call for the first shape
        if (type.equals("triangle")) {
            drawTriangleFractal(200.0, 200.0, 300.0, 500.0, Color.RED, drawing, 7);
        }
        else if(type.equals("rectangle")) {
            drawRectangleFractal(100.0, 100.0, 450.0, 450.0, Color.RED, drawing, 7);
        }
        else if(type.equals("circle")) {
            drawCircleFractal(100.0, 400.0, 400.0, Color.RED, drawing, 7);
        }
        return totalArea;
    }


    //TODO:
    // drawTriangleFractal draws a triangle fractal using recursive techniques
    public void drawTriangleFractal(double width, double height, double x, double y, Color c, Canvas can, int level) {
        // Draws a triangle and recursively draws three more
        Triangle tri = new Triangle(x, y, width, height);
        tri.setColor(c);
        Random rand = new Random();
        Color col = new Color(rand.nextInt(0, 256), rand.nextInt(0, 256), rand.nextInt(0, 256)); // nextInt is exclusive
        if (level > 0) {
            can.drawShape(tri);
            totalArea += tri.calculateArea(); // adds area for each call
            drawTriangleFractal(width / 2, height / 2, x - width / 4, y - height / 2, col, can, level - 1);
            drawTriangleFractal(width / 2, height / 2, x + width * 0.75, y - height / 2, col, can, level - 1);
            drawTriangleFractal(width / 2, height / 2, x + width / 4, y + height / 2, col, can, level - 1);
        }
    }


    // TODO:
    // drawCircleFractal draws a circle fractal using recursive techniques
    public void drawCircleFractal(double radius, double x, double y, Color c, Canvas can, int level) {
        Circle circ = new Circle(x, y, radius);
        circ.setColor(c);
        Random rand = new Random();
        Color col = new Color(rand.nextInt(0, 256), rand.nextInt(0, 256), rand.nextInt(0, 256)); // nextInt is exclusive
        if (level > 0) {
            can.drawShape(circ);
            totalArea += circ.calculateArea(); // adds area for each call
            drawCircleFractal(radius/2, x, y-radius*1.5, col, can, level-1);
            drawCircleFractal(radius/2, x-radius*1.5, y, col, can, level-1);
            drawCircleFractal(radius/2, x+radius*1.5, y, col, can, level-1);
            drawCircleFractal(radius/2, x, y+radius*1.5, col, can, level-1);
        }
    }


    //TODO:
    // drawRectangleFractal draws a rectangle fractal using recursive techniques
    public void drawRectangleFractal(double width, double height, double x, double y, Color c, Canvas can, int level) {
        Rectangle rect = new Rectangle(x, y, width, height);
        rect.setColor(c);
        Random rand = new Random();
        Color col = new Color(rand.nextInt(0, 256), rand.nextInt(0, 256), rand.nextInt(0, 256)); // nextInt is exclusive
        if (level > 0) {
            can.drawShape(rect);
            totalArea += rect.calculateArea(); // adds area for each call
            drawRectangleFractal(width/2, height/2, x-width, y-width, col, can, level-1);
            drawRectangleFractal(width/2, height/2, x-width, y+width*1.5, col, can, level-1);
            drawRectangleFractal(width/2, height/2, x+width*1.5, y-width, col, can, level-1);
            drawRectangleFractal(width/2, height/2, x+width*1.5, y+width*1.5, col, can, level-1);
        }
    }

    //TODO:
    // main should ask user for shape input, and then draw the corresponding fractal.
    // should print area of fractal
    public static void main(String[] args) {
        System.out.println("Enter a shape(circle, triangle, or rectangle): ");
        Scanner myScanner = new Scanner(System.in);
        String shape = myScanner.nextLine();
        Canvas drawing = new Canvas();
        FractalDrawer FD = new FractalDrawer();
        System.out.println(FD.drawFractal(shape));
    }
}