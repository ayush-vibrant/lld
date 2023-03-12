package chainOfResponsibility;

public class HandlerImplB extends Handler {
    @Override
    public void handleRequest(Request request) {
        if (canHandleOrNot(request)) {
            System.out.println("HandlerImplB can handle this request");
        } else if (nextHandler != null) {
            System.out.println("HandlerImplB can't handle this request");
            nextHandler.handleRequest(request);
        } else {
            System.out.println("No handler can handle this request");
        }
    }

    @Override
    public boolean canHandleOrNot(Request request) {
        return "HandlerImplB".equals(request.getRequestType());
    }

}
