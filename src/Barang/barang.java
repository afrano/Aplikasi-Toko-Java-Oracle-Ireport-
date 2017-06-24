/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Barang;

import Kategori.KategoriBrng;

/**
 *
 * @author basisb09
 */
public class barang {

    private String kode;
    private String barcode;
    private String namabarang;
    private KategoriBrng kategori;
    private String satuan;
    private int qtymax;
    private int qtymin;
    private double hargajual;
    private double hargajualppn;
    private double hargabeli;
    private double hargabelippn;
    private String gambar;

    public barang() {
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getGambar() {
        return gambar;
    }

    public void setGambar(String gambar) {
        this.gambar = gambar;
    }

    public double getHargabeli() {
        return hargabeli;
    }

    public void setHargabeli(double hargabeli) {
        this.hargabeli = hargabeli;
    }

    public double getHargabelippn() {
        return hargabelippn;
    }

    public void setHargabelippn(double hargabelippn) {
        this.hargabelippn = hargabelippn;
    }

    public double getHargajual() {
        return hargajual;
    }

    public void setHargajual(double hargajual) {
        this.hargajual = hargajual;
    }

    public double getHargajualppn() {
        return hargajualppn;
    }

    public void setHargajualppn(double hargajualppn) {
        this.hargajualppn = hargajualppn;
    }

    public KategoriBrng getKategori() {
        return kategori;
    }

    public void setKategori(KategoriBrng kategori) {
        this.kategori = kategori;
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getNamabarang() {
        return namabarang;
    }

    public void setNamabarang(String namabarang) {
        this.namabarang = namabarang;
    }

    public int getQtymax() {
        return qtymax;
    }

    public void setQtymax(int qtymax) {
        this.qtymax = qtymax;
    }

    public int getQtymin() {
        return qtymin;
    }

    public void setQtymin(int qtymin) {
        this.qtymin = qtymin;
    }

    public String getSatuan() {
        return satuan;
    }

    public void setSatuan(String satuan) {
        this.satuan = satuan;
    }
    
    
}
