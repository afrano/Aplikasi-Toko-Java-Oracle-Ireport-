/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Kategori;

import java.util.ArrayList;
import java.util.List;
import javax.swing.event.TableModelListener;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author basisb21la
 */
public class TabelModel_Kategori extends AbstractTableModel{
private List<KategoriBrng> kat=new ArrayList<KategoriBrng> ();

    public TabelModel_Kategori(List<KategoriBrng>kate) {
        this.kat=kate;
    }

    

    @Override
    public int getRowCount() {
        return kat.size();
    }

    @Override
    public int getColumnCount() {
       return 3;//menampilkan jumlah kolom
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        KategoriBrng k = kat.get(rowIndex);
        switch(columnIndex){
            case 0:
                return rowIndex+1;
            case 1:
                return k.getKode();
            case 2:
                return k.getKategori();
            default:
                    
                    return "";
        }
    }
    @Override
   public String getColumnName(int column){
       switch(column){
            case 0:
                return "No";
            case 1:
                return "Kode";
            case 2:
                return "Nama Kategori";
            default:
                    
                    return "";
        }
   }}
