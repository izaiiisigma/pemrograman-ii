package Tugas3.model;

public abstract class Clothing implements Sellable {

    private String name;
    private String size;
    private String condition;
    private double price;
    private boolean sold;

    public Clothing(String name, String size, String condition, double price) {
        this.name = name;
        this.size = size;
        this.condition = condition;
        this.price = price;
        this.sold = false;
    }

    public abstract String getCategory();

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public boolean isSold() {
        return sold;
    }

    @Override
    public void markAsSold() {
        sold = true;
    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public String getCondition() {
        return condition;
    }

    public String describe() {
        return "[" + getCategory() + "] " + name + " | Size " + size
                + " | " + condition + " | Rp " + (int) getPrice();
    }
}