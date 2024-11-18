/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas_pertemuan3rev;
import tugas_pertemuan2.MasterMahasiswa;

/**
 *
 * @author WINDOWS 10
 */
public class KeteranganLulus {
    public static void main(String[] args) {
        //MENGAMBIL OBJEK DARI CLASS MAHASISWA DARI TUGAS SEBELUMNYA
        MasterMahasiswa ms = new MasterMahasiswa ();
        
        //MENENTUKAN KELULUSAN 
        String Ket;
        if(ms.nilai > 70 )
        {Ket ="LULUS";}
        else {Ket = "TIDAK LULUS";}
        
        //TAMPILKAN HASIL
        System.out.println("============================");
        System.out.println("Nama Mahasiswa : " +ms.nama);
        System.out.println("Nilai Mahasiswa : " +ms.nilai);
        System.out.println("Mahasiswa Tersebut Dinyatakan : "+Ket);
        System.out.println("============================");
    }
    
    
}
