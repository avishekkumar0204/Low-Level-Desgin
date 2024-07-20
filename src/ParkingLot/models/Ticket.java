package ParkingLot.models;

import ParkingLot.enums.VehicleType;

import java.util.Date;

public class Ticket {
    private Date entryTime;
    private Gate gate;
    private ParkingSlot parkingSlot;
    private Vehicle vehicle;
    private VehicleType vehicleType;
}
