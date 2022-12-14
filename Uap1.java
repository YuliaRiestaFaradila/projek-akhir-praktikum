
package com.mycompany.uap1;
import java.util.Scanner;

public class Uap1 {

    public static void main(String[] args) {
        String[][] kursi = new String[7][5];
        
        Scanner sc = new Scanner(System.in);
        
        for(int baris = 1; baris < kursi.length; baris++){
            for(int kolom = 1; kolom < kursi[baris].length; kolom++){
                System.out.print("penumpang di kursi ("+baris+","+kolom +") : ");
                kursi[baris][kolom] = sc.nextLine();
                }
        }
        
        System.out.println("-------------------------");
        for(int baris = 1; baris < kursi.length; baris++){
            for(int kolom = 1; kolom < kursi[baris].length; kolom++){
                System.out.print("| "+ kursi[baris][kolom]+" |");
            }
            System.out.println("");
        }
        System.out.println("-------------------------");
    }
}
