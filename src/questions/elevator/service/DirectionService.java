package questions.elevator.service;

import questions.elevator.entity.Direction;
import questions.elevator.entity.Floor;

public class DirectionService {
    public static Direction getDirection(Floor currentFloor, Floor destinationFloor) {
        if (currentFloor.getFloorNumber() < destinationFloor.getFloorNumber()) {
            return Direction.UP;
        } else if (currentFloor.getFloorNumber() > destinationFloor.getFloorNumber()) {
            return Direction.DOWN;
        } else {
            return null;
        }
    }
}
