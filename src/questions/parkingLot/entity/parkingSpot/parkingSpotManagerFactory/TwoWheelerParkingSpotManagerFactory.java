package questions.parkingLot.entity.parkingSpot.parkingSpotManagerFactory;

import questions.parkingLot.entity.parkingSpot.parkingSpotManager.ParkingSpotManager;
import questions.parkingLot.entity.parkingSpot.parkingSpotManager.TwoWheelerParkingSpotManager;
import questions.parkingLot.entity.vehicle.Vehicle;

public class TwoWheelerParkingSpotManagerFactory extends ParkingSpotManagerFactory {
    @Override
    public ParkingSpotManager getParkingSpotManager(Vehicle vehicle) {
        return TwoWheelerParkingSpotManager.getInstance();
    }
}
