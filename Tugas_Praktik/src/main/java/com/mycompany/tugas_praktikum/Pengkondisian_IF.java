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
public class Pengkondisian_IF {
    
public static void main(String[] args){

    String data_TD = JOptionPane.showInputDialog(" Masukan tekanan darah " + "sistolik anda (mmHg)");
    int TekananDarah = Integer.parseInt(data_TD);
    if (TekananDarah > 140){
        System.out.println("Anda Hipertensi");
        
        }
    }
}
