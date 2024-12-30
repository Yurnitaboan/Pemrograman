/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Mariana Farlin
 */
public class ACBeraksi {
    public void matikanAC() {
        System.out.println("AC Dimatikan");
    }
     public void hidupkanAC() {
         System.out.println("AC Dihidupkan");
    }
      public void dinginkanAC() {
          System.out.println("AC sedang mendinginkan ruangan");
    }
      public void panaskanAC() {
           System.out.println("AC sedang memanaskan ruangan.");
    }
      
      public static void main(String[] args) {
         ACBeraksi ac = new ACBeraksi();
            ac.matikanAC();
            ac.hidupkanAC();
            ac.dinginkanAC();
            ac.panaskanAC();
         
    }
     
}
