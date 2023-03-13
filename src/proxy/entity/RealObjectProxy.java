package proxy.entity;

public class RealObjectProxy implements RealObject {
    private RealObject concreteRealObject;

    public RealObjectProxy() {
        this.concreteRealObject = new ConcreteRealObject();
    }

    @Override
    public void doSomething(Request request) {
        if (request.getRole() == Role.ADMIN) {
            concreteRealObject.doSomething(request);
        } else {
            System.out.println("You are not authorized to do this");
        }

    }

    @Override
    public void doSomethingElse(Request request) {
        if (request.getRole() == Role.ADMIN) {
            concreteRealObject.doSomethingElse(request);
        } else {
            System.out.println("You are not authorized to do this");
        }
    }

    @Override
    public void doSomethingDifferentNow(Request request) {
        if (request.getRole() == Role.ADMIN) {
            concreteRealObject.doSomethingDifferentNow(request);
        } else {
            System.out.println("You are not authorized to do this");
        }
    }

}
