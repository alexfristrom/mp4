package shape.state;

import shape.Point;
import shape.Shape;
import shape.ShapeContainer;

import java.util.List;

public class UnmarkState extends State{

    private List<Shape> shapes;

    public UnmarkState(ShapeContainer container) {
        super(container);
        shapes = container.getShapeList();
    }

    @Override
    public void pointerDown(Point point) {
        container.select(point);
        Shape selected = container.getSelected();
        if(selected != null) {
            Shape unmarkedShape = selected.peel();
            shapes.remove(selected);
            shapes.add(unmarkedShape);
            container.repaint();
        }
    }

    @Override
    public void pointerUp(Point point) {
        container.setSelected(null);
    }

    @Override
    public void pointerMoved(Point point, Shape selected) {
        // Not needed here
    }
}
