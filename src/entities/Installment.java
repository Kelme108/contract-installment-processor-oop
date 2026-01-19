package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Installment {

    private DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    private LocalDate finalDate;
    private Double amount;

    public Installment() {
    }

    public Installment(LocalDate finalDate, Double amount) {
        this.finalDate = finalDate;
        this.amount = amount;
    }

    public LocalDate getFinalDate() {
        return finalDate;
    }

    public void setFinalDate(LocalDate finalDate) {
        this.finalDate = finalDate;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return  finalDate.format(fmt) +
                ", amount=" + String.format("%.2f", amount);
    }
}
