/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas_pertemuan9;

/**
 *
 * @author WINDOWS 10
 */
public class polimorfisme_static {
    
    //PROGRAM INI UNTUK PEMBAYARAN DENGAN POLIMORFISME STATIC
    //POIMORFISME DIBUAT DENGAN NAMA METHOD YANG SAMA YAITU BAYAR
    //PARAMETER YANG DIGUNAKAN BERBEDA BEDA TIPE DATANYA
    //DAN HANYA DIBUAT DALAM SATU KELAS SAJA
    
    //PEMBAYARAN TUNAI
    public void bayar(int jumlah) {
        System.out.println("Pembayaran tunai sebesar Rp" + jumlah + " berhasil.");
    }
    //PEMBAYARAN KARTU KREDIT
    public void bayar(String nomorKartu, float jumlah) {
        System.out.println("Pembayaran dengan kartu kredit nomor " + nomorKartu + 
                " sebesar Rp" + jumlah + " berhasil.");
    }
    
    //PEMBAYARAN TRANSFER
    public void bayar(String nomorRekening, double jumlah) {
        System.out.println("Pembayaran melalui transfer ke rekening " 
                + nomorRekening + " sebesar Rp" + jumlah + " berhasil.");
    }

    //TAMPILKAN 
    public static void main(String[] args) {
        polimorfisme_static pembayaran = new polimorfisme_static ();
        
        // Pembayaran tunai
        pembayaran.bayar(100000);

        // Pembayaran kartu kredit
        pembayaran.bayar("1234567890123456", 500000);

        // Pembayaran transfer
        pembayaran.bayar("1234567890", 250000);
    }
        
    }
    
    

