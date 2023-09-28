/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pbo2_41822010079_latihan25;

import java.util.Scanner;

/**
 *
 * @author ASUS
 * Nama : Adjeng Rara Rengganis
 * NIM  : 41822010079
 * Nama : Vanisha Putri Kania
 * NIM  : 41822010082
 */
public class PBO2_41822010079_Latihan25 
{

    public static void main(String[] args) 
    {
       System.out.println("Format Tugas PBO");
      
        try (Scanner input = new Scanner(System.in)) 
        {
            System.out.print("Masukkan nama depan Anda untuk dieja: ");
            String nama = input.nextLine();
            
            ejaNama(nama);
        }
    }

    public static void ejaNama(String nama) 
    {
        System.out.println("Ejaan nama \"" + nama + "\":");
        for (int i = 0; i < nama.length(); i++) 
        {
            char huruf = nama.charAt(i);
            int indeks = i + 1; 

            System.out.println("Huruf ke-" + indeks + ": " + huruf);
        }
    }
}
