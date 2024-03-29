/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import controlador.Empresa;
import modelo.Usuario;

/**
 *
 * @author Yesica
 */
public class VtnOperaciones extends javax.swing.JFrame {

    Empresa empresa;
    Usuario usuario;
    PnlConsultaUsu panelConsulta;
    PnlAlta panelAlta;
    PnlBaja panelBaja;
    PnlCambioContraPropia panelContraPropia;
    PnlCambioContraUsu panelContraUsu;
    PnlEnviar panelEnviar;
    PnlLeer panelLeer;
    

    /**
     * Constructor
     *
     * @param empresa
     * @param usuario
     */
    public VtnOperaciones(Empresa empresa, Usuario usuario) {
        initComponents();
        this.empresa = empresa;
        //this.setSize(650,610);
        this.usuario = usuario;
        int perfil = usuario.getPerfil();
        if (perfil == 2) {
            mnuGestion.setVisible(false);
        }
        this.setTitle("Bienvenido a lmail " + usuario.getNombre());
    }

    /**
     * Elimina los paneles para poder colocar otro en su lugar
     */
    private void quitarPaneles() {
        fondo.setVisible(false);
        try {
            this.getContentPane().remove(panelConsulta);
        } catch (Exception ex) {
        }
        try {
            this.getContentPane().remove(panelAlta);
        } catch (Exception ex) {
        }
        try {
            this.getContentPane().remove(panelBaja);
        } catch (Exception ex) {
        }
        try {
            this.getContentPane().remove(panelContraPropia);
        } catch (Exception ex) {
        }
        try {
            this.getContentPane().remove(panelContraUsu);
        } catch (Exception ex) {
        }
        try {
            this.getContentPane().remove(panelEnviar);
        } catch (Exception ex) {
        }
        try {
            this.getContentPane().remove(panelLeer);
        } catch (Exception ex) {
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

        fondo = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnuLeer = new javax.swing.JMenuItem();
        mnuEnviar = new javax.swing.JMenuItem();
        mnuCambioPropia = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        mnuGestion = new javax.swing.JMenu();
        mnuAltaUsu = new javax.swing.JMenuItem();
        mnuBajaUsu = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        mnuCambioUsu = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        mnuSalir = new javax.swing.JMenuItem();
        mnuDesconectar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.FlowLayout());

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/3.png"))); // NOI18N
        getContentPane().add(fondo);

        jMenu1.setText("Mensajes");
        jMenu1.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N

        mnuLeer.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        mnuLeer.setForeground(new java.awt.Color(0, 153, 153));
        mnuLeer.setText("Leer Bandeja");
        mnuLeer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuLeerActionPerformed(evt);
            }
        });
        jMenu1.add(mnuLeer);

        mnuEnviar.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        mnuEnviar.setForeground(new java.awt.Color(0, 153, 153));
        mnuEnviar.setText("Enviar lmail");
        mnuEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuEnviarActionPerformed(evt);
            }
        });
        jMenu1.add(mnuEnviar);

        mnuCambioPropia.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        mnuCambioPropia.setForeground(new java.awt.Color(0, 153, 153));
        mnuCambioPropia.setText("Cambiar contraseña");
        mnuCambioPropia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuCambioPropiaActionPerformed(evt);
            }
        });
        jMenu1.add(mnuCambioPropia);

        jMenuBar1.add(jMenu1);

        jMenu4.setText("              ");
        jMenu4.setEnabled(false);
        jMenuBar1.add(jMenu4);

        mnuGestion.setText("Gestión Usuarios");
        mnuGestion.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N

        mnuAltaUsu.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        mnuAltaUsu.setForeground(new java.awt.Color(0, 153, 153));
        mnuAltaUsu.setText("Alta usuario");
        mnuAltaUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuAltaUsuActionPerformed(evt);
            }
        });
        mnuGestion.add(mnuAltaUsu);

        mnuBajaUsu.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        mnuBajaUsu.setForeground(new java.awt.Color(0, 153, 153));
        mnuBajaUsu.setText("Baja Usuario");
        mnuBajaUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuBajaUsuActionPerformed(evt);
            }
        });
        mnuGestion.add(mnuBajaUsu);

        jMenuItem1.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jMenuItem1.setForeground(new java.awt.Color(0, 153, 153));
        jMenuItem1.setText("Consulta Usuarios");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        mnuGestion.add(jMenuItem1);

        mnuCambioUsu.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        mnuCambioUsu.setForeground(new java.awt.Color(0, 153, 153));
        mnuCambioUsu.setText("Gestionar contraseñas");
        mnuCambioUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuCambioUsuActionPerformed(evt);
            }
        });
        mnuGestion.add(mnuCambioUsu);

        jMenuBar1.add(mnuGestion);

        jMenu5.setText("                                                           ");
        jMenu5.setEnabled(false);
        jMenuBar1.add(jMenu5);

        jMenu3.setText("Salir");
        jMenu3.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N

        mnuSalir.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        mnuSalir.setForeground(new java.awt.Color(0, 153, 153));
        mnuSalir.setText("Salir");
        mnuSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuSalirActionPerformed(evt);
            }
        });
        jMenu3.add(mnuSalir);

        mnuDesconectar.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        mnuDesconectar.setForeground(new java.awt.Color(0, 153, 153));
        mnuDesconectar.setText("Desconectar");
        mnuDesconectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuDesconectarActionPerformed(evt);
            }
        });
        jMenu3.add(mnuDesconectar);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mnuLeerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuLeerActionPerformed
        quitarPaneles();
        panelLeer = new PnlLeer(empresa, usuario);
        this.getContentPane().add(panelLeer);
        pack();
    }//GEN-LAST:event_mnuLeerActionPerformed

    private void mnuEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuEnviarActionPerformed
        quitarPaneles();
        panelEnviar = new PnlEnviar(empresa, usuario);
        this.getContentPane().add(panelEnviar);
        pack();
    }//GEN-LAST:event_mnuEnviarActionPerformed

    private void mnuCambioPropiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuCambioPropiaActionPerformed
        quitarPaneles();
        panelContraPropia = new PnlCambioContraPropia(empresa, usuario);
        this.getContentPane().add(panelContraPropia);
        pack();
    }//GEN-LAST:event_mnuCambioPropiaActionPerformed

    private void mnuAltaUsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuAltaUsuActionPerformed
        quitarPaneles();
        panelAlta = new PnlAlta(empresa);
        this.getContentPane().add(panelAlta);
        pack();
    }//GEN-LAST:event_mnuAltaUsuActionPerformed

    private void mnuBajaUsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuBajaUsuActionPerformed
        quitarPaneles();
        panelBaja = new PnlBaja(empresa, usuario);
        this.getContentPane().add(panelBaja);
        pack();
    }//GEN-LAST:event_mnuBajaUsuActionPerformed

    private void mnuCambioUsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuCambioUsuActionPerformed
        quitarPaneles();
        panelContraUsu = new PnlCambioContraUsu(empresa);
        this.getContentPane().add(panelContraUsu);
        pack();
    }//GEN-LAST:event_mnuCambioUsuActionPerformed

    private void mnuSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuSalirActionPerformed
        dispose();
        System.exit(0);
    }//GEN-LAST:event_mnuSalirActionPerformed

    private void mnuDesconectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuDesconectarActionPerformed
        new VtnLogin(empresa).setVisible(true);
        dispose();
        pack();
    }//GEN-LAST:event_mnuDesconectarActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
   quitarPaneles();
        panelConsulta = new PnlConsultaUsu(empresa);
        this.getContentPane().add(panelConsulta);
        pack();
    }//GEN-LAST:event_jMenuItem1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fondo;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem mnuAltaUsu;
    private javax.swing.JMenuItem mnuBajaUsu;
    private javax.swing.JMenuItem mnuCambioPropia;
    private javax.swing.JMenuItem mnuCambioUsu;
    private javax.swing.JMenuItem mnuDesconectar;
    private javax.swing.JMenuItem mnuEnviar;
    private javax.swing.JMenu mnuGestion;
    private javax.swing.JMenuItem mnuLeer;
    private javax.swing.JMenuItem mnuSalir;
    // End of variables declaration//GEN-END:variables

}
