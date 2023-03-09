package questions.parkingLot.entity.ticket;

import questions.parkingLot.entity.ticket.ticketPricing.Pricing;

public class PricingStrategy {
    private Pricing pricingStrategy;

    public PricingStrategy(Pricing pricingStrategy) {
        this.pricingStrategy = pricingStrategy;
    }

    public double calculateCharges(Ticket ticket) {
        return pricingStrategy.calculateCharges(ticket);
    }
}
