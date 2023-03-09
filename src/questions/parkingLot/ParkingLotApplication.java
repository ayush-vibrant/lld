package questions.parkingLot;

import questions.parkingLot.entity.gates.EntryGate;
import questions.parkingLot.entity.gates.ExitGate;
import questions.parkingLot.entity.ticket.Ticket;
import questions.parkingLot.entity.vehicle.Vehicle;
import questions.parkingLot.entity.vehicle.VehicleType;
import questions.parkingLot.entity.vehicle.vehicleFactory.VehicleFactory;

public class ParkingLotApplication {
    public static void main(String[] args) {
        // Question: When to use static methods and when to use instance methods?
        Vehicle twoWheelerVehicle = VehicleFactory.getVehicle("MH-12-AB-1234", VehicleType.TWO_WHEELER);
        Vehicle fourWheelerVehicle = VehicleFactory.getVehicle("RJ-14-SB-7123", VehicleType.FOUR_WHEELER);

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
