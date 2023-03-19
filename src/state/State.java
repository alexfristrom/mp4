package state;

public abstract class State {
    ShapeContainer container;

    public State(ShapeContainer container) {
        this.container = container;
    }

}
