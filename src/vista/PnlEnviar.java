/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package vista;

import controlador.Empresa;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import modelo.Email;
import modelo.Usuario;
import utilidades.Fecha;

/**
 *
 * @author Yesica
 */
public class PnlEnviar extends javax.swing.JPanel {

    Empresa empresa;
    Usuario usuario;
    Usuario destinatario;
    DefaultComboBoxModel modeloDestinatarios;

    /**
     * Constructor
     * @param empresa
     * @param usuario 
     */
    public PnlEnviar(Empresa empresa, Usuario usuario) {
        initComponents();
        this.empresa = empresa;
        this.usuario = usuario;
        txtDe.setText(usuario.getNombre());
        txtFecha.setText(Fecha.fechaActual());
        modeloDestinatarios = new DefaultComboBoxModel();
        cmbPara.setModel(modeloDestinatarios);
        cargarDestinatarios();
    }

    /**
     * Carga en el combo de destinatarios los nombres
     */
    private void cargarDestinatarios() {
        modeloDestinatarios.addElement("Seleccione un usuario");
        modeloDestinatarios.addAll(empresa.getUsuarios());
    }

    /**
     * Restaura la pantalla a su estado por defecto
     */
    private void limpiar() {
        cmbPara.setSelectedIndex(0);
        txtAsunto.setText("");
        txtMensaje.setText("");
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
        txtMensaje = new javax.swing.JTextArea();
        btnEnviar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cmbPara = new javax.swing.JComboBox<>();
        txtAsunto = new javax.swing.JTextField();
        txtDe = new javax.swing.JTextField();
        txtFecha = new javax.swing.JTextField();
        fondo = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtMensaje.setBackground(new java.awt.Color(255, 255, 204));
        txtMensaje.setColumns(20);
        txtMensaje.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txtMensaje.setRows(5);
        jScrollPane1.setViewportView(txtMensaje);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 450, 150));

        btnEnviar.setBackground(new java.awt.Color(255, 255, 204));
        btnEnviar.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        btnEnviar.setForeground(new java.awt.Color(0, 153, 153));
        btnEnviar.setText("Enviar");
        btnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarActionPerformed(evt);
            }
        });
        add(btnEnviar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 410, -1, -1));

        btnCancelar.setBackground(new java.awt.Color(255, 255, 204));
        btnCancelar.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(0, 153, 153));
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 410, -1, -1));

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 102));
        jLabel1.setText("Enviar mensaje");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 204, 204));
        jLabel2.setText("De");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 70, -1));

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 204, 204));
        jLabel3.setText("Para");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, -1, -1));

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 204, 204));
        jLabel4.setText("Asunto");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 70, 20));

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 204, 204));
        jLabel5.setText("Fecha");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, -1, -1));

        cmbPara.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        cmbPara.setForeground(new java.awt.Color(0, 204, 204));
        cmbPara.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(cmbPara, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 250, 30));

        txtAsunto.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        txtAsunto.setForeground(new java.awt.Color(0, 204, 204));
        add(txtAsunto, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, 250, 30));

        txtDe.setEditable(false);
        txtDe.setBackground(new java.awt.Color(255, 204, 204));
        txtDe.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        txtDe.setForeground(new java.awt.Color(0, 204, 204));
        add(txtDe, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, 250, 30));

        txtFecha.setEditable(false);
        txtFecha.setBackground(new java.awt.Color(255, 204, 204));
        txtFecha.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        txtFecha.setForeground(new java.awt.Color(0, 204, 204));
        add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, 250, 30));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/2.png"))); // NOI18N
        add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed
        String de = txtDe.getText();
        String asunto = txtAsunto.getText();
        String fecha = txtFecha.getText();
        String mensaje = txtMensaje.getText();
        //compruebo que el destinatario no está vacío
        int pos = cmbPara.getSelectedIndex();
        if (pos != 0) {
            Usuario destinatario = (Usuario) cmbPara.getSelectedItem();

            //cambio el texto de Asunto
            if (asunto.isBlank()) {
                asunto = "Mensaje sin asunto";
            }
            //compruebo que ha escrito un mensaje
            if (mensaje.isBlank()) {
                JOptionPane.showMessageDialog(this, "Debe escribir un texto", "Error", JOptionPane.ERROR_MESSAGE);
                txtMensaje.requestFocus();
            } else {

                Email e = new Email(de, destinatario.getNombre(), asunto, fecha, mensaje);
                destinatario.anadirEmail(e);
                JOptionPane.showMessageDialog(this, "Mensaje Enviado", "Información", JOptionPane.INFORMATION_MESSAGE);
                limpiar();
            }
        } else {
            JOptionPane.showMessageDialog(this, "Debe introducir un destinatario", "Error", JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_btnEnviarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        limpiar();
    }//GEN-LAST:event_btnCancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEnviar;
    private javax.swing.JComboBox<String> cmbPara;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtAsunto;
    private javax.swing.JTextField txtDe;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextArea txtMensaje;
    // End of variables declaration//GEN-END:variables
}
