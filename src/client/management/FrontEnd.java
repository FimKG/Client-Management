/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client.management;

import client.management.filemanager.FileManager;
import client.management.info.Client;
import java.awt.Color;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author KGAUGELO
 */
public class FrontEnd extends javax.swing.JFrame {

    /**
     * Creates new form FrontEnd
     */
    public FrontEnd() {
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

        jPanel2 = new javax.swing.JPanel();
        frmClient = new javax.swing.JInternalFrame();
        desktop = new javax.swing.JDesktopPane();
        jPanel_frm = new javax.swing.JPanel();
        jPanel_view = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        recordsArea = new javax.swing.JList<>();
        jPanel_Reg = new javax.swing.JPanel();
        txtName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtSurname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtClientID = new javax.swing.JTextField();
        txtPurpose = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        lblStatus = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        openItem = new javax.swing.JMenuItem();
        saveItem = new javax.swing.JMenuItem();
        readItem = new javax.swing.JMenuItem();
        exitItem = new javax.swing.JMenuItem();


        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Client Management");
        setLocation(new java.awt.Point(700, 200));

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102), 3));

        frmClient.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 153)));
        frmClient.setClosable(true);
        frmClient.setIconifiable(true);
        frmClient.setTitle("Register Client");
        frmClient.setVisible(true);

        jPanel_frm.setBackground(new java.awt.Color(204, 204, 204));

        jPanel_view.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255)), "View Details", javax.swing.border.TitledBorder.LEADING, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 12))); // NOI18N
        jPanel_view.setToolTipText("");

        recordsArea.setLayoutOrientation(javax.swing.JList.HORIZONTAL_WRAP);
        jScrollPane2.setViewportView(recordsArea);

        javax.swing.GroupLayout jPanel_viewLayout = new javax.swing.GroupLayout(jPanel_view);
        jPanel_view.setLayout(jPanel_viewLayout);
        jPanel_viewLayout.setHorizontalGroup(
            jPanel_viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_viewLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 345, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel_viewLayout.setVerticalGroup(
            jPanel_viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_viewLayout.createSequentialGroup()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );

        jPanel_Reg.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 153, 255)), "Register", javax.swing.border.TitledBorder.LEADING, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        txtName.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Enter Client Name");

        txtSurname.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Enter Client Surname");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Enter Address street, houseNo, city, Area Code");

        txtAddress.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Enter Client ID");

        txtClientID.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        txtPurpose.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Enter purpose of visit");

        lblStatus.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel_RegLayout = new javax.swing.GroupLayout(jPanel_Reg);
        jPanel_Reg.setLayout(jPanel_RegLayout);
        jPanel_RegLayout.setHorizontalGroup(
            jPanel_RegLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_RegLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_RegLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_RegLayout.createSequentialGroup()
                        .addGroup(jPanel_RegLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel_RegLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel_RegLayout.createSequentialGroup()
                                .addComponent(txtClientID, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel_RegLayout.createSequentialGroup()
                                .addGroup(jPanel_RegLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPurpose, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel_RegLayout.createSequentialGroup()
                        .addGroup(jPanel_RegLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(164, 164, 164)
                        .addGroup(jPanel_RegLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSurname, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel_RegLayout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(lblStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel_RegLayout.setVerticalGroup(
            jPanel_RegLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_RegLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_RegLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_RegLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSurname, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_RegLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_RegLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtClientID, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_RegLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPurpose, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addComponent(lblStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel_frmLayout = new javax.swing.GroupLayout(jPanel_frm);
        jPanel_frm.setLayout(jPanel_frmLayout);
        jPanel_frmLayout.setHorizontalGroup(
            jPanel_frmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_frmLayout.createSequentialGroup()
                .addComponent(jPanel_Reg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel_view, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel_frmLayout.setVerticalGroup(
            jPanel_frmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_view, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel_Reg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel_view.getAccessibleContext().setAccessibleName("");

        desktop.setLayer(jPanel_frm, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout desktopLayout = new javax.swing.GroupLayout(desktop);
        desktop.setLayout(desktopLayout);
        desktopLayout.setHorizontalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_frm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        desktopLayout.setVerticalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(desktopLayout.createSequentialGroup()
                .addComponent(jPanel_frm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout frmClientLayout = new javax.swing.GroupLayout(frmClient.getContentPane());
        frmClient.getContentPane().setLayout(frmClientLayout);
        frmClientLayout.setHorizontalGroup(
            frmClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frmClientLayout.createSequentialGroup()
                .addComponent(desktop)
                .addGap(0, 0, 0))
        );
        frmClientLayout.setVerticalGroup(
            frmClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(frmClient)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(frmClient)
                .addContainerGap())
        );

        fileMenu.setText("File");

        openItem.setText("Open");
        openItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openItemActionPerformed(evt);
            }
        });
        fileMenu.add(openItem);

        saveItem.setText("Save Client");
        saveItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveItemActionPerformed(evt);
            }
        });
        fileMenu.add(saveItem);

        readItem.setText("Read All Clients");
        readItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                readItemActionPerformed(evt);
            }
        });
        fileMenu.add(readItem);

        exitItem.setText("Exit");
        exitItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitItem);

        menuBar.add(fileMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void openItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openItemActionPerformed

        

    }//GEN-LAST:event_openItemActionPerformed

    private void exitItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitItemActionPerformed

        System.exit(0);
        
    }//GEN-LAST:event_exitItemActionPerformed

    private void saveItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveItemActionPerformed

        FileManager fm = new FileManager();
        
        String filename = "ClientRecords.txt";
        
        try{
            if(txtName.getText().isEmpty() && txtSurname.getText().isEmpty() && txtAddress.getText().isEmpty() && txtClientID.getText().isEmpty() && txtPurpose.getText().isEmpty()){

                lblStatus.setForeground(Color.red);
                lblStatus.setText("Enter All fields");
                JOptionPane.showMessageDialog(null,"isEmpty");
                return ;
            }
            
            Client cl = new Client(txtName.getText(), txtSurname.getText(), txtAddress.getText(), txtClientID.getText(), txtPurpose.getText());

            fm.registerClient(cl, filename);
            
            JOptionPane.showMessageDialog(null,"Registration Successfully..");
            lblStatus.setText("Registration Successfully..");

            txtName.setText("");
            txtSurname.setText("");
            txtAddress.setText("");
            txtClientID.setText("");
            txtPurpose.setText("");
            
            lblStatus.setForeground(Color.green);
            lblStatus.setText("Client Details Added");
            
        }catch(Exception e){
            e.printStackTrace();
        }
        
    }//GEN-LAST:event_saveItemActionPerformed

    private void readItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_readItemActionPerformed

        try{
        FileManager fm = new FileManager();
        String filename = "ClientRecords.txt";
        DefaultListModel<String> model = new DefaultListModel<String>();
        
        for(Client cl : fm.readClients(filename)){
            
            model.addElement(cl.toString());
            
        } recordsArea.setModel(model);
       
        }catch(Exception e){
            e.printStackTrace();
        }
        
    }//GEN-LAST:event_readItemActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrontEnd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrontEnd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrontEnd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrontEnd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrontEnd().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktop;
    private javax.swing.JMenuItem exitItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JInternalFrame frmClient;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel_Reg;
    private javax.swing.JPanel jPanel_frm;
    private javax.swing.JPanel jPanel_view;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem openItem;
    private javax.swing.JMenuItem readItem;
    private javax.swing.JList<String> recordsArea;
    private javax.swing.JMenuItem saveItem;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtClientID;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPurpose;
    private javax.swing.JTextField txtSurname;
    // End of variables declaration//GEN-END:variables
}
