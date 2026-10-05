/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.sistemsalonbarbershop;

/**
 *
 * @author Lenovo
 */
public interface PemberiDiskon {
    double DISKON_MAKSIMAL = 50000; 

    void beriDiskon(String namaPelanggan, double diskon);
}