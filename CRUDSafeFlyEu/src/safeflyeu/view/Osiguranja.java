/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package safeflyeu.view;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import safeflyeu.controller.ObradaOsiguranje;
import safeflyeu.model.Osiguranje;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import safeflyeu.utility.SafeFlyEUException;

/**
 *
 * @author labak
 */
public class Osiguranja extends javax.swing.JFrame {

    private ObradaOsiguranje obradaOsiguranje;
    private DecimalFormat format;

    public Osiguranja() {
        initComponents();

        obradaOsiguranje = new ObradaOsiguranje();

        NumberFormat nf = NumberFormat.getInstance(
                new Locale("hr"));

        format = (DecimalFormat) nf;
        format.applyPattern("#,###.00");

        ucitajOsiguranja();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        lstOsiguranja = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNaziv = new javax.swing.JTextField();
        txtVrsta = new javax.swing.JTextField();
        txtIban = new javax.swing.JTextField();
        txtOib = new javax.swing.JTextField();
        btnDodaj = new javax.swing.JButton();
        btnPromjena = new javax.swing.JButton();
        btnBrisanje = new javax.swing.JButton();

        jScrollPane1.setViewportView(lstOsiguranja);

        jLabel1.setText("Naziv");

        jLabel2.setText("Vrsta");

        jLabel3.setText("IBAN");

        jLabel4.setText("OIB");

        txtNaziv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNazivActionPerformed(evt);
            }
        });

        txtVrsta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVrstaActionPerformed(evt);
            }
        });

        txtIban.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIbanActionPerformed(evt);
            }
        });

        txtOib.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOibActionPerformed(evt);
            }
        });

        btnDodaj.setText("Dodaj");
        btnDodaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDodajActionPerformed(evt);
            }
        });

        btnPromjena.setText("Promjena");
        btnPromjena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPromjenaActionPerformed(evt);
            }
        });

        btnBrisanje.setText("Brisanje");
        btnBrisanje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBrisanjeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnDodaj)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPromjena)
                        .addGap(18, 18, 18)
                        .addComponent(btnBrisanje, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtNaziv, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtOib, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtVrsta, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtIban, javax.swing.GroupLayout.Alignment.LEADING)))
                .addContainerGap(80, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(txtNaziv, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtVrsta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtIban, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtOib, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnDodaj)
                            .addComponent(btnPromjena)
                            .addComponent(btnBrisanje))
                        .addGap(0, 13, Short.MAX_VALUE)))
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(516, 339));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lstOsiguranjaValueChanged(javax.swing.event.ListSelectionEvent evt) {
        if (evt.getValueIsAdjusting()) {
            return;
        }

        Osiguranje o = lstOsiguranja.getSelectedValue();
        if (o == null) {
            return;
        }

        txtNaziv.setText(o.getNaziv());
        txtVrsta.setText(o.getVrsta());
        txtIban.setText(o.getIban());
        txtOib.setText(o.getOib());

    }
    private void txtNazivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNazivActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNazivActionPerformed

    private void txtVrstaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVrstaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVrstaActionPerformed

    private void txtIbanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIbanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIbanActionPerformed

    private void txtOibActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOibActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOibActionPerformed

    private void btnDodajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDodajActionPerformed

        Osiguranje o = new Osiguranje();

        if (!kontrola(o)) {
            return;
        }

        try {
            obradaOsiguranje.create(o);
        } catch (SafeFlyEUException e) {
            JOptionPane.showConfirmDialog(null, e.getPoruka());
            return;
        }

        ucitajOsiguranja();

        ocistiPolja();

    }//GEN-LAST:event_btnDodajActionPerformed

    private void btnPromjenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPromjenaActionPerformed

        Osiguranje o = lstOsiguranja.getSelectedValue();

        if (o == null) {
            JOptionPane.showConfirmDialog(null, "Prvo odaberite osiguranje");
        }

        if (!kontrola(o)) {
            return;
        }

        try {
            obradaOsiguranje.update(o);
        } catch (SafeFlyEUException e) {
            JOptionPane.showConfirmDialog(null, e.getPoruka());
            return;
        }
        ucitajOsiguranja();

        ocistiPolja();
    }//GEN-LAST:event_btnPromjenaActionPerformed

    private void btnBrisanjeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBrisanjeActionPerformed
        Osiguranje o = lstOsiguranja.getSelectedValue();

        if (o == null) {
            JOptionPane.showConfirmDialog(null, "Prvo odaberite osiguranje");
        }

        if (obradaOsiguranje.delete(o)) {
            ucitajOsiguranja();
            ocistiPolja();
        } else {
            JOptionPane.showConfirmDialog(null, "Osiguranje nije obrisano");
        }
    }//GEN-LAST:event_btnBrisanjeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBrisanje;
    private javax.swing.JButton btnDodaj;
    private javax.swing.JButton btnPromjena;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<safeflyeu.model.Osiguranje> lstOsiguranja;
    private javax.swing.JTextField txtIban;
    private javax.swing.JTextField txtNaziv;
    private javax.swing.JTextField txtOib;
    private javax.swing.JTextField txtVrsta;
    // End of variables declaration//GEN-END:variables

    private void ucitajOsiguranja() {

        DefaultListModel<Osiguranje> m = new DefaultListModel<>();
        for (Osiguranje o : obradaOsiguranje.read()) {
            m.addElement(o);
        }
        lstOsiguranja.setModel(m);

    }

    private void ocistiPolja() {
        txtNaziv.setText("");
        txtVrsta.setText("");
        txtIban.setText("");
        txtOib.setText("");
    }

    private boolean kontrola(Osiguranje o) {

        o.setNaziv(txtNaziv.getText());
        try {
            o.setVrsta(txtVrsta.getText());
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, "Vrsta ne može biti broj");
            return false;
        }

        try {
            o.setIban(txtIban.getText());
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showConfirmDialog(null, "Iban mora biti broj od 21 znamenkom");
            return false;
        }

        try {
            o.setOib(txtOib.getText());

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, "Oib je broj od 11 znamenaka");
            return false;
        }
        return false;
    }

}