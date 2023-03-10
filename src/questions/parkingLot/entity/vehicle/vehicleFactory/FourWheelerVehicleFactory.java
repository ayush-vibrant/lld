package questions.parkingLot.entity.vehicle.vehicleFactory;

import questions.parkingLot.entity.vehicle.FourWheelerVehicle;
import questions.parkingLot.entity.vehicle.Vehicle;

public class FourWheelerVehicleFactory extends VehicleFactory {
    @Override
    public Vehicle getVehicle(String licensePlate) {
        return new FourWheelerVehicle(licensePlate);
    }
}
