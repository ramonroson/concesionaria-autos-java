package com.mycompany.concesionariaautos.igu;

import com.mycompany.concesionariaautos.logica.Automoviles;
import com.mycompany.concesionariaautos.logica.ControladoraLogica;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ConsultaEdicionElimin extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(ConsultaEdicionElimin.class.getName());
    private List<Automoviles> listaBusqueda = null;
    ControladoraLogica control = null;
    Automoviles auto = null;

    public ConsultaEdicionElimin() {
        control = new ControladoraLogica();
        initComponents();
    }
    
    public ConsultaEdicionElimin(List<Automoviles> listaBusqueda){
        control = new ControladoraLogica();
        initComponents();
        this.listaBusqueda = listaBusqueda;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableDatos = new javax.swing.JTable();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnAtras = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel2.setBorder(new javax.swing.border.MatteBorder(null));

        tableDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tableDatos);

        btnEditar.setIcon(new javax.swing.ImageIcon("E:\\Descargas\\icons8-editar-64.png")); // NOI18N
        btnEditar.addActionListener(this::btnEditarActionPerformed);

        btnEliminar.setIcon(new javax.swing.ImageIcon("E:\\Descargas\\icons8-eliminar-48.png")); // NOI18N
        btnEliminar.addActionListener(this::btnEliminarActionPerformed);

        btnBuscar.setIcon(new javax.swing.ImageIcon("E:\\Descargas\\icons8-buscar-49.png")); // NOI18N
        btnBuscar.addActionListener(this::btnBuscarActionPerformed);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1314, Short.MAX_VALUE)
                .addGap(42, 42, 42)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditar))
                .addGap(29, 29, 29))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(btnBuscar)))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 48)); // NOI18N
        jLabel1.setText("Visualización de Automoviles");

        jLabel2.setIcon(new javax.swing.ImageIcon("E:\\Descargas\\icons8-volkswagen-96.png")); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon("E:\\Descargas\\icons8-volkswagen-96.png")); // NOI18N

        btnAtras.setIcon(new javax.swing.ImageIcon("E:\\Descargas\\icons8-volver-48.png")); // NOI18N
        btnAtras.addActionListener(this::btnAtrasActionPerformed);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(jLabel3)
                        .addGap(86, 86, 86)
                        .addComponent(jLabel1)
                        .addGap(86, 86, 86)
                        .addComponent(jLabel2)
                        .addGap(0, 329, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1))
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(38, 38, 38)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if (tableDatos.getRowCount() > 0) {
            if (tableDatos.getSelectedRow() != -1) {
                int numeroAuto = Integer.parseInt(String.valueOf(tableDatos.getValueAt(tableDatos.getSelectedRow(), 0)));
                control.borrarAuto(numeroAuto);
                mostrarMensaje("Auto Eliminado con Éxito", "Info", "Operación Éxitosa");
                cargarTabla();
                this.dispose();

            } else {
                mostrarMensaje("No ha seleccionado nigun auto", "Error", "Mensaje de Error");
            }
        } else {
            mostrarMensaje("La tabla se encuentra vacía", "Error", "Mensaje de Error");
        }
        Principal pantallaPrincipal = new Principal();
        pantallaPrincipal.setVisible(true);
        pantallaPrincipal.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        if (tableDatos.getRowCount() > 0) {
            if (tableDatos.getSelectedRow() != -1) {
                int numeroAuto = Integer.parseInt(String.valueOf(tableDatos.getValueAt(tableDatos.getSelectedRow(), 0)));
                EditarAuto pantallaEditar = new EditarAuto(numeroAuto);
                pantallaEditar.setVisible(true);
                pantallaEditar.setLocationRelativeTo(null);
                this.dispose();

            } else {
                mostrarMensaje("Debe seleccionar una fila", "Advertencia", "Advertencia");
            }
        }

    }//GEN-LAST:event_btnEditarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        if(listaBusqueda == null){
            cargarTabla();
        }else{
            cargarTablaParaBusquedas(listaBusqueda);
        }
       
    }//GEN-LAST:event_formWindowOpened

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        Principal pantallaPrincipal = new Principal();
        pantallaPrincipal.setVisible(true);
        pantallaPrincipal.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        BuscarVehiculo pantallaBuscar = new BuscarVehiculo();
        pantallaBuscar.setVisible(true);
        pantallaBuscar.setLocationRelativeTo(null);
        this.dispose();

    }//GEN-LAST:event_btnBuscarActionPerformed

    public void mostrarMensaje(String mensaje, String tipo, String titulo) {
        JOptionPane optionPane = new JOptionPane(mensaje);
        if (tipo.equalsIgnoreCase("Info")) {
            optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
        } else if (tipo.equalsIgnoreCase("Error")) {
            optionPane.setMessageType(JOptionPane.ERROR_MESSAGE);
        } else if (tipo.equalsIgnoreCase("Advertencia")) {
            optionPane.setMessageType(JOptionPane.WARNING_MESSAGE);
        }
        JDialog dialog = optionPane.createDialog(titulo);
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableDatos;
    // End of variables declaration//GEN-END:variables

    public void cargarTabla() {
        //DEFINIMOS EL MODELO DE TABLA
        DefaultTableModel modeloTabla = new DefaultTableModel() {
            //CON ESTO LOGRAMOS QUE LAS FILAS Y COLUMNAS NO SEAN EDITABLES
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        //ESTABLECEMOS LOS NOMBRES DE LAS COLUMNAS
        String titulos[] = {"ID","Modelo", "Marca", "Motor", "Color", "Patente", "CantPuertas"};
        //ESTABLECEMOS LAS COLUMNAS A NUESTRO "MODELO DE TABLA"
        modeloTabla.setColumnIdentifiers(titulos);

        //PROCEDEMOS A CARGAR DATOS
        List<Automoviles> listaAutos = control.traerAutos();
        if (listaAutos != null) {
            //RECORREMOS LA LISTA AUTOS
            for (Automoviles auto : listaAutos) {
                //GUARDAMOS EN UN VECTOR DE TIPO OBJETO TODOS LOS DATOS DEL VEHICULO
                Object automovil[] = {auto.getId(), auto.getModelo(), auto.getMarca(), auto.getMotor(),auto.getColor(), auto.getPatente(), auto.getCantPuertas()};
                //AQUI AGREGAMOS EL OBJETO AUTOMOVIL AL MODELO TABALA QUE HABÍAMOS CREADO CON ADDROW(Object objeto)
                modeloTabla.addRow(automovil);
            }
        }
        //POR ULTIMO SETEAMOS EL MODELO TABLA A LA TABLA ORIGINAL
        tableDatos.setModel(modeloTabla);
    }

    public void cargarTablaParaBusquedas(List<Automoviles> listaAutosBuscados) {
        DefaultTableModel modeloTabla = new DefaultTableModel() {

            public boolean isCellEditbale(int row, int colum) {
                return false;
            }
        };
        //ESTABLECEMOS LOS NOMBRES DE LAS COLUMNAS
        String titulos[] = {"ID","Modelo", "Marca", "Motor", "Color", "Patente", "CantPuertas"};
        //ESTABLECEMOS LAS COLUMNAS A NUESTRO "MODELO DE TABLA"
        modeloTabla.setColumnIdentifiers(titulos);
       if(listaAutosBuscados != null){
           for(Automoviles autoAux : listaAutosBuscados){
               Object automovil[] = {autoAux.getId(),autoAux.getModelo(),autoAux.getMarca(),autoAux.getMotor(),autoAux.getColor(),autoAux.getPatente(),autoAux.getCantPuertas()};
               modeloTabla.addRow(automovil);
           }
       }
       tableDatos.setModel(modeloTabla);

    }
}
