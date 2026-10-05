/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemsalonbarbershop;

/**
 *
 * @author Lenovo
 */
public class KaryawanSenior extends Karyawan {
    public KaryawanSenior(String nama, String spesialisasi) {
        super(nama, spesialisasi);
    }

    public String getPeran() {
        return super.getPeran() + " - Senior";
    }
    
    public void tampilkanJadwal() {
        System.out.println("Jadwal " + nama + ": Senin - Sabtu, 09.00 - 20.00");
    }
}