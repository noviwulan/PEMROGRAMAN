/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas_pertemuan8;

/**
 *
 * @author WINDOWS 10
 */
public class enkapsulasi_setget {
    /*enkapsulasi adalah pembungkus data dg modifier private 
    agar tidak dapat diakses dari luar class secara langsung
    */
    //method setter&getter yang akan membantu mengakses data yang dienkapsulasi
    private String namadosen;
    private int nidn;
    
    //INI METHOD SETTER
    public void setNama(String NamaDosen)
    { this.namadosen = NamaDosen; }
    
    public void setNIDN(int NIDN)
    { this.nidn = NIDN; }
    
    //INI METHOD GETTER
    public String getnamadosen()
    { return this.namadosen; }
    
    public int getnidn()
    { return this.nidn; }
    
    public static void main(String[] args) {
        //MEMBUAT CLAS BARU DARI OBJEK enkapsulasi_setget
        enkapsulasi_setget wulan = new enkapsulasi_setget();
        
        //MENGGUNAKAN SETTER
        wulan.setNama("WULAN DARI");
        wulan.setNIDN(235520);
        
        //MENGGUNAKAN METHOD GETTER
        System.out.println("Nama Dosen Adalah : "+wulan.getnamadosen());
        System.out.println("Nomor Induk Dosen Nasional Adalah : "+wulan.getnidn());
        
        
        
    }
}
