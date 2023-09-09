/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package presentacion;

import java.util.ArrayList;
import logica.Actividad;
import logica.Controlador;
import logica.SalidaTuristica;
import logica.Departamento;

/**
 *
 * @author Pc
 */
public class ConsultaDeSalidaTuristica extends javax.swing.JInternalFrame {
    Controlador control = Controlador.getInstance();
    private ArrayList<Departamento> departamentos;
    private ArrayList<Actividad> actividades;
    private ArrayList<SalidaTuristica> salidas;
    private SalidaTuristica salida;
    private Actividad actividad;
    private boolean floaded=false;
    /**
     * Creates new form ConsultaDeSalidaTurística
     */
    public ConsultaDeSalidaTuristica() {
        initComponents();
    }
    public ConsultaDeSalidaTuristica(SalidaTuristica salida,Actividad actividad) {
        initComponents();
        this.actividad = actividad;
        this.salida = salida;
        floaded=true;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cmbActividades = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        cmbDepartamentos = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cmbSalidas = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        sprFecha = new javax.swing.JSpinner();
        jLabel5 = new javax.swing.JLabel();
        txtMaxTur = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtLugar = new javax.swing.JTextField();

        setClosable(true);
        setResizable(true);
        setTitle("Consulta de Salida Turística");
        setPreferredSize(new java.awt.Dimension(765, 600));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        cmbActividades.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbActividades.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbActividadesItemStateChanged(evt);
            }
        });

        jLabel8.setText("Actividades Turisticas");

        cmbDepartamentos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbDepartamentos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbDepartamentosItemStateChanged(evt);
            }
        });

        jLabel3.setText("Departamento");

        jLabel4.setText("Nombre Salida");

        cmbSalidas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbSalidas.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbSalidasItemStateChanged(evt);
            }
        });

        jLabel7.setText("Lugar");

        sprFecha.setModel(new javax.swing.SpinnerDateModel());
        sprFecha.setEnabled(false);

        jLabel5.setText("Max. Cant. de Turistas");

        jLabel6.setText("Fecha y Hora");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbSalidas, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(sprFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtLugar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(txtMaxTur, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbDepartamentos, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbActividades, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cmbDepartamentos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cmbActividades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cmbSalidas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(sprFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtMaxTur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtLugar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
         cmbDepartamentos.removeAllItems();
        departamentos = control.listaDepartamentos();
        for (int i = 0; i < departamentos.size();i++){
            cmbDepartamentos.addItem(departamentos.get(i).getNombre());
        }
        if (floaded){
            cmbDepartamentos.setSelectedItem(actividad.getDepartamento().getNombre());
        }
    }//GEN-LAST:event_formComponentShown

    private void cmbDepartamentosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbDepartamentosItemStateChanged
        // TODO add your handling code here:
        if (cmbDepartamentos.getItemCount()>0){
            cmbActividades.removeAllItems();
            actividades = departamentos.get(cmbDepartamentos.getSelectedIndex()).getListaActTur();
            for (int i = 0; i < actividades.size();i++){
                cmbActividades.addItem(actividades.get(i).getNombre());
            }
            if (floaded)
                cmbActividades.setSelectedItem(actividad.getNombre());
            
        }
    }//GEN-LAST:event_cmbDepartamentosItemStateChanged

    private void cmbActividadesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbActividadesItemStateChanged
        // TODO add your handling code here:
        if (cmbActividades.getItemCount()>0){
            cmbSalidas.removeAllItems();
            salidas = actividades.get(cmbActividades.getSelectedIndex()).getListaSalidaTuristica();
            for (int i = 0; i < salidas.size();i++){
                cmbSalidas.addItem(salidas.get(i).getNombre());
            }
            if(floaded)
                cmbSalidas.setSelectedItem(salida.getNombre());
        }
    }//GEN-LAST:event_cmbActividadesItemStateChanged

    private void cmbSalidasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbSalidasItemStateChanged
        // TODO add your handling code here:
        if (cmbSalidas.getItemCount()>0){
            if(!floaded)
                salida = salidas.get(cmbSalidas.getSelectedIndex());
            txtLugar.setText(salida.getLugar());
            txtMaxTur.setText(String.valueOf(salida.getCantMax()));
            sprFecha.setValue(salida.getfSalida());
            if(floaded && cmbSalidas.getSelectedItem().equals(salida.getNombre()))
                floaded = !floaded;
        }
    }//GEN-LAST:event_cmbSalidasItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbActividades;
    private javax.swing.JComboBox<String> cmbDepartamentos;
    private javax.swing.JComboBox<String> cmbSalidas;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSpinner sprFecha;
    private javax.swing.JTextField txtLugar;
    private javax.swing.JTextField txtMaxTur;
    // End of variables declaration//GEN-END:variables
}
