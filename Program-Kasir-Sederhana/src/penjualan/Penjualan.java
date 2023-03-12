/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package penjualan;

import java.util.Scanner;

/**
 *
 * @author AHMAD NAJMUDIN
 */

//test
public class Penjualan {
    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);
        System.out.println("Masukan Nama Kasir : ");
        String namaKasir;
        namaKasir = inputUser.nextLine();
        
        dataBarang[] dataBrg = new dataBarang[0];
        
        int Pilihan, jumlahBarang, x;
        do {
            System.out.println("Silahkan pilih Menu transaksi :");
            System.out.println("1. Input data penjualan");
            System.out.println("2. Pembayaran");
            System.out.println("3. Keluar Program");
            Pilihan = inputUser.nextInt();
            switch(Pilihan){
                case 1:
                    System.out.println("Masukan jumlah barang : ");
                    jumlahBarang = inputUser.nextInt();
                    dataBrg = new dataBarang[jumlahBarang];
                    for(x = 0; x < dataBrg.length; x++){
                        dataBrg[x] = new dataBarang();
                        System.out.println("Barang ke : " + (x+1));
                        System.out.println("Masukan kode barang :"); dataBrg[x].setKodeBarang(inputUser.next());
                        System.out.println("Masukan nama barang :"); dataBrg[x].setNamaBarang(inputUser.next());
                        System.out.println("Masukan harga barang :"); dataBrg[x].setHargaBarang(inputUser.nextFloat());
                        System.out.println("Masukan jumlah beli :"); dataBrg[x].setJumlahBeli(inputUser.nextInt());
                    }
                    break;
                case 2:
                    System.out.println("DATA PENJUALAN BARANG");
                    System.out.println("PT. PEMULANG TAMA");
                    System.out.println("Nama Kasir : " + namaKasir);
                    System.out.println("================================================================================");
                    System.out.println("No. \tKode Barang \tNama Barang \tHarga Barang \tJumlah Beli \tBayar");
                    System.out.println("================================================================================");
                    for (x = 0; x < dataBrg.length; x++){
                        System.out.println((x + 1) + "\t" + dataBrg[x].getKodeBarang() + "\t" + "\t" + dataBrg[x].getNamaBarang() + "\t" + "\t" + dataBrg[x].getHargaBarang() + "\t" + "\t" + dataBrg[x].getJumlahBeli() + "\t" + "\t" + dataBrg[x].getbayar());
                    }
            }
        }while (Pilihan !=3);
    }
}
