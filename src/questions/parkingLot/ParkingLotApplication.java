package questions.parkingLot;

import questions.parkingLot.entity.gates.EntryGate;
import questions.parkingLot.entity.gates.ExitGate;
import questions.parkingLot.entity.parkingSpot.FourWheelerParkingSpot;
import questions.parkingLot.entity.parkingSpot.TwoWheelerParkingSpot;
import questions.parkingLot.entity.parkingSpot.parkingSpotManager.ParkingSpotManager;
import questions.parkingLot.entity.parkingSpot.parkingSpotManagerFactory.ParkingSpotManagerFactory;
import questions.parkingLot.entity.ticket.Ticket;
import questions.parkingLot.entity.vehicle.Vehicle;
import questions.parkingLot.entity.vehicle.VehicleType;
import questions.parkingLot.entity.vehicle.vehicleFactory.VehicleFactory;

public class ParkingLotApplication {
    public static void main(String[] args) {
        // Question: When to use static methods and when to use instance methods?
        Vehicle twoWheelerVehicle = VehicleFactory.getFactory(VehicleType.TWO_WHEELER).getVehicle("MH-12-AB-1234");
        Vehicle fourWheelerVehicle = VehicleFactory.getFactory(VehicleType.FOUR_WHEELER).getVehicle("RJ-14-SB-7123");

        ParkingSpotManager parkingSpotManagerForTwoWheeler = ParkingSpotManagerFactory
                .getFactory(twoWheelerVehicle)
                .getParkingSpotManager(twoWheelerVehicle);
        // TODO: You should not directly use concrete classes like TwoWheelerParkingSpot
        parkingSpotManagerForTwoWheeler.addParkingSpot(new TwoWheelerParkingSpot("A1", twoWheelerVehicle));

        ParkingSpotManager parkingSpotManagerForFourWheeler = ParkingSpotManagerFactory
                .getFactory(fourWheelerVehicle)
                .getParkingSpotManager(fourWheelerVehicle);
        parkingSpotManagerForFourWheeler.addParkingSpot(new FourWheelerParkingSpot("B2", fourWheelerVehicle));


        // Question: When to use static methods and when to use instance methods?
        Ticket ticketForTwoWheeler = EntryGate.parkAndGenerateTicket(twoWheelerVehicle);
        Ticket ticketForFourWheeler = EntryGate.parkAndGenerateTicket(fourWheelerVehicle);

        // Question: When to use static methods and when to use instance methods?
        ExitGate exitGateForTwoWheeler = new ExitGate(ticketForTwoWheeler);
        double amountDueForTwoWheeler = exitGateForTwoWheeler.exit();
        System.out.println("Amount due: " + amountDueForTwoWheeler);

        ExitGate exitGate = new ExitGate(ticketForFourWheeler);
        double amountDue = exitGate.exit();
        System.out.println("Amount due: " + amountDue);
    }
}
