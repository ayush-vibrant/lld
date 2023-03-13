package proxy.entity;

public class ConcreteRealObject implements RealObject {
    @Override
    public void doSomething(Request request) {
        System.out.println("Doing something for " + request.getRole() + " role");
    }

    @Override
    public void doSomethingElse(Request request) {
        System.out.println("Doing something else " + request.getRole() + " role");
    }

    @Override
    public void doSomethingDifferentNow(Request request) {
        System.out.println("Doing something different now " + request.getRole() + " role");
    }
}
