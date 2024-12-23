/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas_pertemuan10;

/**
 *
 * @author WINDOWS 10
 */
public class display {
    
    public static void main(String[] args) {
        induk_pembayaran pembayaran ;
        
        // Pembayaran tunai
        pembayaran = new tunai();
        pembayaran.via();
        pembayaran.bayar(100000);

        // Pembayaran kartu kredit
        pembayaran = new atm();
        pembayaran.via();
        pembayaran.bayar(500000);

        // Pembayaran transfer
        pembayaran = new transfer();
        pembayaran.via();
        pembayaran.bayar(250000);
    }
}
    
    

