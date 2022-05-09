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
public class Pengkondisian_IF_Else2 {
    
    public static void main(String[] args){
        String Kategori;
        String data_umur = JOptionPane.showInputDialog("Masukan umur anda (dalam tahun)= ");
        float umur = Float.parseFloat(data_umur);
        if (umur < 5.0f){
            Kategori="Balita";
        }
        else if (umur < 12.0f){
            Kategori="Anak-anak";
        }   
        else if (umur < 18.0f){
            Kategori="Remaja";
        }
        else if (umur < 40.0f){
            Kategori="Dewasa";
        } 
        else if (umur < 60.0f){
            Kategori="Paruh Baya";
        }
        else {
            Kategori="Lanjut Usia";
        }
        System.out.println("Umur "+umur+" tahun termasuk dalam kategori "+Kategori);
      }
    }
