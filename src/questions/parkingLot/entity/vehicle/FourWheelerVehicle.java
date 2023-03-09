package questions.parkingLot.entity.vehicle;

public class FourWheelerVehicle implements Vehicle {
    private String licensePlate;
    private VehicleType vehicleType;

    public FourWheelerVehicle(String licensePlate) {
        this.licensePlate = licensePlate;
        this.vehicleType = VehicleType.FOUR_WHEELER;
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
