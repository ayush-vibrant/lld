package questions.parkingLot.entity.gates;

import questions.parkingLot.entity.ticket.PricingStrategy;
import questions.parkingLot.entity.ticket.PricingStrategyFactory;
import questions.parkingLot.entity.ticket.Ticket;

public class ExitGate {

    Ticket ticket;

    public ExitGate(Ticket ticket) {
        this.ticket = ticket;
    }

    public double exit() {
        boolean isRemoved = ticket.getParkingSpot().removeVehicle();
        if (isRemoved)
            return calculateCharges();
        else
            throw new IllegalArgumentException("Vehicle not removed");
    }


    public double calculateCharges() {
        PricingStrategy pricingStrategy = PricingStrategyFactory.getPricingStrategy(ticket.getVehicle().getVehicleType());
        return pricingStrategy.calculateCharges(ticket);
    }
}
