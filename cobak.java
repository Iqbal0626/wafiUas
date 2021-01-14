/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mesinminuman;

import java.util.Scanner;

/**
 *
 * @author M WAFIYUL AHDI
 */
public class cobak {

    public static void main(String[] args) {
//        Meggunakan java scanner
        Scanner scan = new Scanner(System.in);
//        menampilkan menu makanan
        System.out.println("Menu Minuman : ");
        System.out.println("_________________________________");
        System.out.println("No Nama             Harga");
        System.out.println("1. Jus          Rp 10000,00");
        System.out.println("2. Coffe        Rp 7000,00");
        System.out.println("3. Air          Rp 5000,00");
        System.out.println("4. Soda         Rp 13000,00");
        System.out.println("");
//        declarasi harga awal
        double harga = 0;
        int jmlhBelijus = 0;
        int jmlhBelikopi = 0;
        int jmlhBelisoda = 0;
        int jmlhBeliair = 0;
//        decralasi harga menu
        int h1 = 10000, h2 = 7000, h3 = 5000, h4 = 13000;
        String menu;
        for (String i = "Y"; i.equals("Y") || i.equals("y");) {
            System.out.println("_________________________________");
//        pengguna memasukkan nomor pesanan
            System.out.print("Masukkan Nomor Pesanan : ");
            int inNomor = scan.nextInt();
            System.out.println("___________________________________________________________________");
            if (inNomor == 1) {
//            jika nomor satu, maka minuman yang dipilih adalah Jus
                menu = " Jus";
                System.out.println("Minuman yang anda pilih adalah " + menu);
                System.out.println("");
                System.out.println("Berapa jumlah yang akan anda beli : ");

                if (jmlhBeliair == 1) {
                    int jmlhBeli = scan.nextInt();
                    jmlhBelijus = jmlhBeli;
                    harga = harga + jmlhBelijus * (h1 * (100-1)/100);
                } else {
                    int jmlhBeli = scan.nextInt();
                    jmlhBelijus = jmlhBeli;
                    harga = harga + h2 * jmlhBelijus;
                }
            } else if (inNomor == 2) {
//            jika nomor dua, maka minuman yang dipilih adalah Teh pucuk

                menu = " Kopi";
                System.out.println("Minuman yang anda pilih adalah " + menu);
                System.out.println("");
                System.out.println("Berapa jumlah yang akan anda beli : ");
                if (jmlhBelijus == 3) {
                    int jmlhBeli = scan.nextInt();
                    jmlhBelikopi = jmlhBeli;
                    harga = harga + jmlhBelikopi * (h2 * (100-3)/100);
                }else if (jmlhBeliair == 1) {
                    int jmlhBeli = scan.nextInt();
                    jmlhBelikopi = jmlhBeli;
                    harga = harga + jmlhBelikopi * (h2 * (100-0.3)/100);
                } else {
                    int jmlhBeli = scan.nextInt();
                    jmlhBelikopi = jmlhBeli;
                    harga = harga + h2 * jmlhBelikopi;
                }
            } else if (inNomor == 3) {
//            jika nomor tiga, maka minuman yang dipilih adalah Aqua
                menu = " Air";
                System.out.println("Minuman yang anda pilih adalah " + menu);
                System.out.println("");
                System.out.println("Berapa jumlah yang akan anda beli : ");

                if (jmlhBelikopi == 3 && jmlhBelisoda == 3) {
                    int jmlhBeli = scan.nextInt();
                    jmlhBeliair = jmlhBeli;
                    harga = harga + jmlhBeliair * (h3 * (100-9)/100);
                } else {
                    int jmlhBeli = scan.nextInt();
                    jmlhBeliair = jmlhBeli;
                    harga = harga + h3 * jmlhBeliair;
                }
            } else if (inNomor == 4) {
//            jika nomor tiga, maka minuman yang dipilih adalah Aqua
                menu = " Soda";
                System.out.println("Minuman yang anda pilih adalah " + menu);
                System.out.println("");
                System.out.println("Berapa jumlah yang akan anda beli : ");

                if (jmlhBeliair == 1) {
                    int jmlhBeli = scan.nextInt();
                    jmlhBelisoda = jmlhBeli;
                    harga = harga + jmlhBelisoda * (h4 * (100-0.3)/100);
                } else {
                    int jmlhBeli = scan.nextInt();
                    jmlhBelisoda = jmlhBeli;
                    harga = harga + h4 * jmlhBelisoda;
                }
                {
                    System.out.println("Nomor yang dipilih tidak ada di menu.");
                }
            }
//            User diperintahkan untuk memilih lagi atau tidak
                System.out.println("Apakah anda mau melanjutkan? Y/T");
                i = scan.next();
            }
            System.out.println("___________________________________________________________________");
            System.out.println("Total pembayaran sebesar " + harga + ".");
            System.out.println("Terimakasih atas kunjungannya.");
        
    }
}
