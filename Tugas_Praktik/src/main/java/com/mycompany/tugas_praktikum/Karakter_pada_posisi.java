/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugas_praktikum;
import java.util.Random;
/**
 *
 * @author AHMAD NAJMUDIN
 */
public class Karakter_pada_posisi {
    
    public static void main(String[] args) {
        String A = "Laboratorium Komputasi dan Sistem Cerdas";
        Random rand = new Random ();
        for (int i=1; i<=10; i++)
        {
            int  ke = rand.nextInt(A.length());
            System.out.println("Karakter ke-"+ke+" = "+A.charAt(ke));
        }
    }
}
