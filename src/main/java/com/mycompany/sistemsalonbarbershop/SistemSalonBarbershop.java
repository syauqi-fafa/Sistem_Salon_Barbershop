/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sistemsalonbarbershop;

/**
 *
 * @author Lenovo
 */
public class SistemSalonBarbershop {

    public static void main(String[] args) {
        Layanan potongRambut = new Layanan("Potong Rambut", 35000, 30);
        Layanan creambath = new Layanan("Creambath", 45000, 50);
        
        Karyawan kapster1 = new Karyawan("Jean", "Potong Rambut Pria");
        Karyawan kapster2 = new Karyawan("Hazella", "Perawatan Rambut");
        
        Pelanggan pelanggan1 = new Pelanggan("Arvel", "084521367841");
        Pelanggan pelanggan2 = new Pelanggan("Jaesly", "08139531520");
        
        Transaksi transaksi1 = new Transaksi(pelanggan1, kapster1, potongRambut);
        Transaksi transaksi2 = new Transaksi(pelanggan2, kapster2, creambath);
        
        transaksi1.cetakStruk();
        System.out.println();
        transaksi2.cetakStruk();
    }
}