package chainOfResponsibility;

import chainOfResponsibility.entity.*;

public class ChainOfResponsibilityApplication {
    public static void main(String[] args) {

        Handler thirdHandler = new HandlerImplC();
        Handler secondHandler = new HandlerImplB();
        Handler firstHandler = new HandlerImplA();

        firstHandler.setNextHandler(secondHandler);
        secondHandler.setNextHandler(thirdHandler);

        Request request = new Request("HandlerImplD");

        firstHandler.handleRequest(request);
    }
}
