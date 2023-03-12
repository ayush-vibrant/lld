package questions.elevator;

import questions.elevator.entity.Floor;
import questions.elevator.manager.BuildingManager;
import questions.elevator.service.FloorService;

import java.util.ArrayList;
import java.util.List;

public class ElevatorApplication {
    public static void main(String[] args) {
        List<Floor> floorList = getFloorList(10);
        BuildingManager buildingManager = new BuildingManager(floorList);

        Floor currentFloor = floorList.get(5);
        FloorService floorService = new FloorService(currentFloor); // current floor is destination floor for an elevator
        // what will be it's return type?
        floorService.getButton().pressButton();
        floorService.requestElevator(1);


    }

    private static List<Floor> getFloorList(int numberOfFloors) {
        List<Floor> floorList = new ArrayList<>();
        for (int i = 0; i < numberOfFloors; i++) {
            floorList.add(new Floor(i));
        }
        return floorList;
    }
}
