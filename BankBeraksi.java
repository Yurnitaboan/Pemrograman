/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Mariana Farlin
 */
public class BankBeraksi {
    public static void main(String[] args) {
        Bank Bank = new Bank(100000);
        System.out.println("Selamat Datang di Bank ABC");
        System.out.println("saldo saat ini Rp." + Bank.getsaldo());
        Bank.SimpanUang(500000);
        System.out.println("saldo saat ini Rp." + Bank.getsaldo());
        Bank.AmbilUang(150000);
        System.out.println("saldo saat ini Rp" + Bank.getsaldo());
    }
    
}
