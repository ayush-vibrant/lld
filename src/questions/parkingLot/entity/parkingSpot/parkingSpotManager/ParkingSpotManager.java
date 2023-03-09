package questions.parkingLot.entity.parkingSpot.parkingSpotManager;

import questions.parkingLot.entity.parkingSpot.ParkingSpot;
import questions.parkingLot.entity.vehicle.Vehicle;

public interface ParkingSpotManager {
    public void addParkingSpot(ParkingSpot parkingSpot);

    public void removeParkingSpot(ParkingSpot parkingSpot);

    public ParkingSpot getParkingSpot(Vehicle vehicle);

    public boolean parkVehicle(ParkingSpot parkingSpot, Vehicle vehicle);

    public boolean removeVehicle(ParkingSpot parkingSpot);

}
