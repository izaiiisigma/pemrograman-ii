package Tugas3.model;

public class Jacket extends Clothing {

    public Jacket(String name, String size, String condition, double price) {
        super(name, size, condition, price);
    }

    @Override
    public String getCategory() {
        return "Jaket";
    }

    @Override
    public double getPrice() {
        if (getCondition().equals("Fair")) {
            return super.getPrice() * 0.8;
        }
        return super.getPrice();
    }
}
