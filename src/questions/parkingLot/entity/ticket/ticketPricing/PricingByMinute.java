package questions.parkingLot.entity.ticket.ticketPricing;

import questions.parkingLot.entity.parkingSpot.ParkingSpot;
import questions.parkingLot.entity.ticket.Ticket;

import java.util.concurrent.TimeUnit;

public class PricingByMinute implements Pricing {
    public double calculateCharges(Ticket ticket) {
        ParkingSpot parkingSpot = ticket.getParkingSpot();
        long timeElapsedInMillis = System.currentTimeMillis() - ticket.getEntryTime();
        long minutesElapsed = TimeUnit.MILLISECONDS.toMinutes(timeElapsedInMillis);
        return minutesElapsed * parkingSpot.getPrice();
    }
}
