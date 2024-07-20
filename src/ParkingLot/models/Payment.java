package ParkingLot.models;

import ParkingLot.enums.PaymentMode;
import ParkingLot.enums.PaymentStatus;

import java.util.Date;

public class Payment extends BaseModel{
    private String referenceNo;
    private PaymentMode paymentMode;
    private int amount;
    private Date paymentDate;
    private PaymentStatus paymentStatus;
}
