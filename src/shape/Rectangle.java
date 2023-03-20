package shape;

import java.awt.*;

public class Rectangle implements Shape {

    private Point center;
    private double width;
    private double height;


    public Rectangle(double x, double y, double width, double height) {
        center = new Point(x, y);
        this.width = width;
        this.height = height;
    }

    public Rectangle(Point point, double width, double height) {
        this(point.getX(), point.getY(), width, height);
    }


    @Override
    public void draw(Graphics g) {
        int x = (int) center.getX() - (int) (width/2);
        int y = (int) center.getY() - (int) (height/2);

        g.drawRect(x , y, (int) (width), (int) (height));
    }

    @Override
    public Point getPosition() {
        return center;
    }

    @Override
    public double getWidth() {
        return width;
    }

    @Override
    public double getHeight() {
        return height;
    }

    @Override
    public boolean intersects(Point point) {
        return false;
    }

    @Override
    public void moveTo(Point point) {

    }

    @Override
    public void move(double dx, double dy) {
        center.move(dx, dy);
    }

    @Override
    public void resizeTo(Point point) {
        width = center.distanceTo(point);
        height = center.distanceTo(point);
    }

    @Override
    public Shape peel() {
        return null;
    }
}
