/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugas_praktikum;

/**
 *
 * @author AHMAD NAJMUDIN
 */
public class Posisi_karakter {
    public static void main(String[] args) {
       String A = "Laboratorium Komputasi dan Sistem Cerdas";
               
        System.out.println("Karakter s terletak pada posisi ke:"+A.indexOf('s'));  
        System.out.println("Karakter a terletak pada posisi ke:"+A.indexOf('a'));  
        System.out.println("Karakter v terletak pada posisi ke:"+A.indexOf('v'));  
        System.out.println("Setelah posisi ke-10, karakter s terletak pada posisi ke:"+A.indexOf('s',10));  
        System.out.println("Setelah posisi ke-10, karakter a terletak pada posisi ke:"+A.indexOf('a',10));  
          
    }
    
}
