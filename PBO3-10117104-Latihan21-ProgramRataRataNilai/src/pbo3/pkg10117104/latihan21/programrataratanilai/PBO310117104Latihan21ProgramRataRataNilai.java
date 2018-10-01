/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117104.latihan21.programrataratanilai;

import java.util.Scanner;
import java.text.DecimalFormat;
/**
 *
 * @author 
 * Nama      : Aditya Suheryana
 * Nim       : 10117104
 * Kelas     : IF-3/PBO3
 * Deskripsi : Menghitung dan Menampilkan Rata Nilai
 * 
 */

public class PBO310117104Latihan21ProgramRataRataNilai {
        public static void main(String[] args) {

            
    int jmlMahasiswa; 
    double rata,total;
    total=0;
    Scanner scn = new Scanner(System.in);
    System.out.print("Masukkan Banyaknya Mahasiswa ? : ");
    jmlMahasiswa=scn.nextInt();
    
    int[] nilai = new int[jmlMahasiswa];
    for(int i=0 ; i<jmlMahasiswa ; i++){
    System.out.print("Nilai Mahasiswa ke-"+(i+1)+" : ");
    nilai[i]=scn.nextInt();
    total=nilai[i]+total;  
    }
           rata=total/jmlMahasiswa;
            System.out.println("Maka, Rata-rata Nilainya Adalah "+rata);
            System.out.println("Developed by : Aditya Suheryana");
    
        }        
}



