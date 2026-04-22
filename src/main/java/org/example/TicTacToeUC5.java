package org.example;

import java.util.Scanner;

public class TicTacToeUC5 {

    public static void main(String[] args) {

        int slot = getUserSlot();

        // Validation (important for marks)
        if (slot < 1 || slot > 9) {
            System.out.println("Invalid slot! Please enter between 1 and 9.");
            return;
        }

        int row = getRowFromSlot(slot);
        int col = getColFromSlot(slot);

        System.out.println("Slot entered: " + slot);
        System.out.println("Row: " + row);
        System.out.println("Column: " + col);
    }

    // Take input
    static int getUserSlot() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter slot number between 1 and 9: "); // changed to print
        return in.nextInt();
    }

    // Convert slot → row
    static int getRowFromSlot(int slot) {
        return (slot - 1) / 3;
    }

    // Convert slot → column
    static int getColFromSlot(int slot) {
        return (slot - 1) % 3;
    }
}