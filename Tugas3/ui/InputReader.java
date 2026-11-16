package Tugas3.ui;

import java.util.Scanner;

public class InputReader {
    private Scanner scanner = new Scanner(System.in);

    public int readInt(String message) {
        System.out.print(message);
        String text = scanner.nextLine();
        try {
            return Integer.parseInt(text.trim());
        } catch (NumberFormatException e) {
            return -1;
        }
    }
}
