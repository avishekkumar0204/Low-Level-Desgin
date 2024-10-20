package CaseStudies.ParkingLot.models;

import ParkingLot.models.Vehicle;

import java.util.List;

public class ParkingLot {
    private int id;
    private List<Floor> floors;
    private List<Vehicle> allowedVehicles;
    private Status parkingLotStatus;

    public enum PayementMode {
        CREDIT,
        DEBIT,
        UPI,
        CASH
    }
}
