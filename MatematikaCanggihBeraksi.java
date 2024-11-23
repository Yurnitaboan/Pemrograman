/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lenovo
 */
public class MatematikaCanggihBeraksi {
    public static void main(String[] args) {
        // Membuat objek MatematikaCanggih
        MatematikaCanggih math = new MatematikaCanggih();
        int hasilTambah = math.Tambah(10, 5);
        System.out.println("hasil pertambahan:" + hasilTambah);
        int hasilKali = math.Kali(10, 5);
        System.out.println("hasil perkalian:" + hasilKali);
        int hasilModulus = math.modulus(10, 3);
        System.out.println("hasil modulus: " + hasilModulus);
        
        
    }
    
}
