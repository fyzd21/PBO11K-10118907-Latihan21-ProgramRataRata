/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k.pkg10118907.latihan21.programratarata;

import java.util.Scanner;

/**
 *
 * @author
 * NAMA     : Yazid Fadlullah At-Taukily
 * KELAS    : PBO11K
 * NIM      : 10118907
 * Deskripsi Program : Latihan menghitung program rata-rata nilai
 * 
 */
public class PBO11K10118907Latihan21ProgramRataRata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int byk;
        double total = 0, rata;
        System.out.print("Masukkan banyaknya mahasiswa : ");
        Scanner scanner = new Scanner(System.in);
        String mhs = scanner.next();
        
        byk = Integer.parseInt(mhs);
        
        total = rata(byk);
        
        rata = total / byk;
        System.out.println("\nMaka, rata-rata nilainya adalah "+rata);
        System.out.println("Developed by : Yazid");
        
    }
    
    public static double rata(int byk) {
        double total = 0;
        for(int i = 1; i<=byk; i++) {
            System.out.print("Nilai mahasiswa ke-"+i+" : ");
            Scanner scanner2 = new Scanner(System.in);
            String nilai = scanner2.next();
            
            total += Integer.parseInt(nilai);
            
        }
        return total;
    }
    
}
