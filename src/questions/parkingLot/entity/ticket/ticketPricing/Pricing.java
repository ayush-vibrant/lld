package questions.parkingLot.entity.ticket.ticketPricing;

import questions.parkingLot.entity.ticket.Ticket;

public interface Pricing {
    public double calculateCharges(Ticket ticket);
}
