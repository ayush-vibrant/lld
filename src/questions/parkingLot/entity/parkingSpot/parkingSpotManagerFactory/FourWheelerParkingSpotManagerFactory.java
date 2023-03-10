package questions.parkingLot.entity.parkingSpot.parkingSpotManagerFactory;

import questions.parkingLot.entity.parkingSpot.parkingSpotManager.FourWheelerParkingSpotManager;
import questions.parkingLot.entity.parkingSpot.parkingSpotManager.ParkingSpotManager;
import questions.parkingLot.entity.vehicle.Vehicle;

public class FourWheelerParkingSpotManagerFactory extends ParkingSpotManagerFactory {
    @Override
    public ParkingSpotManager getParkingSpotManager(Vehicle vehicle) {
        return FourWheelerParkingSpotManager.getInstance();
    }
}
