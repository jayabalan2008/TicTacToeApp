package org.example;

import java.util.Scanner;

public class TicTacToeUC4 {
    public static void main(String[] args){
        int slot=getUserSlot();
        System.out.println("Slot entered: "+slot);
        System.out.println("Row: "+getRowFromSlot(slot));
        System.out.println("Column: "+getColFromSlot(slot));
    }
    static int getUserSlot(){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter slot number between 1 and 9: ");
        int slot=in.nextInt();
        return slot;
    }
    static int getRowFromSlot(int slot){
        return(slot-1)/3;
    }
    static int getColFromSlot(int slot){
        return(slot-1)%3;
    }
}