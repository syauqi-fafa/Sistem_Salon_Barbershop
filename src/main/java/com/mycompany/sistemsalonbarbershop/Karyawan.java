/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemsalonbarbershop;

/**
 *
 * @author Lenovo
 */
public class Karyawan extends Orang implements Pekerja {
    protected String spesialisasi;

    public Karyawan(String nama, String spesialisasi) {
        super(nama);
        this.spesialisasi = spesialisasi;
    }

    public String getSpesialisasi() {
        return spesialisasi;
    }

    public void setSpesialisasi(String spesialisasi) {
        this.spesialisasi = spesialisasi;
    }

 
    public String getPeran() {
        return "Kapster (" + spesialisasi + ")";
    }

    
    public void lakukanTugas() {
        System.out.println(nama + " sedang melayani pelanggan.");
    }
}