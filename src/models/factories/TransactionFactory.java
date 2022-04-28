package models.factories;

import models.BankTransaction;
import models.Transaction;
import models.TransactionType;
import models.WalletTransaction;
import models.factories.exceptions.InvalidTransactionTypeException;

/**
 * Created by shivam.si on 17/04/22 7:12 pm
 */

public class TransactionFactory {
    public static Transaction getTransactionForType(TransactionType type) {
        return switch (type) {
            case BANK -> new BankTransaction();
            case WALLET -> new WalletTransaction();
            default -> throw new InvalidTransactionTypeException();
        };
    }
}
