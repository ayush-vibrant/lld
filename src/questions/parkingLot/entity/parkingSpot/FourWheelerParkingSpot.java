package questions.parkingLot.entity.parkingSpot;

import questions.parkingLot.entity.vehicle.Vehicle;
import questions.parkingLot.entity.vehicle.VehicleType;

public class FourWheelerParkingSpot implements ParkingSpot {
    private String spotNumber;
    private VehicleType vehicleType = VehicleType.FOUR_WHEELER;
    private Vehicle vehicle;
    private boolean isAvailable = true;
    private double price = 20.0;

    public FourWheelerParkingSpot() {
    }


    public FourWheelerParkingSpot(String spotNumber, Vehicle vehicle) {
        this.spotNumber = spotNumber;
        this.vehicle = vehicle;
    }

    @Override
    public boolean parkVehicle(Vehicle vehicle) {
        if (vehicle.getVehicleType() == VehicleType.FOUR_WHEELER && isAvailable) {
            this.vehicle = vehicle;
            isAvailable = false;
            return true;
        } else return false;
    }

    @Override
    public boolean removeVehicle() {
        if (!isAvailable) {
            this.vehicle = null;
            isAvailable = true;
            return true;
        } else return false;
    }

    @Override
    public boolean isAvailable() {
        return isAvailable;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
