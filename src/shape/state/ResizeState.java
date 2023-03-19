package shape.state;

import shape.Point;
import shape.Shape;
import shape.ShapeContainer;

public class ResizeState extends State{

    public ResizeState(ShapeContainer container) {
        super(container);
    }

    @Override
    public void pointerDown(Point point) {
        container.select(point);
    }

    @Override
    public void pointerUp(Point point) {
        container.setSelected(null);
    }

    @Override
    public void pointerMoved(Point point, Shape selected) {
        selected.resizeTo(point);
        container.repaint();
    }
}
