package questions.parkingLot.entity.parkingSpot;

import questions.parkingLot.entity.parkingSpot.ParkingSpot;
import questions.parkingLot.entity.parkingSpot.parkingSpotManager.ParkingSpotManager;
import questions.parkingLot.entity.parkingSpot.parkingSpotManagerFactory.ParkingSpotManagerFactory;
import questions.parkingLot.entity.vehicle.Vehicle;

public class ParkingSpotFinder {
    public static ParkingSpot findParkingSpot(Vehicle vehicle) {
        ParkingSpotManagerFactory parkingSpotManagerFactory = ParkingSpotManagerFactory.getFactory(vehicle);
        ParkingSpotManager parkingSpotManager = parkingSpotManagerFactory.getParkingSpotManager(vehicle);
        return parkingSpotManager.getParkingSpot(vehicle);
    }
}