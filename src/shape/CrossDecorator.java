package shape;

import java.awt.*;

public class CrossDecorator implements Shape{
    @Override
    public void draw(Graphics g) {

    }

    @Override
    public Point getPosition() {
        return null;
    }

    @Override
    public double getWidth() {
        return 0;
    }

    @Override
    public double getHeight() {
        return 0;
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

    }

    @Override
    public void resizeTo(Point point) {

    }

    @Override
    public Shape peel() {
        return null;
    }
}
