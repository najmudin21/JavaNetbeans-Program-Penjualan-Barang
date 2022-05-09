/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugas_praktikum;

/**
 *
 * @author AHMAD NAJMUDIN
 */
public class String_baru {

    public static void main(String[] args) {
        String A = "Laboratorium Komputasi dan Sistem Cerdas";

        String penggal1 = A.substring(10);
        String penggal2 = A.substring(20);
        String penggal3 = A.substring(10, 30);
        String penggal4 = A.substring(20, 25);

        System.out.println("Kalimat asli: " + A);
        System.out.println("Pemenggalan mulai Karakter ke-10: " + penggal1);
        System.out.println("Pemenggalan mulai Karakter ke-20: " + penggal2);
        System.out.println("Pemenggalan mulai Karakter ke-10 sampai ke-30: " + penggal3);
        System.out.println("Pemenggalan mulai Karakter ke-20 sampai ke-25: " + penggal4);

    }
}
