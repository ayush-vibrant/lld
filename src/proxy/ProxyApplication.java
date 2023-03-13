package proxy;

import proxy.entity.RealObject;
import proxy.entity.RealObjectProxy;
import proxy.entity.Request;
import proxy.entity.Role;

public class ProxyApplication {
    public static void main(String[] args) {
        Request adminRequest = new Request(Role.ADMIN);
        Request normalRequest = new Request(Role.NORMAL_USER);

        RealObject realObject = new RealObjectProxy();
        realObject.doSomething(adminRequest);
        realObject.doSomething(normalRequest);

        realObject.doSomethingElse(adminRequest);
        realObject.doSomethingElse(normalRequest);

        realObject.doSomethingDifferentNow(adminRequest);
        realObject.doSomethingDifferentNow(normalRequest);
    }
}
