/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemsalonbarbershop;

/**
 *
 * @author Lenovo
 */
public class Karyawan {
    //Field
    private String nama;
    private String spesialisasi;
    
    //Constructor
    public Karyawan(String nama, String spesialisasi){
        this.nama = nama;
        this.spesialisasi = spesialisasi;
    }
    
    //Getter & Setter untuk nama
    public String getNama(){
        return nama;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    //Getter & Setter untuk spesialisasi
    public String getSpesialisasi(){
        return spesialisasi;
    }
    
    public void setSpesialisasi(String spesialisasi) {
        this.spesialisasi = spesialisasi;
    }
    
    //method untuk menampilkan informasi
    public void tampilkanInfo(){
        System.out.println("Kapster: " + nama + " (Spesialisasi: " + spesialisasi + ")");
    }
}