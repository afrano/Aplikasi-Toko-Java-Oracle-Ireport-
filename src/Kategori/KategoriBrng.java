/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Kategori;

/**
 *
 * @author basisb21la
 */
public class KategoriBrng {
    private String kode;
    private String kategori;

    public KategoriBrng() {
    }

    public KategoriBrng(String kode, String kategori) {
        this.kode = kode;
        this.kategori = kategori;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }
    
}
