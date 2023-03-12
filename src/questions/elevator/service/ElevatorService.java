package questions.elevator.service;

import questions.elevator.entity.Elevator;
import questions.elevator.entity.Floor;

import java.util.List;

public class ElevatorService {
    private Elevator elevator;
    private List<Floor> pendingRequests;

    private DirectionService directionService;

    public ElevatorService(Elevator elevator) {
        this.elevator = elevator;
        directionService = new DirectionService();
    }

    public void requestElevator(Floor destinationFloor) {

    }
}
