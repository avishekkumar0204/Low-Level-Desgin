package CaseStudies.ParkingLot.models;

import ParkingLot.models.Vehicle;

import java.util.List;

public class Slot {
    private int id;
    private int slotNum;
    private Vehicle allowedVehicle;
    private SlotStatus slotStatus;
}
