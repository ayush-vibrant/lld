package chainOfResponsibility;

public abstract class Handler {
    Handler nextHandler;

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract void handleRequest(Request request);

    public abstract boolean canHandleOrNot(Request request);

}
