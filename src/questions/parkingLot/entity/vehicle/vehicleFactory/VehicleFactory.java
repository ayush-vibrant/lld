package questions.parkingLot.entity.vehicle.vehicleFactory;

import questions.parkingLot.entity.vehicle.FourWheelerVehicle;
import questions.parkingLot.entity.vehicle.TwoWheelerVehicle;
import questions.parkingLot.entity.vehicle.Vehicle;
import questions.parkingLot.entity.vehicle.VehicleType;

public class VehicleFactory {
    static Vehicle vehicle;

    public static Vehicle getVehicle(String licensePlate, VehicleType vehicleType) {
        if (vehicleType == VehicleType.TWO_WHEELER) {
            vehicle = new TwoWheelerVehicle(licensePlate);
        } else if (vehicleType == VehicleType.FOUR_WHEELER) {
            vehicle = new FourWheelerVehicle(licensePlate);
        }
        return vehicle;
    }

}
