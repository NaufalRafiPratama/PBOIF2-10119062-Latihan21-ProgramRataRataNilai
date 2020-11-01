/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119062.latihan21.programrataratanilai;

import java.util.Scanner;

/**
 *
 * @author 
 * NAMA     : Naufal Rafi Pratama
 * KELAS    : PBOIF2
 * NIM      : 10119062
 * Deskripsi Program : Program ini berisi program untuk menampilkan
 * program rata-rata nilai
 */
public class PBOIF210119062Latihan21ProgramRataRataNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scanner = new Scanner(System.in);
        int i, banyakmahasiswa;
        float totalnilaimahasiswa, nilaimahasiswa,rataratanilai;
        System.out.print("Masukkan Banyaknya Mahasiswa : ");
        banyakmahasiswa = scanner.nextInt();
        totalnilaimahasiswa = 0;
        i = 1;
        
        while (i <= banyakmahasiswa) {
            System.out.print("Nilai Mahasiswa ke-" +i+ " : ");
            nilaimahasiswa = scanner.nextFloat();
            totalnilaimahasiswa += nilaimahasiswa;
            i++;
        
        rataratanilai = totalnilaimahasiswa/banyakmahasiswa;
        System.out.println("\nMaka, Rata-rata Nilainya adalah "+rataratanilai);
        System.out.println("Developed by : Naufal Rafi Pratama");
        }
    }
    
}
