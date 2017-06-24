/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package SUPPLIER;

/**
 *
 * @author Rafael Aweng
 */
public class Supplier {
    private String idSuplier;
    private String namaSupplier;
    private String alamatSupplier;
    private String telp;

    public Supplier() {
    }

    public Supplier(String idSuplier, String namaSupplier, String alamatSupplier, String telp) {
        this.idSuplier = idSuplier;
        this.namaSupplier = namaSupplier;
        this.alamatSupplier = alamatSupplier;
        this.telp = telp;
    }

    public String getAlamatSupplier() {
        return alamatSupplier;
    }

    public void setAlamatSupplier(String alamatSupplier) {
        this.alamatSupplier = alamatSupplier;
    }

    public String getIdSuplier() {
        return idSuplier;
    }

    public void setIdSuplier(String idSuplier) {
        this.idSuplier = idSuplier;
    }

    public String getNamaSupplier() {
        return namaSupplier;
    }

    public void setNamaSupplier(String namaSupplier) {
        this.namaSupplier = namaSupplier;
    }

    public String getTelp() {
        return telp;
    }

    public void setTelp(String telp) {
        this.telp = telp;
    }
    
}
