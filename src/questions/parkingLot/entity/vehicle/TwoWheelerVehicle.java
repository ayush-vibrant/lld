package questions.parkingLot.entity.vehicle;

public class TwoWheelerVehicle implements Vehicle {
    /*
    licensePlate and vehicleType variables final in the FourWheelerVehicle class
    because they are immutable properties of a vehicle.
    Once a vehicle is created, its license plate and type should not be changed.
    By making these variables final, you ensure that their values are set only once,
    during object creation, and cannot be changed afterwards.
    This helps to prevent accidental or malicious modification of these properties
    and makes the class more robust and less error-prone.
     */
    private final String licensePlate;
    private final VehicleType vehicleType;

    public TwoWheelerVehicle(String licensePlate) {
        this.licensePlate = licensePlate;
        this.vehicleType = VehicleType.TWO_WHEELER;
    }

    @Override
    public String getLicensePlate() {
        return licensePlate;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    @Override
    public String toString() {
        return "TwoWheelerVehicle{" +
                "licensePlate='" + licensePlate + '\'' +
                ", vehicleType=" + vehicleType +
                '}';
    }
}
