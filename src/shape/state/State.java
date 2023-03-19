package shape.state;

import shape.Point;
import shape.Shape;
import shape.ShapeContainer;

public abstract class State {
    protected ShapeContainer container;

    public State(ShapeContainer container) {
        this.container = container;
    }

    public abstract void pointerDown(Point point);
    public abstract void pointerUp(Point point);
    public abstract void pointerMoved(Point point, Shape selected);

}
