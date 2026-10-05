/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemsalonbarbershop;

/**
 *
 * @author Lenovo
 */
public class Manajer extends Orang implements Pekerja, PemberiDiskon {
    private String cabang;

    public Manajer(String nama, String cabang) {
        super(nama);
        this.cabang = cabang;
    }

    public String getPeran() {
        return "Manajer cabang " + cabang;
    }

    public void lakukanTugas() {
        System.out.println(nama + " mengawasi operasional cabang " + cabang + ".");
    }

    public void tampilkanJadwal() {
        System.out.println("Jadwal " + nama + ": Senin - Minggu, 08.00 - 21.00");
    }

    public void beriDiskon(String namaPelanggan, double diskon) {
        if (diskon > DISKON_MAKSIMAL) {
            diskon = DISKON_MAKSIMAL;
        }
        System.out.println(nama + " memberi diskon Rp" + diskon + " kepada " + namaPelanggan);
    }

    public void beriDiskon(String namaPelanggan, double diskon, String alasan) {
        beriDiskon(namaPelanggan, diskon);
        System.out.println("Alasan: " + alasan);
    }
}