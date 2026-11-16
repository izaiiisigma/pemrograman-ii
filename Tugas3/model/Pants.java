package Tugas3.model;

public class Pants extends Clothing {

    public Pants(String name, String size, String condition, double price) {
        super(name, size, condition, price);
    }

    @Override
    public String getCategory() {
        return "Celana";
    }
}