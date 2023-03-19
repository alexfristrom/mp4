package shape;

import shape.ShapeDecorator;
import shape.state.*;

import java.awt.*;
import java.util.LinkedList;
import java.util.List;

import javax.swing.JPanel;

public class ShapeContainer extends JPanel implements Pointable {
    private static final long serialVersionUID = 1L;
    private List<Shape> shapes = new LinkedList<Shape>();
    private State state = new InsertState(this);


    public static Mode mode = Mode.INSERT;
    private Shape selected;

    public ShapeContainer() {
        super();
        MouseHandler mouseHandler = new MouseHandler(this);
        this.addMouseListener(mouseHandler);
        this.addMouseMotionListener(mouseHandler);
        this.setBackground(Color.white);
    }

    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    public void paintComponent(Graphics g) // anropas av Swing när det är dags att
    // rendera
    {
        super.paintComponent(g);

        for (Shape shape : shapes)
            shape.draw(g);

    }

    public void select(Point point) {
        for (Shape shape : shapes) {
            if (shape.intersects(point)) {
                selected = shape;
                return;
            }
        }
    }

    public void pointerDown(Point point) {
        state.pointerDown(point);
    }

    public void pointerUp(Point point) {
        state.pointerUp(point);
    }

    public void pointerMoved(Point point, boolean pointerDown) {
        if (selected != null && pointerDown) {
            state.pointerMoved(point, selected);
        }
    }

    public void setMode(Mode mode) {
        this.mode = mode;
        state = mode.getState(this);
    }

    public void setSelected(Shape shape) {
        selected = shape;
    }

    public Shape getSelected() {
        return selected;
    }

    public List<Shape> getShapeList(){
        return shapes;
    }

}
