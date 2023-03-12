package questions.elevator.manager;

import questions.elevator.service.ElevatorService;

import java.util.List;

public class ElevatorServiceManager {
    static List<ElevatorService> elevatorServiceList;

    public static ElevatorService getElevatorServiceById(int elevatorId) {
        return elevatorServiceList.get(elevatorId);
    }
}
