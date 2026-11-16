package Tugas3.ui;

import Tugas3.model.*;
import Tugas3.service.*;
import java.util.ArrayList;

public class BuyScreen implements Screen {
    private Store store;
    private InputReader reader;

    public BuyScreen(Store store, InputReader reader) {
        this.store = store;
        this.reader = reader;
    }

    @Override
    public String getTitle() {
        return "Beli baju";
    }

    @Override
    public void show() {
        ArrayList<Clothing> items = store.getAvailableItems();
        if (items.size() == 0) {
            System.out.println("\nSemua barang sudah terjual.");
            return;
        }

        System.out.println();
        System.out.println("--- BELI BAJU ---");
        for (int i = 0; i < items.size(); i++) {
            System.out.println((i + 1) + ". " + items.get(i).describe());
        }

        int choice = reader.readInt("Pilih nomor baju (0 untuk batal): ");
        if (choice == 0) {
            return;
        }
        if (choice < 1 || choice > items.size()) {
            System.out.println("Nomor tidak valid.");
            return;
        }
        System.out.println("Kamu memilih: " + items.get(choice - 1).getName());
        store.getCashier().checkout(items.get(choice - 1));
    }
}
