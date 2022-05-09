/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugas_praktikum;

/**
 *
 * @author AHMAD NAJMUDIN
 */
public class Kesamaan_string {

    public static void main(String[] args) {
        String A = "Labolatorium Komputasi dan Sistem Cerdas";
        String B = "LABOLATORIUM KOMPUTASI DAN SISTEM CERDAS";
        String C, D, E;
        C = "Labolatorium Komputasi Sistem Cerdas";
        D = "LABOLATORIUM KOMPUTASI DAN SISTEM CERDAS";
        E = "Labolatorium Komputasi dan Sistem Cerdas";

        boolean tes1, tes2, tes3;
        tes1 = A.equals(B);
        tes2 = (A == C);
        tes3 = A.equals(E);

        System.out.println("[" + A + "]==[" + B + "]--> " + tes1);
        System.out.println("[" + A + "]==[" + C + "]--> " + tes2);
        System.out.println("[" + A + "]==[" + E + "]--> " + tes3);
        System.out.println("[" + B + "]==[" + D + "]--> " + B.equals(D));
        System.out.println("[" + C + "]==[" + E + "]--> " + (C == E));

    }
}
