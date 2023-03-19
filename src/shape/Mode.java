package shape;

import shape.state.*;

public enum Mode {
    INSERT {
        public State getState(ShapeContainer container) {
            return new InsertState(container);
        }
    },
    MOVE {
        public State getState(ShapeContainer container) {
            return new MoveState(container);
        }
    },
    DELETE {
        public State getState(ShapeContainer container) {
            return new DeleteState(container);
        }
    },
    MARK {
        public State getState(ShapeContainer container) {
            return new MarkState(container);
        }
    },
    UNMARK {
        public State getState(ShapeContainer container) {
            return new UnmarkState(container);
        }
    },
    RESIZE{
        public State getState(ShapeContainer container) {
            return new ResizeState(container);
        }
    };
    public abstract State getState(ShapeContainer container);
}
