/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * GuiKategori.java
 *
 * Created on Oct 27, 2012, 1:15:16 PM
 */
package SUPPLIER;

//import MenuUtama.MenuUtama;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

/**
 *
 * @author Awenk
 */
public class GuiSupplier extends javax.swing.JFrame {

    public GuiSupplier() {
        initComponents();
        this.setLocationRelativeTo(null);
        LihatDataTabel();//Metod yang menampilkan data supplier
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        labelkategoribarang = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        labelkodekategori = new javax.swing.JLabel();
        tek_ID = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        tek_nama = new javax.swing.JTextField();
        tombol_hapus = new javax.swing.JButton();
        tombol_batal = new javax.swing.JButton();
        tombol_keluar = new javax.swing.JButton();
        tombol_simpan = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        tek_telp = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tek_alamat = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel_Supplier = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SUPPLIER");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        labelkategoribarang.setFont(new java.awt.Font("Arial", 1, 18));
        labelkategoribarang.setText("SUPPLIER");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/user_male.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14));
        jLabel2.setText("Digunakan untuk pengelolaan data supplier");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelkategoribarang, javax.swing.GroupLayout.DEFAULT_SIZE, 379, Short.MAX_VALUE))
                .addContainerGap(121, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(labelkategoribarang, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        labelkodekategori.setFont(new java.awt.Font("Arial", 0, 14));
        labelkodekategori.setText("ID Supplier");

        tek_ID.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14));
        jLabel1.setText("Nama Supplier");

        tek_nama.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tombol_hapus.setFont(new java.awt.Font("Arial", 1, 14));
        tombol_hapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/1442483766_Delete.png"))); // NOI18N
        tombol_hapus.setText("Hapus");
        tombol_hapus.setEnabled(false);
        tombol_hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombol_hapusActionPerformed(evt);
            }
        });

        tombol_batal.setFont(new java.awt.Font("Arial", 1, 14));
        tombol_batal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/1442483809_Undo.png"))); // NOI18N
        tombol_batal.setText("Batal");
        tombol_batal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombol_batalActionPerformed(evt);
            }
        });

        tombol_keluar.setFont(new java.awt.Font("Arial", 1, 14));
        tombol_keluar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/1442484041_exit.png"))); // NOI18N
        tombol_keluar.setText("Keluar");
        tombol_keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombol_keluarActionPerformed(evt);
            }
        });

        tombol_simpan.setFont(new java.awt.Font("Arial", 1, 14));
        tombol_simpan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/1442483718_Save.png"))); // NOI18N
        tombol_simpan.setText("Simpan");
        tombol_simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombol_simpanActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14));
        jLabel3.setText("Alamat");

        tek_telp.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14));
        jLabel4.setText("Telp");

        tek_alamat.setColumns(20);
        tek_alamat.setRows(5);
        jScrollPane2.setViewportView(tek_alamat);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(tombol_simpan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tombol_hapus)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tombol_batal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tombol_keluar)
                        .addContainerGap())
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(labelkodekategori, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(tek_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(28, 28, 28))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane2)
                                    .addComponent(tek_nama, javax.swing.GroupLayout.DEFAULT_SIZE, 297, Short.MAX_VALUE)
                                    .addComponent(tek_telp, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(404, 404, 404))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                        .addGap(729, 729, 729))))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {tombol_batal, tombol_hapus, tombol_keluar, tombol_simpan});

        jPanel3Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel1, jLabel3, jLabel4, labelkodekategori});

        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelkodekategori)
                    .addComponent(tek_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tek_nama, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tek_telp, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tombol_keluar)
                    .addComponent(tombol_batal)
                    .addComponent(tombol_hapus)
                    .addComponent(tombol_simpan))
                .addContainerGap())
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {tombol_batal, tombol_hapus, tombol_keluar, tombol_simpan});

        jPanel3Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel1, jLabel3, jLabel4, labelkodekategori, tek_ID, tek_nama, tek_telp});

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Daftar Supplier", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Comic Sans MS", 0, 11))); // NOI18N

        tabel_Supplier.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID", "Supplier"
            }
        ));
        tabel_Supplier.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabel_SupplierMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabel_Supplier);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 592, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 624, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tombol_simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombol_simpanActionPerformed
        //Silahkan Lengkapi
        if (tek_ID.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Silahkan masukkan ID Supplier");
        } else if (tek_nama.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Silahkan masukkan Nama Supplier");
        }
        else if (tek_alamat.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Silahkan masukkan ALamat");
        }
        else if (tek_telp.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Silahkan masukkan Telepon");
        }else {
            try {
                String idsup = tek_ID.getText();
                String nama = tek_nama.getText();
                String alamat = tek_alamat.getText();
                String telp = tek_telp.getText();
                Supplier sup = new Supplier();
                sup.setIdSuplier(idsup);
                sup.setNamaSupplier(nama);
                sup.setAlamatSupplier(alamat);
                sup.setTelp(telp);
                KontrolSupplier ks = KontrolSupplier.getkoneksiSupplier();

                if (tombol_simpan.getText().equals("Simpan")) {
                    ks.tambahSupplier(sup);
                    JOptionPane.showMessageDialog(null, "Tersimpan");
                    LihatDataTabel();

                } else {
                    KontrolSupplier konsup = KontrolSupplier.getkoneksiSupplier();
                    if (tombol_simpan.getText().equals("Update")) {
                        konsup.UpdateSupplier(sup);
                        kosongsemuatextfield();
                        JOptionPane.showMessageDialog(null, "Terupdate");
                    } else {
                        konsup.tambahSupplier(sup);
                        kosongsemuatextfield();
                        JOptionPane.showMessageDialog(null, "Tersimpan");
                    }
                }
                kosongsemuatextfield();
            } catch (SQLException ex) {
                Logger.getLogger(GuiSupplier.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_tombol_simpanActionPerformed

    private void tombol_batalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombol_batalActionPerformed
        //Silahkan Lengkapi
        kosongsemuatextfield();
    }//GEN-LAST:event_tombol_batalActionPerformed

    private void tombol_keluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombol_keluarActionPerformed
        //Silahkan Lengkapi
        this.dispose();
    }//GEN-LAST:event_tombol_keluarActionPerformed

    private void tombol_hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombol_hapusActionPerformed
        //Silahkan Lengkapi
        if (tek_ID.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Maaf,  yang ingin dihapus tidak ada ");
        } else {
            try {
                KontrolSupplier konsup = KontrolSupplier.getkoneksiSupplier();
                konsup.HapusSupplier(tek_ID.getText());
                kosongsemuatextfield();
                JOptionPane.showMessageDialog(null, "Terhapus");
                LihatDataTabel();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Gagal hapus karena " + ex.getMessage());
            }
        }
    }//GEN-LAST:event_tombol_hapusActionPerformed

    private void tabel_SupplierMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabel_SupplierMouseClicked
        //Silahkan Lengkapi
        int row = tabel_Supplier.getSelectedRow();
        String idsup = tabel_Supplier.getValueAt(row, 1).toString(); //data list pertama mulai dari 0
        String namasup = tabel_Supplier.getValueAt(row, 2).toString();// sesuaikan dengan table list yang ada case nya
        String alamat = tabel_Supplier.getValueAt(row, 3).toString();
        String telp = tabel_Supplier.getValueAt(row, 4).toString();
        tek_ID.setText(idsup);
        tek_nama.setText(namasup);
        tek_alamat.setText(alamat);
        tek_telp.setText(telp);


        tombol_hapus.setEnabled(true);
        tombol_simpan.setText("Update");
        tek_ID.setEditable(false);

    }//GEN-LAST:event_tabel_SupplierMouseClicked

    public void kosongsemuatextfield() {
        //Silahkan Lengkapi
        tek_ID.setText("");
        tek_nama.setText("");
        tek_alamat.setText("");
        tek_telp.setText("");
        tombol_simpan.setText("Simpan");
        tombol_hapus.setEnabled(false);
        tek_ID.setEditable(true);
    }

    public void LihatDataTabel() {
        //Silahkan Lengkapi
        try {
            List<Supplier> sup = KontrolSupplier.getkoneksiSupplier().LihatSemuaSupplier();
            TableModelSupplier model = new TableModelSupplier(sup);
            tabel_Supplier.setModel(model);
        } catch (SQLException ex) {
            Logger.getLogger(GuiSupplier.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel(new NimbusLookAndFeel());
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(GuiSupplier.class.getName()).log(Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new GuiSupplier().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelkategoribarang;
    private javax.swing.JLabel labelkodekategori;
    private javax.swing.JTable tabel_Supplier;
    private javax.swing.JTextField tek_ID;
    private javax.swing.JTextArea tek_alamat;
    private javax.swing.JTextField tek_nama;
    private javax.swing.JTextField tek_telp;
    private javax.swing.JButton tombol_batal;
    private javax.swing.JButton tombol_hapus;
    private javax.swing.JButton tombol_keluar;
    private javax.swing.JButton tombol_simpan;
    // End of variables declaration//GEN-END:variables
}
