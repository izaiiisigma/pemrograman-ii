package Tugas3.model;

public class Shirt extends Clothing {

    public Shirt(String name, String size, String condition, double price) {
        super(name, size, condition, price);
    }

    @Override
    public String getCategory() {
        return "Kemeja";
    }
}