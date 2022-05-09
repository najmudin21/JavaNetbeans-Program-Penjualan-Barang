/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugas_praktikum;

/**
 *
 * @author AHMAD NAJMUDIN
 */
public class operator_logika {
    public static void main (String[] args) {
    boolean A=true, B=false;      //nilai boolean A dan B
    
    boolean o_and = A && B;      //A and B 
    boolean o_or = A || B;      //A or B 
    boolean o_notA = !A;       //not A 
    boolean o_notB =!B;       //not B
    
    //tampilkan hasil
    System.out.println(A+" AND "+B+" => "+o_and);
    System.out.println(A+" OR "+B+" => "+o_or);
    System.out.println("NOT "+B+" => "+o_notA);
    System.out.println("NOT "+B+" => "+o_notB);
}
}
