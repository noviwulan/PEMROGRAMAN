/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas_pertemuan3rev;

/**
 *
 * @author WINDOWS 10
 */
public class Prosedural_LuasLingkaran {
    
    static void hitungLuasLingkaran(float phi,int r){
        float luas = phi *(r*r);
        System.out.println("Phi = " +phi);
        System.out.println("Jari-Jari = " +r);
        System.out.println("Luas Lingkaran adalah  = " +luas);
         
    }
    
    public static void main(String[] args) {
         System.out.println("---------------");
        float phi = 3.14f;
        int r = 10;
        hitungLuasLingkaran(phi,r);
         System.out.println("---------------");
    }
}
