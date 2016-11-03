/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segitiga;
import java.util.Scanner;

/**
 *
 * @author iqbal
 */
public class Segitiga {


    public static void main(String[] args) {
        int i, j;
        int panjang;
        Scanner input = new Scanner(System.in);
        System.out.printf("Jumlah Karakter/Tinggi Segitiga : ");
        panjang = input.nextInt();
        System.out.print("-----------------------------------");
 // Segitiga siku kiri atas      
        for(i=0;i<=panjang;i++) {
            for(j=0; j<i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        System.out.println();
        
        // Segitiga siku kiri bawah
        for(i=0;i<panjang;i++) {
            for(j=i;j<panjang;j++) {
                System.out.print("*");
            }
        System.out.println();
        }
        // Segitigas sama kaki 
        for(i=0; i<=panjang; i++) {
            for (int m=1; m<=panjang-i; m++) {
                System.out.print (" ");
            }
            for (int m=1; m<2*i; m++) {
                System.out.print ("*");
            }
        System.out.println (" ");
        }
    }
}