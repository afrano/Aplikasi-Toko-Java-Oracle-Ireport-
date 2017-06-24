/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package SUPPLIER;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Rafael Aweng
 */
public class TableModelSupplier extends AbstractTableModel {

    private List<Supplier> supp = new ArrayList<Supplier>();

    public TableModelSupplier(List<Supplier> s) {

        this.supp = s;
    }

    @Override
    public int getRowCount() {
        return supp.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Supplier sp = supp.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return rowIndex + 1;
            case 1:
                return sp.getIdSuplier();
            case 2:
                return sp.getNamaSupplier();
            case 3:
                return sp.getAlamatSupplier();
            case 4:
                return sp.getTelp();
            default:
                ;
                return "";
        }
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "No";
            case 1:
                return "ID";
            case 2:
                return "Supplier";
            case 3:
                return "Alamat";
            case 4:
                return "Telp";
            default:
                ;
                return "";
        }
    }
}
