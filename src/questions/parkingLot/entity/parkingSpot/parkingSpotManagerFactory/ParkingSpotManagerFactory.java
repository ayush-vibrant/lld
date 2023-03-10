package questions.parkingLot.entity.parkingSpot.parkingSpotManagerFactory;

import questions.parkingLot.entity.parkingSpot.parkingSpotManager.FourWheelerParkingSpotManager;
import questions.parkingLot.entity.parkingSpot.parkingSpotManager.ParkingSpotManager;
import questions.parkingLot.entity.parkingSpot.parkingSpotManager.TwoWheelerParkingSpotManager;
import questions.parkingLot.entity.vehicle.Vehicle;

import java.util.ArrayList;

public abstract class ParkingSpotManagerFactory {
    public abstract ParkingSpotManager getParkingSpotManager(Vehicle vehicle);

    public static ParkingSpotManagerFactory getFactory(Vehicle vehicle) {
        switch (vehicle.getVehicleType()) {
            case TWO_WHEELER:
                return new TwoWheelerParkingSpotManagerFactory();
            case FOUR_WHEELER:
                return new FourWheelerParkingSpotManagerFactory();
            default:
                throw new IllegalArgumentException("Invalid vehicle type in vehicle");
        }
    }
}
