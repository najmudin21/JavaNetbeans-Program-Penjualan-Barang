/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugas_praktikum;

/**
 *
 * @author AHMAD NAJMUDIN
 */
public class Konversi_string_array {

    public static void main(String[] args) {
        String A = "Lab. KSC";
        char[] karakter0 = A.toCharArray();
        char[] karakter1 = new char[7];
        A.getChars(2, 6, karakter1, 1);

        System.out.println("Kalimat asli: " + A);

//        penulisan per karakter
        System.out.println("Per Karakter:");
        for (int i = 0; i < A.length(); i++) {
            System.out.println("Karakter ke-" + (i + i + ": " + karakter0[i]));
        }

//        penulisan per karakter dari karakter ke-2 sampai 6
        System.out.println("Karakter ke-2 sampai 6:");
        for (int i = 1; i < karakter1.length; i++) {
            System.out.println("karakter ke-" + i + ": " + karakter1[i]);
        }
    }
}
