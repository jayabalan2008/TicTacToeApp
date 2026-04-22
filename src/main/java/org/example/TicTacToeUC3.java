package org.example;
import java.util.Scanner;
public class TicTacToeUC3 {
    public static void main(String[] args){
        int slot=getUserSlot();
        System.out.println("Slot entered: "+slot);
    }
    static int getUserSlot(){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter slot number between 1 and 9: ");
        int slot=in.nextInt();
        return slot;
    }
}
