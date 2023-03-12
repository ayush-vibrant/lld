package questions.elevator.manager;

import questions.elevator.entity.Floor;

import java.util.List;

public class BuildingManager {
    List<Floor> floorList;

    public BuildingManager(List<Floor> floorList) {
        this.floorList = floorList;
    }

    public void addFloor(Floor floor) {
        floorList.add(floor);
    }
}
