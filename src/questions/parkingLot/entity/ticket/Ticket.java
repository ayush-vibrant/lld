package questions.parkingLot.entity.ticket;

import questions.parkingLot.entity.parkingSpot.ParkingSpot;
import questions.parkingLot.entity.vehicle.Vehicle;

public class Ticket {
    private String ticketNumber;
    private Vehicle vehicle;
    private ParkingSpot parkingSpot;
    private Long entryTime;

    public String getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(String ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }

    public void setParkingSpot(ParkingSpot parkingSpot) {
        this.parkingSpot = parkingSpot;
    }

    public Long getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(Long entryTime) {
        this.entryTime = entryTime;
    }

    public static Ticket generateTicket(Vehicle vehicle, ParkingSpot parkingSpot) {
        Ticket ticket = new Ticket();
        ticket.setTicketNumber(generateTicketNumber(vehicle));
        ticket.setVehicle(vehicle);
        ticket.setParkingSpot(parkingSpot);
        ticket.setEntryTime(System.currentTimeMillis() - 10000000); // To generate some billing amount
        return ticket;
    }

    private static String generateTicketNumber(Vehicle vehicle) {
        return vehicle.getLicensePlate() + System.currentTimeMillis();
    }
}
