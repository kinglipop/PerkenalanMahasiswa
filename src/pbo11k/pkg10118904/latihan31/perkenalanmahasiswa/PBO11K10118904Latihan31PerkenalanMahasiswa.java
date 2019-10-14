/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k.pkg10118904.latihan31.perkenalanmahasiswa;

/**
 *
 * @author ACER
 * Nama     : Firman Alfinas
 * Kelas    : IF 11-K
 * Nim      : 10118904
 * Deskripsi Program : Program ini berisi tentang perkenalan mahasiswa
 */
public class PBO11K10118904Latihan31PerkenalanMahasiswa {
        public static Mahasiswa Mahasiswa = new Mahasiswa();
        public static void tampilNama(String nama, String nim) {
        Mahasiswa.nama = nama;
        Mahasiswa.nim = nim;
        Mahasiswa.perkenalanDiri();
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        tampilNama("Rizki Adam Kurniawan", "10110269");
        tampilNama("Indra Tiola", "10110270");
        tampilNama("Robi Tansil Ganefi","10110271");
        tampilNama("Muhammad Nur Awaludin", "10110269");
    }
    
}
