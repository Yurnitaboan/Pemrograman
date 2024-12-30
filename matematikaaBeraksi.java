/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Mariana Farlin
 */
public class matematikaaBeraksi {
    public static void main(String[] args) {
        matematikaa matematikaa = new matematikaa();
        int hasilPertambahan = matematikaa.Pertambahan(20, 20);
        System.out.println("hasil dari 20 + 20 = " + hasilPertambahan);
        int hasilPengurangan = matematikaa.Pengurangan(10,5);
        System.out.println("hasil dari 10 - 5 = " + hasilPengurangan);
        int hasilPerkalian = matematikaa.Perkalian(10,20);
        System.out.println("hasil dari 10 * 20 = " + hasilPerkalian);
        int hasilPembagian = matematikaa.Pembagian(21,2);
        System.out.println("hasil dari 21 / 2 = " + hasilPembagian);
    }
}
   