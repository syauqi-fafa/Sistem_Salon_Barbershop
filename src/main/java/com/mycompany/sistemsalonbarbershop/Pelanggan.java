/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemsalonbarbershop;

/**
 *
 * @author Lenovo
 */
public class Pelanggan {
    //Field
    private String nama;
    private String noTelepon;
    
    //Constructor
    public Pelanggan(String nama, String noTelepon) {
        this.nama = nama;
        this.noTelepon = noTelepon;
    }
    
   
    public String getNama(){
        return nama;
    }
    
    public void setNama(String nama) {
        this.nama =nama;
    }
    
    public String getNoTelepon(){
        return noTelepon;
    }
    
    public void setNoTelepon(String noTelepon) {
        this.noTelepon = noTelepon;
    }
    
    public void tampilkanInfo() {
        System.out.println("Pelanggan: " + nama + " (No. Hp: " + noTelepon + ")");
    }
    
}
