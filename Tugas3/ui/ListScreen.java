package Tugas3.ui;

import Tugas3.model.*;
import Tugas3.service.*;
import java.util.ArrayList;

public class ListScreen implements Screen {
    private Store store;

    public ListScreen(Store store) {
        this.store = store;
    }

    @Override
    public String getTitle() {
        return "Lihat daftar baju";
    }

    @Override
    public void show() {
        System.out.println();
        System.out.println("--- DAFTAR BAJU ---");
        for (Rack rack : store.getRacks()) {
            ArrayList<Clothing> items = rack.getAvailableItems();
            if (items.size() > 0) {
                System.out.println(rack.getName() + ":");
                for (Clothing item : items) {
                    System.out.println("  - " + item.describe());
                }
            }
        }
        if (store.getAvailableItems().size() == 0) {
            System.out.println("Semua barang sudah terjual.");
        }
    }
}
