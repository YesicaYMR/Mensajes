/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package vista;

import controlador.Empresa;
import javax.swing.JOptionPane;
import modelo.Usuario;

/**
 *
 * @author Yesica
 */
public class PnlAlta extends javax.swing.JPanel {

    Empresa empresa;

    /**
     *
     * @param empresa
     */
    public PnlAlta(Empresa empresa) {
        initComponents();
        this.empresa = empresa;
    }

    /**
     * Restaura la pantalla a su estado por defecto
     */
    private void limpiar() {
        txtNombre.setText("");
        txtEmail.setText("");
        chckUsuario.setSelected(false);
        chckAdmin.setSelected(false);
        txtNombre.requestFocus();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pwdContra = new javax.swing.JPasswordField();
        btnCancelar = new javax.swing.JButton();
        btnAceptar = new javax.swing.JButton();
        chckAdmin = new javax.swing.JCheckBox();
        chckUsuario = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pwdContra.setBackground(new java.awt.Color(255, 204, 204));
        pwdContra.setText("123");
        add(pwdContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 210, 200, 30));

        btnCancelar.setBackground(new java.awt.Color(255, 255, 204));
        btnCancelar.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(0, 153, 153));
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 370, -1, -1));

        btnAceptar.setBackground(new java.awt.Color(255, 255, 204));
        btnAceptar.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        btnAceptar.setForeground(new java.awt.Color(0, 153, 153));
        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });
        add(btnAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 370, -1, -1));

        chckAdmin.setText("Administrador");
        chckAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chckAdminMouseClicked(evt);
            }
        });
        add(chckAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 280, -1, -1));

        chckUsuario.setText("Usuario");
        chckUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chckUsuarioMouseClicked(evt);
            }
        });
        add(chckUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, -1, -1));

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 204, 204));
        jLabel4.setText("Contraseña");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, -1, -1));

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 204, 204));
        jLabel2.setText("Nombre");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, -1, -1));

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 204, 204));
        jLabel3.setText("l-mail");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, -1, -1));

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 204, 204));
        jLabel5.setText("Perfil");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, -1, -1));
        add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, 200, 30));
        add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, 200, 30));

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 102));
        jLabel1.setText("Alta Usuario");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, -1, -1));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/2.png"))); // NOI18N
        add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        //Recoger los datos        
        String nombre = txtNombre.getText();
        String contra = new String(pwdContra.getPassword());
        String mail = txtEmail.getText();
        int perfil = 0;
        if (chckUsuario.isSelected()) {

            perfil = 2;
        }
        if (chckAdmin.isSelected()) {

            perfil = 1;
        }
        //comprobar si existe un usuario con el mismo nombre
        if (nombre.isBlank()) {
            JOptionPane.showMessageDialog(this, "Debe introducir un nombre de usuario", "Error", JOptionPane.ERROR_MESSAGE);
            txtNombre.requestFocus();
        } else {
            Usuario u = empresa.buscarUsuario(nombre, contra);
            if (u != null) {

                JOptionPane.showMessageDialog(this, "Usuario existente", "Error", JOptionPane.ERROR_MESSAGE);
                limpiar();

            } else {
                if (mail.isBlank()) {
                    JOptionPane.showMessageDialog(this, "Debe introducir una dirección de lmail", "Error", JOptionPane.ERROR_MESSAGE);
                    txtEmail.requestFocus();
                } else {
                    if (empresa.existeEmail(mail)) {
                        JOptionPane.showMessageDialog(this, "Este email ya existe", "Error", JOptionPane.ERROR_MESSAGE);
                        txtEmail.setText("");
                        txtEmail.requestFocus();
                    } else {
                        if (perfil == 0) {
                            JOptionPane.showMessageDialog(this, "Debe seleccionar un tipo usuario", "Error", JOptionPane.ERROR_MESSAGE);

                        } else {//Los datos son correctos. Creamos un nuevo usuario.
                            u = new Usuario(nombre, contra, perfil, mail);
                            empresa.anadirUsuarios(u);
                            JOptionPane.showMessageDialog(this, "Usuario añadido", "Información", JOptionPane.INFORMATION_MESSAGE);
                            limpiar();
                        }
                    }
                }
            }

        }
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        limpiar();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void chckAdminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chckAdminMouseClicked
        chckUsuario.setSelected(false);
        chckAdmin.setSelected(true);
    }//GEN-LAST:event_chckAdminMouseClicked

    private void chckUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chckUsuarioMouseClicked
        chckUsuario.setSelected(true);
        chckAdmin.setSelected(false);
    }//GEN-LAST:event_chckUsuarioMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JCheckBox chckAdmin;
    private javax.swing.JCheckBox chckUsuario;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPasswordField pwdContra;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}