package Tugas3.service;

import Tugas3.model.*;
import java.util.ArrayList;

public class Store {
    private ArrayList<Rack> racks = new ArrayList<>();
    private Cashier cashier = new Cashier();

    public Store() {
        stockItems();
    }

    private void stockItems() {
        Rack tops = new Rack("Rak Atasan");
        tops.addItem(new Shirt("Flannel Kotak Merah", "M", "Good", 85000));
        tops.addItem(new Shirt("Kemeja Putih Oxford", "L", "Fair", 60000));
        tops.addItem(new Jacket("Bomber Hitam Vintage", "L", "Good", 150000));

        Rack bottoms = new Rack("Rak Bawahan");
        bottoms.addItem(new Pants("Levis 501 Biru", "32", "Good", 175000));
        bottoms.addItem(new Pants("Cargo Army", "30", "Fair", 90000));

        Rack outer = new Rack("Rak Outer");
        outer.addItem(new Jacket("Denim Jacket Washed", "M", "Fair", 200000));
        outer.addItem(new Jacket("Windbreaker Retro", "XL", "Good", 120000));

        racks.add(tops);
        racks.add(bottoms);
        racks.add(outer);
    }

    public ArrayList<Clothing> getAvailableItems() {
        ArrayList<Clothing> all = new ArrayList<>();
        for (Rack rack : racks) {
            all.addAll(rack.getAvailableItems());
        }
        return all;
    }

    public ArrayList<Rack> getRacks() {
        return racks;
    }

    public Cashier getCashier() {
        return cashier;
    }
}
