package questions.parkingLot.entity.vehicle.vehicleFactory;

import questions.parkingLot.entity.vehicle.Vehicle;
import questions.parkingLot.entity.vehicle.VehicleType;

public abstract class VehicleFactory {
    /*
     * By using an interface or an abstract class,
     * you can define a contract that all factory implementations must adhere to,
     * ensuring consistency across different factory implementations.
     * Additionally, this approach allows you to create different factory implementations for different situations,
     * each with their own specific logic for creating objects.
     * For example, in the case of the VehicleFactory class,
     * you could have different implementations for creating different types of vehicles
     * or for handling different input parameters.
     * This can be especially useful in large and complex systems
     * where there are many different types of objects that need to be created.
     */
    public abstract Vehicle getVehicle(String licensePlate);

    public static VehicleFactory getFactory(VehicleType vehicleType) {
        switch (vehicleType) {
            case TWO_WHEELER:
                return new TwoWheelerVehicleFactory();
            case FOUR_WHEELER:
                return new FourWheelerVehicleFactory();
            default:
                throw new IllegalArgumentException("Invalid vehicle type");
        }
    }

}
