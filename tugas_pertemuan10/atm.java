/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas_pertemuan10;

/**
 *
 * @author WINDOWS 10
 */
public class atm extends induk_pembayaran{
     @Override
     public void bayar(int jumlah) {
        System.out.println
        ("Pembayaran dengan kartu kredit sebesar Rp" + jumlah + " berhasil.");
        }
     
     @Override
     void via ()
     {System.out.println("PEMBAYARAN MELALUI : ATM ");}
    
}
