package chainOfResponsibility.entity;

public class HandlerImplC extends Handler {
    @Override
    public void handleRequest(Request request) {
        if (canHandleOrNot(request)) {
            System.out.println("HandlerImplC can handle this request");
        } else if (nextHandler != null) {
            System.out.println("HandlerImplC can't handle this request");
            nextHandler.handleRequest(request);
        } else {
            System.out.println("No handler can handle this request");
        }
    }

    @Override
    public boolean canHandleOrNot(Request request) {
        return "HandlerImplC".equals(request.getRequestType());
    }

}
