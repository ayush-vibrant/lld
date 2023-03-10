package questions.parkingLot.entity.gates;

import questions.parkingLot.entity.ticket.ParkingPriceCalculator;
import questions.parkingLot.entity.parkingSpot.parkingSpotManager.ParkingSpotManager;
import questions.parkingLot.entity.parkingSpot.parkingSpotManagerFactory.ParkingSpotManagerFactory;
import questions.parkingLot.entity.ticket.Ticket;

public class ExitGate {

    private Ticket ticket;
    private ParkingPriceCalculator parkingPriceCalculator;

    public ExitGate(Ticket ticket) {
        this.ticket = ticket;
        this.parkingPriceCalculator = new ParkingPriceCalculator(ticket);
    }

    public double exit() {
        ParkingSpotManager parkingSpotManager = ParkingSpotManagerFactory.getFactory(ticket.getVehicle())
                .getParkingSpotManager(ticket.getVehicle());
        boolean isRemoved = parkingSpotManager.removeVehicle(ticket.getParkingSpot());
        if (isRemoved)
            return calculateCharges();
        else
            throw new IllegalArgumentException("Vehicle not removed");
    }


    public double calculateCharges() {
        /*
         * Important: Whenever you see a lot of new() calls in your code, Think of this ::
         * Instead of instantiating a new ParkingPriceCalculator object every time the calculateCharges method is called,
         * we pass the Ticket object to the constructor of ExitGate,
         * and store a reference to the ParkingPriceCalculator object as an instance variable.
         * Then, we call the calculateCharges method on that instance variable.
         * This reduces the number of objects created and makes your code more efficient.
         */
        return parkingPriceCalculator.calculateCharges();
    }
}
