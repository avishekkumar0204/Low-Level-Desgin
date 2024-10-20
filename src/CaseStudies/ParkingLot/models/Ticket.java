package CaseStudies.ParkingLot.models;

import java.time.LocalTime;

public class Ticket {
    private int id;
    private Vehicle vehicle;
    private Slot slot;
    private Gate gate;
    private LocalTime entryTime;
}
