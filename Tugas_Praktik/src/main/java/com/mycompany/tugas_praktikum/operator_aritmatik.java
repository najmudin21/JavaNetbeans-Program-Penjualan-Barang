/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugas_praktikum;

/**
 *
 * @author AHMAD NAJMUDIN
 */
public class operator_aritmatik {
public static void main (String[] args) {
    int A=100, B=30;            //nilai variabel A dan B
    
    int jumlah = A+B;           //operasi penjumlahan
    int kurang = A-B;             //operasi pengurangan 
    int kali = A*B;             //operasi perkalian 
    float bagi =(float)A/B;     //operasi pembagian
    int modulo = A%B;           //modulo
    
    //tampilkan hasil
    System.out.println("Penjumalahan: "+A+" + "+B+" = "+jumlah);
    System.out.println("Pengurangan: "+A+" - "+B+" = "+kurang);
    System.out.println("Perkalian: "+A+" * "+B+" = "+kali);
    System.out.println("Pembagian: "+A+" / "+B+" = "+bagi);
    System.out.println("Modulo: "+A+" mod "+B+" = "+modulo);
}   
}
