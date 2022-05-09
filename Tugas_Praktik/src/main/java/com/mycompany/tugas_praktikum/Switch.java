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

public class Switch {
    public static void main(String[] args) {
        int A = 100, B = 25;
        System.out.println("Menu Pilihan :");
        System.out.println("1. Penjumlahan:");
        System.out.println("2. Pengurangan :");
        System.out.println("3. perkalian :");
        System.out.println("4. pembagian :");
        String data_pilihan = JOptionPane.showInputDialog("masukan pilihan anda [1-4] :");
        int pilihan = Integer.parseInt(data_pilihan);
        switch (pilihan) {
            case 1:{
                int jumlah = A + B;
                System.out.println("Penjumlahan " + A + " + " + B + " = " + jumlah);
                break;
            }
            case 2:{
                int jumlah = A + B;
                System.out.println("Pengurangan " + A + " - " + B + " = " + jumlah);
                break;
            }
            case 3:{
                int jumlah = A + B;
                System.out.println("Perkalian " + A + " * " + B + " = " + jumlah);
                break;
            }
            case 4:{
                int jumlah = A + B;
                System.out.println("Pembagian " + A + " : " + B + " = " + jumlah);
                break;
            }
            default:
            System.out.println("Pilihan anda salah");
            break;
        }
    }
}
