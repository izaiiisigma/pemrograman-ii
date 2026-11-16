package Tugas3.model;

import java.util.ArrayList;

public class Rack {
    private String name;
    private ArrayList<Clothing> items = new ArrayList<>();

    public Rack(String name) {
        this.name = name;
    }

    public void addItem(Clothing item) {
        items.add(item);
    }

    public ArrayList<Clothing> getAvailableItems() {
        ArrayList<Clothing> available = new ArrayList<>();
        for (Clothing item : items) {
            if (!item.isSold()) {
                available.add(item);
            }
        }
        return available;
    }

    public String getName() {
        return name;
    }
}