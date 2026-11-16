package Tugas3.service;

import Tugas3.model.Clothing;
public class Cashier {
    private double totalRevenue = 0;

    public void checkout(Clothing item) {
        item.markAsSold();
        totalRevenue += item.getPrice();

        System.out.println();
        System.out.println("===== STRUK =====");
        System.out.println(item.getName() + " (" + item.getCategory() + ", " + item.getSize() + ")");
        System.out.println("Total : Rp " + (int) item.getPrice());
        System.out.println("Terima kasih sudah thrifting!");
        System.out.println("=================");
    }

    public double getTotalRevenue() {
        return totalRevenue;
    }
}
