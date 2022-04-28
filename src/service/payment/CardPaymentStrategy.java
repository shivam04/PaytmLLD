package service.payment;

import models.CardType;

/**
 * Created by shivam.si on 17/04/22 6:56 pm
 */

public class CardPaymentStrategy implements PaymentStrategy {
    private String cardNumber;
    private String cardHolderName;
    private CardType cardType;
    private String validity;

    @Override
    public void pay() {

    }
}
