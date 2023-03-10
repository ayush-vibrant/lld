package questions.parkingLot.entity.ticket;

import questions.parkingLot.entity.ticket.PricingStrategy;
import questions.parkingLot.entity.ticket.PricingStrategyFactory;
import questions.parkingLot.entity.ticket.Ticket;

public class ParkingPriceCalculator {
    private final Ticket ticket;

    public ParkingPriceCalculator(Ticket ticket) {
        this.ticket = ticket;
    }

    public double calculateCharges() {
        PricingStrategy pricingStrategy = PricingStrategyFactory.getPricingStrategy(ticket.getVehicle().getVehicleType());
        return pricingStrategy.calculateCharges(ticket);
    }
}