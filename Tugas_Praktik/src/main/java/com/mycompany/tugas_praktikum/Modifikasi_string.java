/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugas_praktikum;

/**
 *
 * @author AHMAD NAJMUDIN
 */
public class Modifikasi_string {
    public static void main(String[] args) {
       String A = "Labolatorium Komputasi dan Sistem Cerdas ";
       
       String B = A.replace("a", "A");
       String C = A.replace("i", "u");
       String D = A.trim();
       
        System.out.println("Kalimat asli: "+A);
        System.out.println("Replace a dengan A: "+B);
        System.out.println("Replace i dengan u: "+C);
        System.out.println("Hilangkan spasi awal & akhir: "+D);
    }
}
