/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package KartuStok;

import Barang.barang;
import java.util.Date;

/**
 *
 * @author Awenk
 */
public class KartuStok {

    private Date tanggal;
    private String nobukti;
    private String keterangan;
    private int masuk;
    private int keluar;
    private long saldoStok;
    private barang kodebarang;
    private long nilaiPersedian;

    public KartuStok() {
    }

    public Date getTanggal() {
        return tanggal;
    }

    public void setTanggal(Date tanggal) {
        this.tanggal = tanggal;
    }

    public String getNobukti() {
        return nobukti;
    }

    public void setNobukti(String nobukti) {
        this.nobukti = nobukti;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    public int getMasuk() {
        return masuk;
    }

    public void setMasuk(int masuk) {
        this.masuk = masuk;
    }

    public int getKeluar() {
        return keluar;
    }

    public void setKeluar(int keluar) {
        this.keluar = keluar;
    }

    public long getSaldoStok() {
        return saldoStok;
    }

    public void setSaldoStok(long saldoStok) {
        this.saldoStok = saldoStok;
    }

    public barang getKodebarang() {
        return kodebarang;
    }

    public void setKodebarang(barang kodebarang) {
        this.kodebarang = kodebarang;
    }

    public long getNilaiPersedian() {
        return nilaiPersedian;
    }

    public void setNilaiPersedian(long nilaiPersedian) {
        this.nilaiPersedian = nilaiPersedian;
    }

}
