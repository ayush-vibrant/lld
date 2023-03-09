package questions.parkingLot.entity.vehicle;

public class TwoWheelerVehicle implements Vehicle {
    private String licensePlate;
    private VehicleType vehicleType;

    public TwoWheelerVehicle(String licensePlate) {
        this.licensePlate = licensePlate;
        this.vehicleType = VehicleType.TWO_WHEELER;
    }

    @Override
    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }
}
