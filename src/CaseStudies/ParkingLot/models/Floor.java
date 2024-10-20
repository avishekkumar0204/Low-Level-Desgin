package CaseStudies.ParkingLot.models;

import ParkingLot.models.Vehicle;

import java.util.List;

public class Floor {
    private int id;
    private int floorNum;
    private List<Vehicle> allowedVehicles;
    private List<Slot> slots;
    private Status parkingFloorStatus;
}
