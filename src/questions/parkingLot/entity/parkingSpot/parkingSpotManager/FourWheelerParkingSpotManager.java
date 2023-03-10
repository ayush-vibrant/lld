package questions.parkingLot.entity.parkingSpot.parkingSpotManager;

import questions.parkingLot.entity.parkingSpot.ParkingSpot;
import questions.parkingLot.entity.vehicle.Vehicle;
import questions.parkingLot.entity.vehicle.VehicleType;

import java.util.ArrayList;
import java.util.List;

public class FourWheelerParkingSpotManager implements ParkingSpotManager {
    private List<ParkingSpot> parkingSpotList;
    public static FourWheelerParkingSpotManager instance = null;

    private FourWheelerParkingSpotManager() {
    }

    public static FourWheelerParkingSpotManager getInstance() {
        if (instance == null) {
            instance = new FourWheelerParkingSpotManager(new ArrayList<>(400));
        }
        return instance;
    }


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
        } else throw new IllegalArgumentException("Vehicle type is not four wheeler");
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
