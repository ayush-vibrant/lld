package questions.parkingLot.entity.parkingSpot.parkingSpotManager;

import questions.parkingLot.entity.parkingSpot.ParkingSpot;
import questions.parkingLot.entity.vehicle.Vehicle;
import questions.parkingLot.entity.vehicle.VehicleType;

import java.util.List;

public class FourWheelerParkingSpotManager implements ParkingSpotManager {
    private List<ParkingSpot> parkingSpotList;

    // You might need to instansiate this list in the constructor

    public FourWheelerParkingSpotManager(List<ParkingSpot> parkingSpotList) {
        this.parkingSpotList = parkingSpotList;
    }
    @Override
    public void addParkingSpot(ParkingSpot parkingSpot) {
        parkingSpotList.add(parkingSpot);
    }

    @Override
    public void removeParkingSpot(ParkingSpot parkingSpot) {
        parkingSpotList.remove(parkingSpot);
    }

    @Override
    public ParkingSpot getParkingSpot(Vehicle vehicle) {
        if (vehicle.getVehicleType() == VehicleType.FOUR_WHEELER) {
            for (ParkingSpot parkingSpot : parkingSpotList) {
                if (parkingSpot.isAvailable()) {
                    return parkingSpot;
                }
            }
            throw new IllegalArgumentException("No parking spot available");
        }
        else throw new IllegalArgumentException("Vehicle type is not four wheeler");
    }

    @Override
    public boolean parkVehicle(ParkingSpot parkingSpot, Vehicle vehicle) {
        return parkingSpot.parkVehicle(vehicle);
    }

    @Override
    public boolean removeVehicle(ParkingSpot parkingSpot) {
        return parkingSpot.removeVehicle();
    }

}
