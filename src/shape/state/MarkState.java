package shape.state;

import shape.*;

import java.util.List;

public class MarkState extends State{

    private List<Shape> shapes;

    public MarkState(ShapeContainer container) {
        super(container);
        shapes = container.getShapeList();
    }

    @Override
    public void pointerDown(Point point) {
        container.select(point);
        Shape selected = container.getSelected();
        if(selected != null) {
            Shape markedShape = new CrossDecorator(selected);
            shapes.remove(selected);
            shapes.add(markedShape);
            container.repaint();
        }
    }

    @Override
    public void pointerUp(Point point) {
        container.setSelected(null);
    }

    @Override
    public void pointerMoved(Point point, Shape selected) {
        //Not needed here
    }
}
