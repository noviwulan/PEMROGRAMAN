/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas_pertemuan6;

/**
 *
 * @author WINDOWS 10
 */
public class Mahasiswa {
    //this digunakan untuk mengambil variabel dari class itu sendiri,
    //jika tidak dilakukan this maka assigment to it self
    private String nama;
    private int nim;
    
    //INI METHOD SETTER
    public void setNama(String nama)
    { this.nama = nama; }
    
    public void setNim(int nim)
    { this.nim = nim; }  
    
    //INI METHOD GETTER
    public String getNama()
    { return this.nama; }
    
    public int getNim()
    { return this.nim; }
    
    public static void main(String[] args) {
        Mahasiswa novi = new Mahasiswa();
        
        //MENGGUNAKAN METHOD SETTER
        novi.setNama("NOVI WULANDARI");
        novi.setNim(1010);
        
        //MENGGUNAKAN METHOD GETTER
        System.out.println("Nama Mahasiswa Adalah : " +novi.getNama());
        System.out.println("NIM Mahasiswa Adalah : " +novi.getNim());
        
    }
    
}
