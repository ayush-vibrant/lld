package questions.elevator.entity;

public class Elevator {
    private final int elevatorId;
    Status currentStatus;
    Button internalButton;
    Display display;

    // TODO: Add other fields in constructor
    public Elevator(int elevatorId) {
        this.elevatorId = elevatorId;
    }
}
