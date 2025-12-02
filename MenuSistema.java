package GestionAcademica_;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class MenuSistema extends javax.swing.JFrame {

    Calendar Cal = Calendar.getInstance();
    String fechaSistema = Cal.get(Cal.YEAR) + "/"
            + String.format("%2s", Cal.get(Cal.MONTH) + 1).replace(' ', '0') + "/"
            + String.format("%2s", Cal.get(Cal.DATE)).replace(' ', '0');
    String fechaSistema1 = Cal.get(Cal.YEAR) + "/"
            + String.format("%2s", Cal.get(Cal.MONTH) + 1).replace(' ', '0') + "/"
            + String.format("%2s", Cal.get(Cal.DATE) + 1).replace(' ', '0');

    public MenuSistema() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FechaSalida = new com.toedter.calendar.JDateChooser();
        jPanel1 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        MenuPrincipal = new javax.swing.JMenu();
        bArea = new javax.swing.JMenuItem();
        bFamilia = new javax.swing.JMenuItem();
        bSubGrupo = new javax.swing.JMenuItem();
        bUnidadMedida = new javax.swing.JMenuItem();
        bCorrelativa = new javax.swing.JMenuItem();
        bPeriodosEscolares = new javax.swing.JMenuItem();
        bClientes = new javax.swing.JMenuItem();
        bClientes1 = new javax.swing.JMenuItem();
        bClientes2 = new javax.swing.JMenuItem();
        bClientes3 = new javax.swing.JMenuItem();
        bClientes4 = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        bUsuario = new javax.swing.JMenuItem();
        jSeparator6 = new javax.swing.JPopupMenu.Separator();
        bListados = new javax.swing.JMenuItem();
        MenuVenta = new javax.swing.JMenu();
        bRecepcion = new javax.swing.JMenuItem();
        bSalidaStock = new javax.swing.JMenuItem();
        bDevolucion = new javax.swing.JMenuItem();
        MenuDelivery = new javax.swing.JMenu();
        bDelivery = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        bImprimeSalida1 = new javax.swing.JMenuItem();
        MenuInformes = new javax.swing.JMenu();
        bInformeRecepcion = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        bImprimeDevolucion = new javax.swing.JMenuItem();
        btSalir = new javax.swing.JMenu();
        bSsalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 890, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 468, Short.MAX_VALUE)
        );

        MenuPrincipal.setText("Tablas Principales");

        bArea.setText("Areas");
        bArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAreaActionPerformed(evt);
            }
        });
        MenuPrincipal.add(bArea);

        bFamilia.setText("Carreras");
        bFamilia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bFamiliaActionPerformed(evt);
            }
        });
        MenuPrincipal.add(bFamilia);

        bSubGrupo.setText("Especialidades");
        bSubGrupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSubGrupoActionPerformed(evt);
            }
        });
        MenuPrincipal.add(bSubGrupo);

        bUnidadMedida.setText("Materias");
        bUnidadMedida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bUnidadMedidaActionPerformed(evt);
            }
        });
        MenuPrincipal.add(bUnidadMedida);

        bCorrelativa.setText("Correlatividad de Materias");
        bCorrelativa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCorrelativaActionPerformed(evt);
            }
        });
        MenuPrincipal.add(bCorrelativa);

        bPeriodosEscolares.setText("Periodos Escolares");
        bPeriodosEscolares.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPeriodosEscolaresActionPerformed(evt);
            }
        });
        MenuPrincipal.add(bPeriodosEscolares);

        bClientes.setText("Personas");
        bClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bClientesActionPerformed(evt);
            }
        });
        MenuPrincipal.add(bClientes);

        bClientes1.setText("Planes de Estudios");
        bClientes1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bClientes1ActionPerformed(evt);
            }
        });
        MenuPrincipal.add(bClientes1);

        bClientes2.setText("Secciones");
        bClientes2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bClientes2ActionPerformed(evt);
            }
        });
        MenuPrincipal.add(bClientes2);

        bClientes3.setText("Semestes");
        bClientes3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bClientes3ActionPerformed(evt);
            }
        });
        MenuPrincipal.add(bClientes3);

        bClientes4.setText("Docentes");
        bClientes4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bClientes4ActionPerformed(evt);
            }
        });
        MenuPrincipal.add(bClientes4);
        MenuPrincipal.add(jSeparator2);

        bUsuario.setText("Usuarios del Sistema");
        bUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bUsuarioActionPerformed(evt);
            }
        });
        MenuPrincipal.add(bUsuario);
        MenuPrincipal.add(jSeparator6);

        bListados.setText("Listado de Tablas principales");
        bListados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bListadosActionPerformed(evt);
            }
        });
        MenuPrincipal.add(bListados);

        jMenuBar1.add(MenuPrincipal);

        MenuVenta.setText("Matriculaciones");

        bRecepcion.setText("Alumnos");
        bRecepcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRecepcionActionPerformed(evt);
            }
        });
        MenuVenta.add(bRecepcion);

        bSalidaStock.setText("Habilitacion de Matriculacion");
        bSalidaStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSalidaStockActionPerformed(evt);
            }
        });
        MenuVenta.add(bSalidaStock);

        bDevolucion.setText("Matriculacion de Alumnos");
        bDevolucion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDevolucionActionPerformed(evt);
            }
        });
        MenuVenta.add(bDevolucion);

        jMenuBar1.add(MenuVenta);

        MenuDelivery.setText("Evaluaciones");

        bDelivery.setText("Carga de Notas");
        bDelivery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDeliveryActionPerformed(evt);
            }
        });
        MenuDelivery.add(bDelivery);
        MenuDelivery.add(jSeparator4);

        bImprimeSalida1.setText("Imprime Calificaciones");
        bImprimeSalida1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bImprimeSalida1ActionPerformed(evt);
            }
        });
        MenuDelivery.add(bImprimeSalida1);

        jMenuBar1.add(MenuDelivery);

        MenuInformes.setText("Informes");

        bInformeRecepcion.setText("Informe de Matriculaciones");
        bInformeRecepcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bInformeRecepcionActionPerformed(evt);
            }
        });
        MenuInformes.add(bInformeRecepcion);

        jMenuItem1.setText("Planilla para Asistencia");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        MenuInformes.add(jMenuItem1);

        bImprimeDevolucion.setText("Planilla de Acta de Calificaciones");
        bImprimeDevolucion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bImprimeDevolucionActionPerformed(evt);
            }
        });
        MenuInformes.add(bImprimeDevolucion);

        jMenuBar1.add(MenuInformes);

        btSalir.setText("Salir");
        btSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalirActionPerformed(evt);
            }
        });

        bSsalir.setText("Salir");
        bSsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSsalirActionPerformed(evt);
            }
        });
        btSalir.add(bSsalir);

        jMenuBar1.add(btSalir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalirActionPerformed
    }//GEN-LAST:event_btSalirActionPerformed

    private void bSsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSsalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_bSsalirActionPerformed

    private void bPeriodosEscolaresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPeriodosEscolaresActionPerformed
        PeriodosEscolares z = new PeriodosEscolares();
        z.setLocationRelativeTo(null);
        z.setVisible(true);
    }//GEN-LAST:event_bPeriodosEscolaresActionPerformed

    private void bListadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bListadosActionPerformed
        Reporte rp = new Reporte();
        rp.setLocationRelativeTo(null);
        rp.setVisible(true);
    }//GEN-LAST:event_bListadosActionPerformed

    private void bAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAreaActionPerformed
        Area z = new Area();
        z.setLocationRelativeTo(null);
        z.setVisible(true);
    }//GEN-LAST:event_bAreaActionPerformed

    private void bCorrelativaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCorrelativaActionPerformed
        MateriaCorrelatividad z = new MateriaCorrelatividad();
        z.setLocationRelativeTo(null);
        z.setVisible(true);
    }//GEN-LAST:event_bCorrelativaActionPerformed

    private void bUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bUsuarioActionPerformed
        Usuarios z = new Usuarios();
        z.setLocationRelativeTo(null);
        z.setVisible(true);
    }//GEN-LAST:event_bUsuarioActionPerformed

    private void bSalidaStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSalidaStockActionPerformed
        MovimientoStockSalida z = new MovimientoStockSalida();
        z.setLocationRelativeTo(null);
        z.setVisible(true);
    }//GEN-LAST:event_bSalidaStockActionPerformed

    private void bRecepcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRecepcionActionPerformed
        MovimientoStock z = new MovimientoStock();
        z.setLocationRelativeTo(null);
        z.setVisible(true);
    }//GEN-LAST:event_bRecepcionActionPerformed

    private void bInformeRecepcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bInformeRecepcionActionPerformed
        PrintInformeRecepcion z = new PrintInformeRecepcion();
        z.setLocationRelativeTo(null);
        z.setVisible(true);
    }//GEN-LAST:event_bInformeRecepcionActionPerformed

    private void bUnidadMedidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bUnidadMedidaActionPerformed
        Materia ct = new Materia();
        ct.setLocationRelativeTo(null);
        ct.setVisible(true);
    }//GEN-LAST:event_bUnidadMedidaActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        PrintInformeSalida z = new PrintInformeSalida();
        z.setLocationRelativeTo(null);
        z.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void bSubGrupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSubGrupoActionPerformed
        Especialidad z = new Especialidad();
        z.setLocationRelativeTo(null);
        z.setVisible(true);
    }//GEN-LAST:event_bSubGrupoActionPerformed

    private void bClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bClientesActionPerformed
        Clientes ct = new Clientes();
        ct.setLocationRelativeTo(null);
        ct.setVisible(true);
    }//GEN-LAST:event_bClientesActionPerformed

    private void bFamiliaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bFamiliaActionPerformed
        Carrera ct = new Carrera();
        ct.setLocationRelativeTo(null);
        ct.setVisible(true);
    }//GEN-LAST:event_bFamiliaActionPerformed

    private void bDeliveryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDeliveryActionPerformed
        Delivery z = new Delivery();
        z.setLocationRelativeTo(null);
        z.setVisible(true);
    }//GEN-LAST:event_bDeliveryActionPerformed

    private void bImprimeSalida1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bImprimeSalida1ActionPerformed
        PrintS z = new PrintS();
        z.setLocationRelativeTo(null);
        z.setVisible(true);
    }//GEN-LAST:event_bImprimeSalida1ActionPerformed

    private void bDevolucionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDevolucionActionPerformed
        MovimientoStockDevolucion ct = new MovimientoStockDevolucion();
        ct.setLocationRelativeTo(null);
        ct.setVisible(true);
    }//GEN-LAST:event_bDevolucionActionPerformed

    private void bClientes1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bClientes1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bClientes1ActionPerformed

    private void bClientes2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bClientes2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bClientes2ActionPerformed

    private void bClientes3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bClientes3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bClientes3ActionPerformed

    private void bClientes4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bClientes4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bClientes4ActionPerformed

    private void bImprimeDevolucionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bImprimeDevolucionActionPerformed
        PrintInformeDevolucion z = new PrintInformeDevolucion();
        z.setLocationRelativeTo(null);
        z.setVisible(true);
    }//GEN-LAST:event_bImprimeDevolucionActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new MenuVentas().setVisible(true);
                MenuSistema mn = new MenuSistema();
                mn.setLocationRelativeTo(null);
                mn.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser FechaSalida;
    private javax.swing.JMenu MenuDelivery;
    private javax.swing.JMenu MenuInformes;
    private javax.swing.JMenu MenuPrincipal;
    private javax.swing.JMenu MenuVenta;
    private javax.swing.JMenuItem bArea;
    private javax.swing.JMenuItem bClientes;
    private javax.swing.JMenuItem bClientes1;
    private javax.swing.JMenuItem bClientes2;
    private javax.swing.JMenuItem bClientes3;
    private javax.swing.JMenuItem bClientes4;
    private javax.swing.JMenuItem bCorrelativa;
    private javax.swing.JMenuItem bDelivery;
    private javax.swing.JMenuItem bDevolucion;
    private javax.swing.JMenuItem bFamilia;
    private javax.swing.JMenuItem bImprimeDevolucion;
    private javax.swing.JMenuItem bImprimeSalida1;
    private javax.swing.JMenuItem bInformeRecepcion;
    private javax.swing.JMenuItem bListados;
    private javax.swing.JMenuItem bPeriodosEscolares;
    private javax.swing.JMenuItem bRecepcion;
    private javax.swing.JMenuItem bSalidaStock;
    private javax.swing.JMenuItem bSsalir;
    private javax.swing.JMenuItem bSubGrupo;
    private javax.swing.JMenuItem bUnidadMedida;
    private javax.swing.JMenuItem bUsuario;
    private javax.swing.JMenu btSalir;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator6;
    // End of variables declaration//GEN-END:variables
}
