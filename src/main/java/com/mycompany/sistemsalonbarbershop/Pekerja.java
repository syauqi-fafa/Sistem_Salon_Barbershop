/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.sistemsalonbarbershop;

/**
 *
 * @author Lenovo
 */
public interface Pekerja {
    void lakukanTugas(); 

    
    default void tampilkanJadwal() {
        System.out.println("Jadwal kerja belum ditentukan.");
    }
}
