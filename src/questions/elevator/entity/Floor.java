package questions.elevator.entity;

public class Floor {
    private int floorNumber;
    private Button externalButton;

    public Floor(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    public void requestElevator(Floor destinationFloor, int elevatorId) {
        externalButton.pressButton(destinationFloor, elevatorId);
    }
}
