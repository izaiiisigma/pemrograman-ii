package Tugas3.model;

public interface Sellable {
    double getPrice();
    boolean isSold();
    void markAsSold();
}