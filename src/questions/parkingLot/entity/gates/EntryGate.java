package questions.parkingLot.entity.gates;

import questions.parkingLot.entity.parkingSpot.parkingSpotManager.ParkingSpotManager;
import questions.parkingLot.entity.parkingSpot.parkingSpotManagerFactory.ParkingSpotManagerFactory;
import questions.parkingLot.entity.parkingSpot.ParkingSpot;
import questions.parkingLot.entity.ticket.Ticket;
import questions.parkingLot.entity.vehicle.Vehicle;

public class EntryGate {
    private EntryGate() {
    }

    public static ParkingSpot findParkingSpot(Vehicle vehicle) {
        ParkingSpotManagerFactory.getFactory(vehicle).getParkingSpotManager(vehicle);
        ParkingSpotManager parkingSpotManager = ParkingSpotManagerFactory.getFactory(vehicle).getParkingSpotManager(vehicle);
        return parkingSpotManager.getParkingSpot(vehicle);
    }

    public static Ticket parkAndGenerateTicket(Vehicle vehicle) {
        ParkingSpot parkingSpot = findParkingSpot(vehicle);
        ParkingSpotManager parkingSpotManager = ParkingSpotManagerFactory.getFactory(vehicle).getParkingSpotManager(vehicle);
        parkingSpotManager.parkVehicle(parkingSpot, vehicle);
        return Ticket.generateTicket(vehicle, parkingSpot);
    }
}
