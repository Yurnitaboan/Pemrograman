/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Mariana Farlin
 */
public class Bank {
    private int saldo;
    
    public Bank(int saldo){
        this.saldo = saldo;
    }
    
    public void SimpanUang(int jumlah){
        saldo += jumlah;
        System.out.println("Simpan Uang: Rp." + jumlah);
    }
    
    public void AmbilUang(int jumlah){
        if (jumlah > saldo){
         System.out.println("saldo tidak cukup untuk mengambil uang Rp." + jumlah);
        }else{
         saldo -= jumlah;
         System.out.println("Ambil Uang Rp." + jumlah);
            
        }
    
    
    }
    public int getsaldo(){
        return saldo;
        
    }   
    
}
    

