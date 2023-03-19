package shape.state;

import shape.Point;
import shape.Shape;
import shape.ShapeContainer;

import java.util.List;

public class DeleteState extends State{

    private List<Shape> shapes;

    public DeleteState(ShapeContainer container) {
        super(container);
        shapes = container.getShapeList();
    }

    @Override
    public void pointerDown(Point point) {
        container.select(point);
        Shape selected = container.getSelected();
        if(selected != null) {
            shapes.remove(selected);
            container.setSelected(null);
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
