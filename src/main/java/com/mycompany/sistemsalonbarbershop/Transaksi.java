/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemsalonbarbershop;

/**
 *
 * @author Lenovo
 */
public class Transaksi {
    //Field
    private Pelanggan pelanggan;
    private Karyawan karyawan;
    private Layanan layanan;
    
    //Constructor
    public Transaksi(Pelanggan pelanggan, Karyawan karyawan, Layanan layanan) {
        this.pelanggan = pelanggan;
        this.karyawan = karyawan;
        this.layanan = layanan;
    }
    
    //Method
    public double hitungTotal() {
        return layanan.getHarga();
    }
    
    public void cetakStruk() {
        System.out.println("===== STRUK TRANSAKSI =====");
        pelanggan.tampilkanInfo();
        karyawan.tampilkanInfo();
        layanan.tampilkanInfo();
        System.out.println("Total Bayar: Rp" + hitungTotal());
        System.out.println("===========================");
    }
    
}
