package Principles.CostumerService.Domain;

import java.sql.Timestamp;

public class Transaction {
    protected int no;
    protected double amount;
    protected Timestamp date;
    protected static String description;
    protected TransactionType type;

    protected Account source;
}
