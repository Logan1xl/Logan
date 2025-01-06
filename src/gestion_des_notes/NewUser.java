package gestion_des_notes;

//package gestion_des_notes;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author MBONGO Wulfrid
 */
public class NewUser extends javax.swing.JFrame {

    Connection con;
    PreparedStatement pst;
    ResultSet rs;

    /**
     * Creates new form NewUser
     */
    public NewUser() {
        initComponents();
        setLocationRelativeTo(null);

        this.setTitle("Nouvel Utilisateur");

    }

    public void Connect() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/gestion_des_notes", "root", "");

        } catch (Exception e) {
            e.printStackTrace();

        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtnomnew = new javax.swing.JTextField();
        matri = new javax.swing.JTextField();
        btncreer = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        password = new javax.swing.JPasswordField();
        combo = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Nom");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Plateforme des examens(CC & SN)");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 600, 44));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Enregistrez-vous ...");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(269, 74, 165, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Nom");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 54, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Matricule");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("Mot de passe");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setText("Statut");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, -1, -1));

        txtnomnew.setBackground(java.awt.SystemColor.activeCaption);
        txtnomnew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnomnewActionPerformed(evt);
            }
        });
        jPanel1.add(txtnomnew, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 360, 35));

        matri.setBackground(java.awt.SystemColor.activeCaption);
        matri.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.add(matri, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, 360, 35));

        btncreer.setBackground(java.awt.SystemColor.activeCaption);
        btncreer.setForeground(new java.awt.Color(255, 255, 255));
        btncreer.setText("Enregistrer");
        btncreer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncreerActionPerformed(evt);
            }
        });
        jPanel1.add(btncreer, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 540, 123, 36));

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Vous avez deja un compte ? si oui ....");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 550, -1, -1));

        jButton2.setBackground(java.awt.SystemColor.activeCaption);
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Se connecter");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 550, -1, -1));

        password.setBackground(java.awt.SystemColor.activeCaption);
        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        jPanel1.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 410, 369, 38));

        combo.setBackground(java.awt.SystemColor.activeCaption);
        combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enseignants", "Etudiant", "Administration" }));
        jPanel1.add(combo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 330, 360, 40));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gestion_des_notes/thumb-1920-558952.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 580));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtnomnewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnomnewActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnomnewActionPerformed

    private void btncreerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncreerActionPerformed
        //Creer un compte utilisateur
        try {
            Connect();
            pst = (PreparedStatement) con.prepareStatement("insert into utilisateur(nom,matricule,statut,password) values(?,?,?,?)");

            pst.setString(1, txtnomnew.getText());
            pst.setString(2, matri.getText());
            pst.setString(3, (String) combo.getSelectedItem());
            pst.setString(4, password.getText());

            String a = matri.getText();
            String b = password.getText();

            if ("".equals(a) || "".equals(b)) {
                JOptionPane.showMessageDialog(null, "Erreur ! veillez remplir tous les champs ");
            } else {
                pst.executeUpdate();
                con.close();
                JOptionPane.showMessageDialog(null, "Compte créé");
               Note_Tp Accueil = new  Note_Tp ();
                Accueil.setVisible(true);
                this.hide();
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erreur, veuillez reesayer");

            e.printStackTrace();

        }
    }//GEN-LAST:event_btncreerActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Connexion c = new Connexion();
        c.setVisible(true);
        this.hide();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

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
            java.util.logging.Logger.getLogger(NewUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        // Obtenir la taille de l'écran
        NewUser n = new NewUser();

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        // Calculer les coordonnées x et y pour centrer la fenêtre
        int x = (screenSize.width - n.getWidth()) / 2;
        int y = (screenSize.height - n.getHeight()) / 2;

        // Définir la position de la fenêtre
        n.setLocation(x, y);
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncreer;
    private javax.swing.JComboBox<String> combo;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField matri;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField txtnomnew;
    // End of variables declaration//GEN-END:variables
}