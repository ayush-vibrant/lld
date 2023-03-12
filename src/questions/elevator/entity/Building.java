package questions.elevator.entity;

import java.util.List;

public class Building {
    private List<Floor> floorList;

    public List<Floor> getFloorList() {
        return floorList;
    }

    public void setFloorList(List<Floor> floorList) {
        this.floorList = floorList;
    }
}
