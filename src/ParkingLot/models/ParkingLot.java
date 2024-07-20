package ParkingLot.models;

import java.util.HashMap;
import java.util.List;
import ParkingLot.enums.Status;
import ParkingLot.enums.VehicleType;

public class ParkingLot extends BaseModel{
    private String name;
    private List<ParkingFloor> floors;
    private List<Gate> entryGate;
    private List<Gate> exitGate;
    private List<VehicleTypeCapacity> capacity;
    private Status status;

    public Status parkingLotStatus(){
        return status;
    }
    public void setStatus(Status status){
        this.status = status;
    }
    public List<Gate> getEntryGates() {
        return entryGate;
    }
    public void addEntryGate(Gate entryGate){
        this.entryGate.add(entryGate);
    }
    public List<Gate> getExitGates() {
        return exitGate;
    }
    public void addExitGate(Gate exitGate){
        this.exitGate.add(exitGate);
    }
}
