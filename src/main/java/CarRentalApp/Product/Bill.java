package CarRentalApp.Product;

public class Bill {
    Reservation reservation;
    boolean isPaid;
    double amount;

    public Bill(Reservation reservation) {
        this.reservation = reservation;
        this.isPaid = false;
        this.amount = computeBillAmount();
    }

    private double computeBillAmount() {
        return 100.0;
    }

    public Reservation getReservation() {
        return reservation;
    }

    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }

    public boolean isPaid() {
        return isPaid;
    }

    public void setPaid(boolean paid) {
        isPaid = paid;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
