package ParkingLot.models;

import ParkingLot.enums.Status;
import ParkingLot.enums.VehicleType;

public class ParkingSlot extends BaseModel{
    private String slotNumber;
    private Status status;
    private VehicleType vehicleType;
    private ParkingFloor floor;
}
