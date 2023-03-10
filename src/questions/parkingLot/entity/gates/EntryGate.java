package questions.parkingLot.entity.gates;

import questions.parkingLot.entity.parkingSpot.ParkingSpotFinder;
import questions.parkingLot.entity.parkingSpot.parkingSpotManager.ParkingSpotManager;
import questions.parkingLot.entity.parkingSpot.parkingSpotManagerFactory.ParkingSpotManagerFactory;
import questions.parkingLot.entity.parkingSpot.ParkingSpot;
import questions.parkingLot.entity.ticket.Ticket;
import questions.parkingLot.entity.vehicle.Vehicle;

public class EntryGate {
    private EntryGate() {
    }

    public static Ticket parkAndGenerateTicket(Vehicle vehicle) {
        ParkingSpot parkingSpot = findParkingSpot(vehicle);
        parkVehicle(vehicle, parkingSpot);
        return Ticket.generateTicket(vehicle, parkingSpot);
    }

    private static void parkVehicle(Vehicle vehicle, ParkingSpot parkingSpot) {
        ParkingSpotManager parkingSpotManager = ParkingSpotManagerFactory.getFactory(vehicle).getParkingSpotManager(vehicle);
        parkingSpotManager.parkVehicle(parkingSpot, vehicle);
    }

    public static ParkingSpot findParkingSpot(Vehicle vehicle) {
        return ParkingSpotFinder.findParkingSpot(vehicle);
    }
}
