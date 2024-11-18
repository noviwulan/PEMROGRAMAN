/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas_pertemuan2;

/**
 *
 * @author WINDOWS 10
 */
public class SIMKRS {
    public static void main(String[] args) {
        MasterMahasiswa mhs = new MasterMahasiswa ();
        MasterMatkul matkul = new MasterMatkul ();
        MasterDosen Dosen = new MasterDosen ();
        
        System.out.println("Nama MahaSiswa :" + mhs.nama);
        System.out.println("Nomor Induk Mahasiswa :" + mhs.nim);
        System.out.println("Nilai :" + mhs.nilai);
        System.out.println("Nama Mata Kuliah :" + matkul.rabu1);
        System.out.println("Nama Dosen Pengampu :" + Dosen.Pemrograman2);
        System.out.println("Nama Dosen Wali :" + Dosen.Dosenwali);
    }
    
}
