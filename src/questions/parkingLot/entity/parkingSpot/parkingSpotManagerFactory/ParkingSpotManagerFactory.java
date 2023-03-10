package questions.parkingLot.entity.parkingSpot.parkingSpotManagerFactory;

import questions.parkingLot.entity.parkingSpot.parkingSpotManager.FourWheelerParkingSpotManager;
import questions.parkingLot.entity.parkingSpot.parkingSpotManager.ParkingSpotManager;
import questions.parkingLot.entity.parkingSpot.parkingSpotManager.TwoWheelerParkingSpotManager;
import questions.parkingLot.entity.vehicle.Vehicle;

import java.util.ArrayList;

public class ParkingSpotManagerFactory {
    static ParkingSpotManager parkingSpotManager;

    public static ParkingSpotManager getParkingSpotManager(Vehicle vehicle) {
        switch (vehicle.getVehicleType()) {
            case TWO_WHEELER:
                parkingSpotManager = TwoWheelerParkingSpotManager.getInstance();
                break;
            case FOUR_WHEELER:
                parkingSpotManager = FourWheelerParkingSpotManager.getInstance();
                break;
            default:
                throw new IllegalArgumentException("Invalid vehicle type");
        }
        return parkingSpotManager;
    }
}
