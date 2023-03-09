package questions.parkingLot.entity.ticket.ticketPricing;

import questions.parkingLot.entity.parkingSpot.ParkingSpot;
import questions.parkingLot.entity.ticket.Ticket;

import java.util.concurrent.TimeUnit;

public class PricingByHour implements Pricing {
    @Override
    public double calculateCharges(Ticket ticket) {
        ParkingSpot parkingSpot = ticket.getParkingSpot();
        long timeElapsedInMillis = System.currentTimeMillis() - ticket.getEntryTime();
        long hoursElapsed = TimeUnit.MILLISECONDS.toHours(timeElapsedInMillis);
        return hoursElapsed * parkingSpot.getPrice();
    }

}
