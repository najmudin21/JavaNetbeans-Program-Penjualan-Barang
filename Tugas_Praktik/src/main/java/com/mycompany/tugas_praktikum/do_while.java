/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugas_praktikum;

/**
 *
 * @author AHMAD NAJMUDIN
 */
import javax.swing.*;

public class do_while {
    public static void main(String[]args) {
        int i=0, jumGenap=0, jumGanjil=0;
        boolean ulang=true;
        do {
        String data_n=JOptionPane.showInputDialog("Masukan bilangan");
        int N = Integer.parseInt(data_n);
        if(N>0)
        {
            if(N%2==0){
                jumGenap=jumGenap+1;
            }   
        else
        {
                jumGanjil=jumGanjil+1;
        }
            i=i+i;
            System.out.println("Banyaknya bilangan genap sampai iterasi ke "+i+" = "+jumGenap);
            System.out.println("Banyaknya bilangan ganjil sampai iterasi ke "+i+" = "+jumGanjil);
        }
        else
        {
            ulang=false;
        }
        }while(ulang);
        System.out.println("Perulangan selesai");
}
}
