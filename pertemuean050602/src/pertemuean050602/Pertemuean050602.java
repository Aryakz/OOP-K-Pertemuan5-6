/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuean050602;

import java.util.Scanner;

/**
 *
 * @author INSTIKI
 */
public class Pertemuean050602 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Scanner scanner = new Scanner(System.in);

        // Membuat objek dari kelas LuasSegiTiga
        LuasSegiTiga SegiTiga01 = new LuasSegiTiga();

        // Meminta inputan untuk alas
        System.out.print("Masukkan nilai alas: ");
        SegiTiga01.alas = (int) scanner.nextDouble(); // Membaca nilai alas

        // Meminta inputan untuk tinggi
        System.out.print("Masukkan nilai tinggi: ");
        SegiTiga01.tinggi = (int) scanner.nextDouble(); // Membaca nilai tinggi

        // Menampilkan hasil perhitungan luas segitiga
        System.out.println("Luas Segitiga: " + SegiTiga01.HitungLuas());
        
        // Menutup scanner
        scanner.close();    }
    
}
