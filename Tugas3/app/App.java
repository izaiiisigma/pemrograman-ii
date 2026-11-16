package Tugas3.app;

import Tugas3.service.*;
import Tugas3.ui.*;
import java.util.ArrayList;

public class App {
    private Store store = new Store();
    private InputReader reader = new InputReader();
    private ArrayList<Screen> screens = new ArrayList<>();

    public App() {
        screens.add(new ListScreen(store));
        screens.add(new BuyScreen(store, reader));
    }

    public void run() {
        System.out.println("[ SELAMAT DATANG DI THRIFT STORE ]");

        boolean running = true;
        while (running) {
            printMenu();
            int choice = reader.readInt("Pilih menu: ");

            if (choice == screens.size() + 1) {
                running = false;
            } else if (choice >= 1 && choice <= screens.size()) {
                screens.get(choice - 1).show();
            } else {
                System.out.println("Menu tidak tersedia.");
            }
        }

        System.out.println("Total pendapatan: Rp " + (int) store.getCashier().getTotalRevenue());
        System.out.println("Sampai jumpa!");
    }

    private void printMenu() {
        System.out.println();
        System.out.println("[ MENU UTAMA ]");
        for (int i = 0; i < screens.size(); i++) {
            System.out.println((i + 1) + ". " + screens.get(i).getTitle());
        }
        System.out.println((screens.size() + 1) + ". Keluar");
    }
}