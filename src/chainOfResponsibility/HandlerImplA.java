package chainOfResponsibility;

public class HandlerImplA extends Handler {
    @Override
    public void handleRequest(Request request) {
        if (canHandleOrNot(request)) {
            System.out.println("HandlerImplA can handle this request");
        } else if (nextHandler != null) {
            System.out.println("HandlerImplA can't handle this request");
            // added super only so you can understand the code better, otherwise not needed
            super.nextHandler.handleRequest(request);
        } else {
            System.out.println("No handler can handle this request");
        }
    }

    @Override
    public boolean canHandleOrNot(Request request) {
        return "HandlerImplA".equals(request.getRequestType());
    }
}
