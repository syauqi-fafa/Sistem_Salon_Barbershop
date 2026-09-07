/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemsalonbarbershop;

/**
 *
 * @author Lenovo
 */
public class Layanan {
    //Field
    private String namaLayanan;
    private double harga;
    private int durasiMenit;
    
    //Constructor
    public Layanan(String namaLayanan, double harga, int durasiMenit) {
        this.namaLayanan = namaLayanan;
        this.harga = harga;
        this.durasiMenit = durasiMenit;
    }
    
    //Method
    public String getNamaLayanan() {
        return namaLayanan;
    }
    
    public double getHarga() {
        return harga;
    }
    
    public int getDurasiMenit() {
        return durasiMenit;
    }
    
    public void tampilkanInfo() {
        System.out.println(namaLayanan + " - Rp" + harga + " (" + durasiMenit + " menit )");
    }
}
