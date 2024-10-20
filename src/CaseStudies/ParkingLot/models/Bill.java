package CaseStudies.ParkingLot.models;

import ParkingLot.models.Payment;

import java.time.LocalTime;

public class Bill {
    private int id;
    private int billId;
    private Gate gate;
    private Double amount;
    private LocalTime exitTime;
    private Payment payment;

}
