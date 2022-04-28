package models;

/**
 * Created by shivam.si on 17/04/22 6:50 pm
 */

public class WalletTransaction extends Transaction{
    private User receiver;

    public User getReceiver() {
        return receiver;
    }

    public void setReceiver(User receiver) {
        this.receiver = receiver;
    }
}
