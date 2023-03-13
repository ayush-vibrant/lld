package proxy.entity;

public class Request {
    private final Role role;

    public Request(Role role) {
        this.role = role;
    }

    public Role getRole() {
        return role;
    }
}
