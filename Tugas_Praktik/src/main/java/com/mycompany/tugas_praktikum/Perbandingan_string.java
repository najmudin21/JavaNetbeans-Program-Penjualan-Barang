/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugas_praktikum;

/**
 *
 * @author AHMAD NAJMUDIN
 */
public class Perbandingan_string {
    public static void main(String[] args) {
       String[] nama = {"Megawati Sukarno Putri",
       "Susilo Bambang Yudhoyono",
       "Jusuf Kala",
       "Prabowo Subiyanto",
       "Boediono",
       "Wiranto"};
       
       String sementara;
       int N = nama.length;
       
//       menampilkan nama awal sebelum diurutkan
        System.out.println("Daftar nama sebelum diurutkan");
        for (int i=0; i<N; i++)
        {
            System.out.println((i+1)+". "+nama[i]);
        }
        
//        pegaturan nama
        for (int i=0; i<=N-2; i++)
        {
            for (int j=i+i; j<=N-1; j++)
            {
                if (nama[i].compareTo(nama[j])>0)
                {
                    sementara = nama[i];
                    nama[i] = nama[j];
                    nama[j] = sementara;
                }
            }
        }
//        menampilkan setelah diurutkan
        System.out.println("Daftar nama setelah diurutkan");
        for (int i=0; i<N; i++)
        {
            System.out.println((i+1)+". "+nama[i]);
        }
    }
   
}
