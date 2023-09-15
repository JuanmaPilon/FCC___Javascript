/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package presentacion;
import java.util.Calendar;
import java.util.Date;
import logica.Controlador;
/**
 *
 * @author natil
 */
public class CrearPaqueteActividadTuristica extends javax.swing.JInternalFrame {
    Controlador control = Controlador.getInstance();
    /**
     * Creates new form CrearPaqueteActividadTuristica
     */
    public CrearPaqueteActividadTuristica() {
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

        jlabel1 = new javax.swing.JLabel();
        nombrePaquete = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        descripcionPaquete = new javax.swing.JTextField();
        validezPaquete = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        aceptarCrearPaquete = new javax.swing.JButton();
        cancelarCrearPaquete = new javax.swing.JButton();
        descuentoPaquete = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        fechaAltaPaqueteM = new javax.swing.JSpinner();
        fechaAltaPaqueteD = new javax.swing.JSpinner();
        fechaAltaPaqueteA = new javax.swing.JSpinner();

        setClosable(true);
        setResizable(true);
        setTitle("Crear Paquete de Actividad Turistica");

        jlabel1.setText("Nombre del Paquete:");

        nombrePaquete.setFont(new java.awt.Font("Segoe UI", 2, 15)); // NOI18N

        jLabel1.setText("Descripcion:");

        descripcionPaquete.setFont(new java.awt.Font("Segoe UI", 2, 15)); // NOI18N

        jLabel2.setText("Periodo de Validez (dias):");

        jLabel3.setText("Fecha Alta: ");

        aceptarCrearPaquete.setText("Aceptar");
        aceptarCrearPaquete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarCrearPaqueteActionPerformed(evt);
            }
        });

        cancelarCrearPaquete.setText("Limpiar");
        cancelarCrearPaquete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarCrearPaqueteActionPerformed(evt);
            }
        });

        jLabel4.setText("Descuento:");

        fechaAltaPaqueteM.setModel(new javax.swing.SpinnerNumberModel(1, 1, 12, 1));

        fechaAltaPaqueteD.setModel(new javax.swing.SpinnerNumberModel(1, 1, 31, 1));

        fechaAltaPaqueteA.setModel(new javax.swing.SpinnerNumberModel(1900, 1900, 2023, 1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlabel1)
                        .addGap(18, 18, 18)
                        .addComponent(nombrePaquete, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(descripcionPaquete, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(validezPaquete))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(descuentoPaquete, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(cancelarCrearPaquete)
                                .addGap(133, 133, 133)
                                .addComponent(aceptarCrearPaquete))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(fechaAltaPaqueteD, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(fechaAltaPaqueteM, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(fechaAltaPaqueteA, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(60, 60, 60)))
                .addContainerGap(186, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlabel1)
                    .addComponent(nombrePaquete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(descripcionPaquete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(validezPaquete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(fechaAltaPaqueteM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fechaAltaPaqueteD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fechaAltaPaqueteA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(descuentoPaquete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(78, 78, 78)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aceptarCrearPaquete)
                    .addComponent(cancelarCrearPaquete))
                .addContainerGap(167, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void aceptarCrearPaqueteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarCrearPaqueteActionPerformed
        String nombreDePaquete = nombrePaquete.getText();
        String descripcionDePaquete = descripcionPaquete.getText();
        int validezDePaquete = Integer.parseInt(validezPaquete.getText());
        int diaD = (int) fechaAltaPaqueteD.getValue();
        int mesM = (int) fechaAltaPaqueteM.getValue();
        int anioA = (int) fechaAltaPaqueteA.getValue();
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, anioA);
        calendar.set(Calendar.MONTH, mesM - 1); // Los meses en Calendar se indexan desde 0 (enero) hasta 11 (diciembre) sasa
        calendar.set(Calendar.DAY_OF_MONTH, diaD);
        Date fecha = calendar.getTime();
        int descuentoDePaquete = Integer.parseInt(descuentoPaquete.getText());
        control.crearPaqueteActividadTuristica(nombreDePaquete,descripcionDePaquete,validezDePaquete,fecha, descuentoDePaquete);
    }//GEN-LAST:event_aceptarCrearPaqueteActionPerformed

    private void cancelarCrearPaqueteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarCrearPaqueteActionPerformed
        nombrePaquete.setText("");
        descripcionPaquete.setText("");
        validezPaquete.setText("");
        fechaAltaPaqueteD.setValue(1);
        fechaAltaPaqueteM.setValue(1);
        fechaAltaPaqueteA.setValue(1900);
        descuentoPaquete.setText("");
    }//GEN-LAST:event_cancelarCrearPaqueteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aceptarCrearPaquete;
    private javax.swing.JButton cancelarCrearPaquete;
    private javax.swing.JTextField descripcionPaquete;
    private javax.swing.JTextField descuentoPaquete;
    private javax.swing.JSpinner fechaAltaPaqueteA;
    private javax.swing.JSpinner fechaAltaPaqueteD;
    private javax.swing.JSpinner fechaAltaPaqueteM;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jlabel1;
    private javax.swing.JTextField nombrePaquete;
    private javax.swing.JTextField validezPaquete;
    // End of variables declaration//GEN-END:variables
}
