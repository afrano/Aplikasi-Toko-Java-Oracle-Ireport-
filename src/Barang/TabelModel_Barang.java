/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Barang;

import Kategori.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.event.TableModelListener;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author basisb21la
 */
public class TabelModel_Barang extends AbstractTableModel {

    private List<barang> kat = new ArrayList<barang>();

    public TabelModel_Barang(List<barang> kate) {
        this.kat = kate;
    }

    @Override
    public int getRowCount() {
        return kat.size();
    }

    @Override
    public int getColumnCount() {
        return 9;//menampilkan jumlah kolom
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        barang k = kat.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return rowIndex + 1;
            case 1:
                return k.getKode();
            case 2:
                return k.getNamabarang();
            case 3:
                return k.getKategori().getKode();
            case 4:
                return k.getSatuan();
            case 5:
                return k.getQtymin();
            case 6:
                return k.getQtymax();
            case 7:
                return k.getHargabelippn();
            case 8:
                return k.getHargajualppn();
            default:

                return "";
        }
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "No";
            case 1:
                return "Kode";
            case 2:
                return "Barang";
            case 3:
                return "Kategori";
            case 4:
                return "Satuan";
            case 5:
                return "Min";
            case 6:
                return "Max";
            case 7:
                return "Harga Beli";
            case 8:
                return "Harga Jual";
            default:

                return "";
        }
    }
}
