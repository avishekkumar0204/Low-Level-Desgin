package ParkingLot.models;

import java.util.Date;
import java.util.List;

public class Bill extends BaseModel{
    private Date exitTime;
    private Gate exitGate;
    private Ticket ticket;
    private int amount;
    private List<Payment> payment;
}
