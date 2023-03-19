package shape.state;

import shape.Circle;
import shape.Point;
import shape.Shape;
import shape.ShapeContainer;

public class InsertState extends State{

    public InsertState(ShapeContainer container) {
        super(container);
    }

    @Override
    public void pointerDown(Point point) {
        container.addShape(new Circle(point, Math.random() * 50.0));
        container.repaint();
    }

    @Override
    public void pointerUp(Point point) {
        container.setSelected(null);
    }

    @Override
    public void pointerMoved(Point point, Shape selected) {
        // Not needed for this
    }
}
