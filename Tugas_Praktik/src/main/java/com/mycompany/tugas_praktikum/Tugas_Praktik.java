/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugas_praktikum;

/**
 *
 * @author AHMAD NAJMUDIN
 */
//Membuat import kelas komponen ArrayList dan java.util.Scanner
import java.util.ArrayList;
import java.util.Scanner;
    
public class Tugas_Praktik {
 public static void main(String[] args) {
 String user;
 int counter;
 int i = 0;
 int total = 0;
 int uang;
 int sisaUang;
 //Scanner Input user
 Scanner inputUser = new Scanner(System.in);
 //Menggunakan ArrayList pada Java
 //Item List
 ArrayList<String> itemList = new ArrayList();
 //Harga List
 ArrayList<Integer> harga = new ArrayList();
 System.out.println("PROGRAM KASIR\n");
 //Price List
 System.out.println("============================");
 System.out.println("HARGA DALAM RUPIAH (Rp)");
 System.out.println("============================");
 System.out.println("minyak\t: Rp45000");
 System.out.println("terigu\t: Rp13000");
 System.out.println("telur\t: Rp27000");
 System.out.println("roti\t: Rp12000");
 System.out.println("============================\n");
 //Pengguna Counter
 System.out.println("============================");
 System.out.println("CASHIER");
 System.out.println("============================");
 System.out.println("Berapa banyak uang yang Anda miliki?\t: Rp");
 uang = inputUser.nextInt();
 System.out.println("Berapa Banyak Barang yang Anda Beli?\t:");
 counter = inputUser.nextInt();

 while (i < counter) {
 System.out.println("Input Item\t: ");
 user = inputUser.next();
 itemList.add(user);
 //Menambahkan List Harga Sesuai dengan item
 if (itemList.get(i).equals("minyak")) {
 harga.add(45000);
 } else if (itemList.get(i).equals("terigu")) {
 harga.add(13000);
 } else if (itemList.get(i).equals("telur")) {
 harga.add(27000);
 } else if (itemList.get(i).equals("roti")) {
 harga.add(12000);
 }
 //Variabel total belanja
 total = total + harga.get(i);
 i++;
 }
 
 System.out.println();
 System.out.println();
 System.out.println("============================");
 System.out.println("CALCULATOR");
 System.out.println("============================");
 //Menampilkan kalkulator harga
 for (int j = 0; j < counter; j++) {
 System.out.println(itemList.get(j));
 System.out.println("\t\tRp" + harga.get(j));
 }
 System.out.println("\t\t__________+");
 System.out.println("total:\t\tRp" + total);
 //Program uang kembalian
 System.out.println();
 System.out.println();
 System.out.println("============================");
 System.out.println("Sub Total");
 System.out.println("============================");
 System.out.println("Yang dibayar:");
 System.out.println("\t\tRp" + uang);
 System.out.println("Total:");
 System.out.println("\t\tRp" + total);
 System.out.println("\t\t__________-");
 sisaUang = uang - total;
 System.out.println("Total");
 System.out.println("\t\tRp" + sisaUang);

 //Struck
 System.out.println();
 System.out.println();
 System.out.println("============================");
 System.out.println("INVOICE");
 System.out.println("============================");
 System.out.println("Items yang dibeli: " + itemList);
 System.out.println("Detail harga\t: " + harga);
 System.out.println("Total harga\t: " +"Rp"+total);
 System.out.println("Sisa Uang\t: " + "Rp"+sisaUang);
}
}
