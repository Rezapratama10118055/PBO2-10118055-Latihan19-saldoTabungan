/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118055.latihan19;
/**
 *
 * @author User
 */
public class PBO210118055Latihan19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double saldo = 2500000;
         int i;
        for (i = 1; i< 7; i++){
          saldo = saldo+(saldo*0.15);
          i=i+0;
          System.out.println("saldo di bulan ke-"+i+":"+saldo);
        }
        
    }
    
}
