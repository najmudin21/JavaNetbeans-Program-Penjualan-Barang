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
public class Pengkondisian_IF_Else {
    
    public static void main(String[] args){
        String Hasil = "";
        String data_nilai = JOptionPane.showInputDialog("Masukan nilai anda = ");
        float nilai = Float.parseFloat(data_nilai);
        if (nilai > 70.0f)
        {
            Hasil ="Anda Lulus";
        }
       else
        {
           Hasil ="Anda Tidak Lulus"; 
        }
        System.out.println(Hasil);
    }
}
