/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas_pertemuan7;

/**
 *
 * @author WINDOWS 10
 */
public class construktor {
    //method yg digunakan untuk menginstansi sebuah objek
    //nama contruktor sama dengan nama class 
    /*pastikan memberikan modifier public pada construktor karena akan 
    dieksekusi saat pembuatan objek (instance)
    //contruktor parameter = untuk menyiapkan inizialisasi data untuk class
    */
    public String nama;
    public int nim;
    
    //MEMBUAT CONSTRUKTOR
    public construktor (String nama, int nim)
    { this.nama = nama;
      this.nim = nim;
    }
   
    public static void main(String[] args) {
        construktor mahasiswa = new construktor("NOVI WULANDARI", 1010);
        System.out.println("Nama Mahasiswa Ini Adalah : " +mahasiswa.nama);
        System.out.println("NIM Mahasiswa Ini Adalah : " +mahasiswa.nim);
        
    }
}
    
