package questions.elevator.service;

import questions.elevator.entity.Button;
import questions.elevator.entity.Floor;

public class FloorService {
    private Floor floor;

    public FloorService(Floor floor) {
        this.floor = floor;
    }

    public void requestElevator(int elevatorId) {
        // should this call not be to buttonService directly?
        floor.requestElevator(this.floor, elevatorId);
    }

//    public Button getButton() {
//        return floor.();
//    }

}
