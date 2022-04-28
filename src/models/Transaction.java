package models;

import java.util.List;

/**
 * Created by shivam.si on 17/04/22 6:44 pm
 */

public abstract class Transaction extends BaseModel{
    private User from;
    private int amount;
    private List<Payment> payments;
    private TransactionStatus transactionStatus;

    public User getFrom() {
        return from;
    }

    public void setFrom(User from) {
        this.from = from;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public List<Payment> getPayments() {
        return payments;
    }

    public void setPayments(List<Payment> payments) {
        this.payments = payments;
    }

    public TransactionStatus getTransactionStatus() {
        return transactionStatus;
    }

    public void setTransactionStatus(TransactionStatus transactionStatus) {
        this.transactionStatus = transactionStatus;
    }
}
