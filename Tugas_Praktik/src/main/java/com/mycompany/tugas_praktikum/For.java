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

public class For {
    public static void main(String[] args){
        String data_N = JOptionPane.showInputDialog("Masukan bilangan = ");
        int N = Integer.parseInt(data_N);
        int faktorial= 1;
        for (int i=1; i<=N; i++)
        {
            faktorial = faktorial*i;
        }
        System.out.println("Nilai "+N+"! = "+faktorial);
    }
}
