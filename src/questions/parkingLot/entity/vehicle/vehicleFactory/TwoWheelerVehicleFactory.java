package questions.parkingLot.entity.vehicle.vehicleFactory;

import questions.parkingLot.entity.vehicle.TwoWheelerVehicle;
import questions.parkingLot.entity.vehicle.Vehicle;

public class TwoWheelerVehicleFactory extends VehicleFactory {
    @Override
    public Vehicle getVehicle(String licensePlate) {
        return new TwoWheelerVehicle(licensePlate);
    }
}
