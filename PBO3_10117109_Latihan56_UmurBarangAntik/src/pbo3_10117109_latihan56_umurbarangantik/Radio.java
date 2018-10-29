/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3_10117109_latihan56_umurbarangantik;

/**
 * Nama  : Stefanus Saputra
 * NIM   : 10117109
 * Kelas : IF 3
 * Deskripsi Program : program ini berisi program untuk menampilkan umur dari
* barang antik yaitu radio dengan konsep inheritance
 */
public class Radio extends BarangAntik {
    
    private String nama;

    public Radio(int umur) {
        super(umur);
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}
