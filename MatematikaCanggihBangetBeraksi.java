/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 
 */
public class MatematikaCanggihBangetBeraksi {
    public static void main(String[] args) {
        MatematikaCanggihBanget Matematika = new MatematikaCanggihBanget();
        int hasilPertambahan = Matematika.pertambahan(10, 5);
        System.out.println("hasil Pertambahan:" + hasilPertambahan);
        int hasilPerkalian = Matematika.perkalian(10,5);
        System.out.println("hasil Perkalian:" + hasilPerkalian);
        int hasilModulus = Matematika.modulus(10,3);
        System.out.println(" hasil Modulus:" + hasilModulus);
        int hasilPertambahantiga = Matematika.Pertambahantiga(10, 5,3);
        System.out.println("hasil pertambahantiga:" + hasilPertambahantiga);
    }
    
}
