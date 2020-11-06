/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10k.pkg10119901.latihan34.kalkulator;

import java.util.Scanner;

/**
 *
 * @author
 * NAMA     : Fauzan Muhammad Abdussalam
 * KELAS    : IF-10K
 * NIM      : 10119901
 * Deskripsi Program : Menampilkan hasil pertambahan, pengurangan, perkalian, pembagian dan sisa dari 2 bilangan
 *
 */
public class PBO10K10119901Latihan34Kalkulator {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        Kalkulator ktr = new Kalkulator();
        
        Scanner scanner = new Scanner(System.in);
        Double value1, value2;
        
        System.out.println("==== Aplikasi Kalkulator Bilangan ====");
        System.out.print("Masukkan Angka ke-1 : ");
        value1 = scanner.nextDouble();
        
        System.out.print("Masukkan Angka ke-2 : ");
        value2 = scanner.nextDouble();
        
        System.out.println();
        
        System.out.println("Hasil Pertambahan \t : "+ ktr.tambahBilangan(value1, value2));
        System.out.println("Hasil Pengurangan \t : "+ ktr.kurangBilangan(value1, value2));
        System.out.println("Hasil Perkalian \t : "+ ktr.kaliBilangan(value1, value2));
        System.out.println("Hasil Pembagian \t : "+ ktr.bagiBilangan(value1, value2));
        System.out.println("Hasil Sisa \t\t : "+ ktr.sisaBilangan(value1, value2));
    }
    
}
