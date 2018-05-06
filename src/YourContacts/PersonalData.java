/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package YourContacts;

import java.awt.Color;
import java.awt.print.PrinterException;
import java.io.File;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author Tomasz Madej
 */
public class PersonalData extends javax.swing.JFrame {

    public PersonalData() {
        initComponents();
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        UpButton = new javax.swing.JButton();
        DownButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        DeleteContact = new javax.swing.JButton();
        printButton = new javax.swing.JButton();
        EditButton = new javax.swing.JButton();
        ExportButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        TelField = new javax.swing.JTextField();
        MailField = new javax.swing.JTextField();
        jLabelID = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        SurnameFIeld = new javax.swing.JTextField();
        NameField = new javax.swing.JTextField();
        IdField = new javax.swing.JTextField();
        AddContact = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Twoje kontakty");
        setLocation(new java.awt.Point(50, 50));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Lp.", "Imię", "Nazwisko", "Nr telefonu", "E-mail"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.getTableHeader().setReorderingAllowed(false);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setMaxWidth(50);
        }

        UpButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Actions-go-next-icon - Kopia.png"))); // NOI18N
        UpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpButtonActionPerformed(evt);
            }
        });

        DownButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Actions-go-next-icon.png"))); // NOI18N
        DownButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DownButtonActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(new java.awt.GridBagLayout());

        DeleteContact.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Quit-icon.png"))); // NOI18N
        DeleteContact.setText("Usuń");
        DeleteContact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteContactActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        jPanel1.add(DeleteContact, gridBagConstraints);

        printButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/print-icon.png"))); // NOI18N
        printButton.setText("Drukuj");
        printButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        jPanel1.add(printButton, gridBagConstraints);

        EditButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Pencil-icon.png"))); // NOI18N
        EditButton.setText("Aktualizuj");
        EditButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        jPanel1.add(EditButton, gridBagConstraints);

        ExportButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/export-excel-icon.png"))); // NOI18N
        ExportButton.setText("Eksportuj");
        ExportButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExportButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        jPanel1.add(ExportButton, gridBagConstraints);

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(new java.awt.GridBagLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.1;
        jPanel2.add(TelField, gridBagConstraints);

        MailField.setMaximumSize(new java.awt.Dimension(120, 120));
        MailField.setName(""); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        jPanel2.add(MailField, gridBagConstraints);

        jLabelID.setText("Lp.");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        jPanel2.add(jLabelID, gridBagConstraints);

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel1.setText("Imię");
        jLabel1.setToolTipText("Wymagane");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        jPanel2.add(jLabel1, gridBagConstraints);

        jLabel2.setText("Nazwisko");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        jPanel2.add(jLabel2, gridBagConstraints);

        jLabel3.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel3.setText("Nr telefonu");
        jLabel3.setToolTipText("Wymagane");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        jPanel2.add(jLabel3, gridBagConstraints);

        jLabel4.setText("E-mail");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        jPanel2.add(jLabel4, gridBagConstraints);

        jLabel5.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel5.setText("Wpisz dane:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipady = 6;
        jPanel2.add(jLabel5, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        jPanel2.add(SurnameFIeld, gridBagConstraints);

        NameField.setMaximumSize(new java.awt.Dimension(40, 40));
        NameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameFieldActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        jPanel2.add(NameField, gridBagConstraints);

        IdField.setMaximumSize(new java.awt.Dimension(30, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        jPanel2.add(IdField, gridBagConstraints);

        AddContact.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        AddContact.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Add-icon.png"))); // NOI18N
        AddContact.setText("Dodaj");
        AddContact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddContactActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 7;
        jPanel2.add(AddContact, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 545, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(UpButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DownButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(UpButton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(DownButton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    boolean IsRowSelected = false;
    int index;
    DefaultTableModel model;
    private void AddContactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddContactActionPerformed

        //add information from textfields to table
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        
        //check filling of textField
        if (NameField.getText().equals("")||TelField.getText().equals(""))
        {
            JOptionPane.showMessageDialog(jTable1, "Uzupełnij imię i numer telefonu kontaktu","Błąd",
                    JOptionPane.ERROR_MESSAGE);
        }
        
        else{
        model.addRow(new Object[]{
            IdField.getText(), NameField.getText(), SurnameFIeld.getText(), TelField.getText(),
            MailField.getText()
        });}
        //clean textfiled after click Add
        IdField.setText("");NameField.setText("");SurnameFIeld.setText("");TelField.setText("");
        MailField.setText("");


    }//GEN-LAST:event_AddContactActionPerformed

    private void EditButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditButtonActionPerformed

        //add update to data in table
        int row = jTable1.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

        if (row >= 0) {
            model.setValueAt(IdField.getText(), row, 0);
            model.setValueAt(NameField.getText(), row, 1);
            model.setValueAt(SurnameFIeld.getText(), row, 2);
            model.setValueAt(TelField.getText(), row, 3);
            model.setValueAt(MailField.getText(), row, 4);
        } else {
            JOptionPane.showMessageDialog(jTable1, "Błąd");
        }

    }//GEN-LAST:event_EditButtonActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int selectRow = jTable1.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

        IdField.setText(model.getValueAt(selectRow, 0).toString());
        NameField.setText(model.getValueAt(selectRow, 1).toString());
        SurnameFIeld.setText(model.getValueAt(selectRow, 2).toString());
        TelField.setText(model.getValueAt(selectRow, 3).toString());
        MailField.setText(model.getValueAt(selectRow, 4).toString());
    }//GEN-LAST:event_jTable1MouseClicked

    private void DeleteContactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteContactActionPerformed

        //delete selected row and checking with confirm window
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

        try {
            int choice = JOptionPane.showConfirmDialog(jTable1, "Usunąć kontakt?", "", JOptionPane.YES_NO_OPTION);

            if (choice == JOptionPane.YES_OPTION) {
                int selectedRowIndex = jTable1.getSelectedRow();
                model.removeRow(selectedRowIndex);
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(jTable1, "Wybierz dane z tabeli");
        }
    }//GEN-LAST:event_DeleteContactActionPerformed

    private void UpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpButtonActionPerformed

        //up button moves selected row up
        if (IsRowSelected == false) {
            model = (DefaultTableModel) jTable1.getModel();
            IsRowSelected = true;
        }
        //move row with selection
        index = jTable1.getSelectedRow();
        if (index < 0) {
            model.moveRow(index, index, index - 1);
            jTable1.setRowSelectionInterval(index - 1, index - 1);
        }
        //jTable1.setSelectionBackground(Color.darkGray);
    }//GEN-LAST:event_UpButtonActionPerformed

    private void DownButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DownButtonActionPerformed
        //down button moves selected row down
        if (IsRowSelected == false) {
            model = (DefaultTableModel) jTable1.getModel();
            IsRowSelected = true;
        }
        //move row with selection
        index = jTable1.getSelectedRow();

        if (index < model.getRowCount() - 1) {
            model.moveRow(index, index, index + 1);
            jTable1.setRowSelectionInterval(index + 1, index + 1);
        }
    }//GEN-LAST:event_DownButtonActionPerformed

    private void printButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printButtonActionPerformed

        MessageFormat header = new MessageFormat("Raport");
        MessageFormat footer = new MessageFormat("Koniec");

        try {
            jTable1.print(JTable.PrintMode.FIT_WIDTH, header, footer);
        } catch (PrinterException ex) {
            System.err.format("Błąd druku", ex.getMessage());
        }


    }//GEN-LAST:event_printButtonActionPerformed

    private void NameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NameFieldActionPerformed

    private void ExportButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExportButtonActionPerformed
        // TODO add your handling code here:
        
        //Checking if jtable is empty or not
        if (this.jTable1.getRowCount() == 0) {
            JOptionPane.showMessageDialog(jTable1, "W tabeli nie ma danych.", "Informacja",
                    JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        
        //creating Jfilechooser to choose saving place 

        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Archiwum Excela", "xls");

        chooser.setFileFilter(filter);
        chooser.setDialogTitle("Zapisz plik");
        chooser.setMultiSelectionEnabled(false);
        chooser.setAcceptAllFileFilterUsed(false);

        if (chooser.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
            List<JTable> table = new ArrayList<>();
            List<String> my_files = new ArrayList<>();

            table.add(jTable1);
            my_files.add("socios");

            String file = chooser.getSelectedFile().toString().concat(".xls");
            
            //using method Exporter to export
            try {
                YourContacts.Exporter e = new Exporter(new File(file), table, my_files);
                if (e.export()) {
                    JOptionPane.showMessageDialog(jTable1, "Dane wyeksportowane.", "Informacja",
                            JOptionPane.INFORMATION_MESSAGE);
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(jTable1, "Wystąpił błąd " + ex.getMessage(), "Błąd",
                        JOptionPane.ERROR_MESSAGE);
            }
        }


    }//GEN-LAST:event_ExportButtonActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PersonalData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PersonalData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PersonalData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PersonalData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PersonalData().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddContact;
    private javax.swing.JButton DeleteContact;
    private javax.swing.JButton DownButton;
    private javax.swing.JButton EditButton;
    private javax.swing.JButton ExportButton;
    private javax.swing.JTextField IdField;
    private javax.swing.JTextField MailField;
    private javax.swing.JTextField NameField;
    private javax.swing.JTextField SurnameFIeld;
    private javax.swing.JTextField TelField;
    private javax.swing.JButton UpButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelID;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton printButton;
    // End of variables declaration//GEN-END:variables
}
