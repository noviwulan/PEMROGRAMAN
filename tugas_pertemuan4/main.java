/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan_pertemuan4;

/**
 *
 * @author WINDOWS 10
 */
public class main {
    public static void main(String[] args) {
        Buah fruit = new Buah ();
        Jeruk jrk = new Jeruk ();
        Strowbery stw = new Strowbery ();
        Cabe cb = new Cabe ();
        
       System.out.println ("---------------");
       jrk.warna = ("orange");
       jrk.bentuk = ("bulat");
       System.out.println ("Jeruk itu warnanya : "+jrk.warna);
       System.out.println ("Jeruk itu bentuknya : "+jrk.bentuk);
       
       stw.warna = ("merah");
       stw.bentuk = ("oval");
       System.out.println ("Strowbery itu warnanya : "+stw.warna);
       System.out.println ("Strowbery bentuknya : "+stw.bentuk);
       
       cb.warna = ("merah");
       cb.bentuk = ("lonjong");
       System.out.println ("Cabe itu warnanya : "+cb.warna);
       System.out.println ("Cabe itu bentuknya : "+cb.bentuk);
       System.out.println ("---------------");
       
       System.out.println ("===================");
       jrk.berbiji();
       stw.berbiji();
       cb.berbiji();
        System.out.println ("====================");
    }
    
}
