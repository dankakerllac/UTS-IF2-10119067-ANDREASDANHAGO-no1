/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTSIF210119067ANDREASDANHAGOno1;

import java.util.Calendar;
import data.Age;
import java.util.Scanner;

/**
 *
 * @author 
 * NAMA     : Andreas Danhago P.I
 * KELAS    : PBO IF-2
 * NIM      : 10119067
 * DESKRIPSI PROGRAM : MENAMPILKAN UMUR
 *                     DAN KETERANGANNYA
*/

public class UTSIF210119067ANDREASDANHAGOo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner input = new Scanner(System.in);

        Age age = new Age(Calendar.getInstance().get(Calendar.YEAR));

        System.out.print("Masukkan Tahun Lahir Anda : ");
        age.setYearBirth(input.nextInt());

        System.out.println("\n======Hasil Perhitungan Umur======");
        System.out.println("Tahun lahir anda : " + age.getYearBirth());
        System.out.println("Hari ini tahun : " + age.getYearNow());
        System.out.println("Umur kamu sampai hari ini adalah " + age.hitungUmur() + " tahun");
        System.out.println("Tandanya Kamu " + age.tandanyaKamu(age.hitungUmur()));
    }
}
   