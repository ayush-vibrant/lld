package questions.elevator.entity;

import questions.elevator.manager.ElevatorServiceManager;
import questions.elevator.service.ElevatorService;

public class ExternalButton extends Button {
    @Override
    public void pressButton(Floor destinationFloor, int elevatorId) {
        ElevatorService elevatorService = ElevatorServiceManager.getElevatorServiceById(elevatorId);
        elevatorService.requestElevator(destinationFloor);
    }
}

