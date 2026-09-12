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
    public Layanan() {
    }
    
    public Layanan(String namaLayanan, double harga, int durasiMenit) {
        this.namaLayanan = namaLayanan;
        this.harga = harga;
        this.durasiMenit = durasiMenit;
    }
    
    
    public String getNamaLayanan() {
        return namaLayanan;
    }
    
    public void setNamaLayanan(String namaLayanan) {
        this.namaLayanan = namaLayanan;
    }
    
    public double getHarga() {
        return harga;
    }
    
    public void setHarga(double harga) {
        this.harga = harga;
    }
    
    public int getDurasiMenit() {
        return durasiMenit;
    }
    
    public void setDurasiMenit(int durasiMenit) {
        this.durasiMenit = durasiMenit;
    }
    
    public void tampilkanInfo() {
        System.out.println(namaLayanan + " - Rp" + harga + " (" + durasiMenit + " menit )");
    }
}
