package questions.elevator.entity;

public class InternalButton extends Button {

    //TODO: Would be removed!!
    private Floor floor;

    public InternalButton(Floor floor) {
        this.floor = floor;
    }

    @Override
    public void pressButton(Floor destinationFloor, int elevatorId) {
        System.out.println("Internal button pressed for floor " + floor.getFloorNumber());
    }
}
