/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugas_praktikum;

/**
 *
 * @author AHMAD NAJMUDIN
 */
public class operator_relasi {
    public static void main(String[]args){
        int A=100, B=30;                //nilai variable A dan B
        boolean lb  =  A > B;             //lebih besar
        boolean lk  =  A < B;             //lebih kecil        
        boolean lbs =  A >= B;           //lebih dari atau sama
        boolean lks =  A <= B;          //kurang dari atau sama
        boolean sm  =  A == B;          //sama
        boolean tsm =  A != B;          //tidak sama
        
        //Tampilan hasil
        System.out.println(A+" > "+B+" => "+lb);
        System.out.println(A+" < "+B+" => "+lk);
        System.out.println(A+" >= "+B+" => "+lbs);
        System.out.println(A+" <= "+B+" => "+lks);
        System.out.println(A+" =  "+B+" => "+sm);
        System.out.println(A+" != "+B+" => "+tsm);
    }
}
