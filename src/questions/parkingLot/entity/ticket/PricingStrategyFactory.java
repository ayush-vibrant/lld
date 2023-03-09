package questions.parkingLot.entity.ticket;

import questions.parkingLot.entity.ticket.ticketPricing.PricingByHour;
import questions.parkingLot.entity.ticket.ticketPricing.PricingByMinute;
import questions.parkingLot.entity.vehicle.VehicleType;

public class PricingStrategyFactory {
    public static PricingStrategy getPricingStrategy(VehicleType vehicleType) {
        switch (vehicleType) {
            case TWO_WHEELER:
                return new PricingStrategy(new PricingByHour());
            case FOUR_WHEELER:
                return new PricingStrategy(new PricingByMinute());
            default:
                throw new IllegalArgumentException("Invalid vehicle type");
        }
    }
}
