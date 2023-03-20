package shape.state;

import shape.*;

public class InsertState extends State{

    public InsertState(ShapeContainer container) {
        super(container);
    }

    @Override
    public void pointerDown(Point point) {
        double xd = Math.random() * 10;
        if(xd > 5){
            container.addShape(new Circle(point, Math.random() * 50.0));
        } else{
            container.addShape(new Rectangle(point, (Math.random() + 0.2) * 50.0, (Math.random() + 0.2) * 50.0));
        }
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
