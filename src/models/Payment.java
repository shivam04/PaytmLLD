package models;

import service.payment.PaymentStrategy;

/**
 * Created by shivam.si on 17/04/22 6:44 pm
 */

public class Payment extends BaseModel{
    private Transaction transaction;
    private PaymentStatus paymentStatus;
    private PaymentStrategy paymentStrategy;
}
