/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemsalonbarbershop;

/**
 *
 * @author Lenovo
 */
public abstract class Orang {
    protected String nama;

    public Orang(String nama) {
        this.nama = nama;
    }

    
    public abstract String getPeran();

    
    public void tampilkanIdentitas() {
        System.out.println("Nama  : " + nama);
        System.out.println("Peran : " + getPeran());
    }
}