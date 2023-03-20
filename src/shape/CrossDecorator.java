package shape;

import java.awt.*;

public class CrossDecorator implements Shape{

    private Shape decoratee;

    public CrossDecorator(Shape decoratee) {
        this.decoratee = decoratee;
    }
    @Override
    public void draw(Graphics g) {
        decoratee.draw(g);
        Point position = decoratee.getPosition();
        int x = (int) (position.getX());

        int y = (int) (position.getY());


        g.drawLine((int)(x-(decoratee.getWidth()/2)), y, (int)(x +(decoratee.getWidth()/2)), y);
        g.drawLine(x, (int)(y-(decoratee.getHeight()/2)), x, (int)(y+(decoratee.getHeight()/2)));
    }

    @Override
    public Point getPosition()
    {
        return decoratee.getPosition();
    }
    @Override
    public double getWidth()
    {
        return decoratee.getWidth();
    }
    @Override
    public double getHeight()
    {
        return decoratee.getHeight();
    }
    @Override
    public boolean intersects(Point point)
    {
        return decoratee.intersects(point);
    }
    @Override
    public void moveTo(Point point)
    {
        decoratee.moveTo(point);
    }
    @Override
    public void move(double dx, double dy)
    {
        decoratee.move(dx, dy);
    }
    @Override
    public void resizeTo(Point point)
    {
        decoratee.resizeTo(point);
    }
    @Override
    public Shape peel()
    {
        return decoratee;
    }
}
