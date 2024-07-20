package ParkingLot.models;

import ParkingLot.enums.GateType;
import ParkingLot.enums.Status;

public class Gate extends BaseModel {
    private String gateNumber;
    private GateType gateType;
    private Status status;
    private Operator currOperator;
}
