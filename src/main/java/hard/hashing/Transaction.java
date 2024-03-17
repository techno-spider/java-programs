package hard.hashing;

import java.time.LocalDateTime;

public class Transaction {

    private double amount;
    private LocalDateTime timeStamp;

    public Transaction(double amount, LocalDateTime timeStamp) {
        this.amount = amount;
        this.timeStamp = timeStamp;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public LocalDateTime getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(LocalDateTime timeStamp) {
        this.timeStamp = timeStamp;
    }
}