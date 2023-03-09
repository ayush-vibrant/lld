package questions.parkingLot.entity.parkingSpot;

import questions.parkingLot.entity.vehicle.Vehicle;

public interface ParkingSpot {
    public boolean parkVehicle(Vehicle vehicle);

    public boolean removeVehicle();

    public boolean isAvailable();
    public double getPrice();
}
