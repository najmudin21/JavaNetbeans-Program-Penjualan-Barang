/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugas_praktikum;

/**
 *
 * @author AHMAD NAJMUDIN
 */
public class Array_1d {
    
    public static void main(String[] args){
        
        int penjualan[] = {100, 120, 112, 132, 105, 112, 
                           108, 121, 122, 130, 115, 125};
        int N = penjualan.length;
        
        for (int i=0; i<N; i++)
        {
            System.out.println("Penjualan ke-"+i+" = "+penjualan[i]);
        }
    }
    
}
