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
        
        Orang[] daftar = new Orang[4];
        daftar[0] = new Pelanggan("Arvel", "084521367841");
        daftar[1] = new Karyawan("Jean", "Potong Rambut Pria");
        daftar[2] = new KaryawanSenior("Hazella", "Perawatan Rambut");
        daftar[3] = new Manajer("Bu Rina", "Bandar Lampung");

        for (Orang o : daftar) {
            o.tampilkanIdentitas(); 

            
            if (o instanceof Pekerja) {
                Pekerja p = (Pekerja) o;
                p.lakukanTugas();
                p.tampilkanJadwal();
            }
            System.out.println();
        }

        
        Manajer manajer = (Manajer) daftar[3];
        manajer.beriDiskon("Arvel", 20000);
        manajer.beriDiskon("Arvel", 70000, "Pelanggan ulang tahun");

        
        Layanan potongRambut = new Layanan("Potong Rambut", 35000, 30);
        Pelanggan pelanggan1 = (Pelanggan) daftar[0];
        Karyawan kapster1 = (Karyawan) daftar[1];
        Transaksi transaksi1 = new Transaksi(pelanggan1, kapster1, potongRambut);
        transaksi1.cetakStruk();
    }
}