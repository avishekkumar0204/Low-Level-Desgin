package ParkingLot.models;

import java.util.HashMap;
import java.util.List;
import ParkingLot.enums.Status;

public class ParkingFloor extends BaseModel{
    private String floorName;
    private List<ParkingSlot> parkingSlots;
    private List<VehicleTypeCapacity> capacity;
    private Status status;
}
