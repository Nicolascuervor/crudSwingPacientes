/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Control;

import cuervo.Aplication.Services.CitaService;
import cuervo.Aplication.Services.DoctorService;
import cuervo.Aplication.Services.PacienteService;
import cuervo.Domain.Cita;
import cuervo.Domain.Doctor;
import cuervo.Domain.Paciente;
import cuervo.Infraestructure.FileCitasRepository;
import cuervo.Infraestructure.FileDoctorRepository;
import cuervo.Infraestructure.FilePacienteRepository;
import cuervo.Interfaces.CitasRepository;
import cuervo.Interfaces.DoctorRepository;
import cuervo.Interfaces.PacienteRepository;


public class ventanaPrincipal extends javax.swing.JFrame {
    private final PacienteService pacienteService;
    private final DoctorService doctorService;
    private final CitaService citaService;
   
    
   
        
    public ventanaPrincipal(PacienteService pacienteService, DoctorService doctorService, CitaService citaService, cuervo.Aplication.Services.PacienteService pacienteService1) {
        this.pacienteService = pacienteService;
        this.doctorService = doctorService;
        this.citaService = citaService;
        
        initComponents(); 
         setTitle("Menu de administracion");
      
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
       this.setExtendedState(this.MAXIMIZED_BOTH);
        setLocationRelativeTo(null);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(240, 244, 195));
        jPanel1.setBorder(new javax.swing.border.MatteBorder(null));

        jButton2.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jButton2.setText("Administrar pacientes en el sistema");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(585, 585, 585)
                .addComponent(jButton2)
                .addContainerGap(387, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(251, 251, 251)
                .addComponent(jButton2)
                .addContainerGap(297, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
            tablaUsuarios tu = new tablaUsuarios(pacienteService, doctorService, citaService,pacienteService);    
            tu.setVisible(true); 
            this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
