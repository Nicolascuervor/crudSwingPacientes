package Control;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */


import Control.TableRender;
import cuervo.Aplication.Services.CitaService;
import cuervo.Aplication.Services.DoctorService;
import cuervo.Aplication.Services.PacienteService;
import cuervo.Domain.Paciente;
import java.awt.Color;
import java.awt.Component;
import java.util.List;
import java.util.Set;
import static javax.management.Query.value;
import javax.swing.DefaultCellEditor;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author Nicolas
 */
public class tablaUsuarios extends javax.swing.JFrame {
    private final PacienteService pacienteService;
    private final DoctorService doctorService;
    private final CitaService citaService;
    private boolean areAllChecked = false; 
    
    
        String columnas[] = {"ID","Nombre","Apellido","Edad","Genero","Telefono","Seleccionar"};
        Boolean columnasSeleccionables[] = {false,false,false,false,false,false,true};
        
        Class[] types = new Class [] {
            java.lang.Object.class, 
            java.lang.Object.class, 
            java.lang.Object.class, 
            java.lang.Object.class, 
            java.lang.Object.class, 
            java.lang.Object.class, 
            java.lang.Boolean.class
    };
        
        
         DefaultTableModel modelo = new DefaultTableModel(){
                public boolean isCellEditable(int row, int column) {
                    
              return column == modelo.getColumnCount() - 1;
               
               
            }
         };
                 
   
     
     public Class getColumnClass(int index){
         return types[index];
     }
       

    public tablaUsuarios(PacienteService pacienteService, DoctorService doctorService, CitaService citaService, cuervo.Aplication.Services.PacienteService pacienteService1) {
        this.pacienteService = pacienteService;
        this.doctorService = doctorService;
        this.citaService = citaService;

        initComponents();
        
        modelo.setColumnIdentifiers(columnas);
        
        jTable1.setModel(modelo);
       
        
 
               
        setTitle("Lista de pacientes");
      
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        this.setExtendedState(this.MAXIMIZED_BOTH);
        setLocationRelativeTo(null);
        setBackground(new Color(238, 238, 238));
        
       

        pacienteService.listarPacientes().forEach((Paciente paciente) -> modelo.addRow(new Object[]{
                paciente.getId(),        // Columna ID
                paciente.getNombre(),    // Columna Nombre
                paciente.getApellido(),  // Columna Apellido
                paciente.getEdad(),      // Columna Edad
                paciente.getGenero(),
                paciente.getTelefono(),
                false// Columna Teléfono

  
            }));
        
        jTable1.setDefaultRenderer(jTable1.getColumnClass(0),claseRender);
        jTable1.getColumnModel().getColumn(6).setCellEditor(defaultCellEditor);
        
        
        
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));

        jTable1.setBackground(new java.awt.Color(0, 0, 0));
        jTable1.setForeground(new java.awt.Color(0, 0, 0));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Apellido", "Edad", "Genero", "Telefono", "Seleccionar"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setGridColor(new java.awt.Color(0, 0, 0));
        jTable1.setInheritsPopupMenu(true);
        jTable1.setSelectionBackground(new java.awt.Color(255, 255, 255));
        jTable1.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jTable1.setShowGrid(false);
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
            jTable1.getColumnModel().getColumn(5).setResizable(false);
        }

        jButton1.setText("Regresar a pantalla prinicipal");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Seleccionar todos");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Eliminar seleccionados");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Nombre del paciente");

        jTextField1.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Apellido del paciente");

        jTextField2.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jTextField2.setToolTipText("name");
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Edad del paciente");

        jTextField3.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Genero del paciente");

        jLabel5.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Telefono del paciente");

        jTextField5.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        jTextField6.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });

        jButton4.setText("Agregar paciente a tabla");
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Limpiar parametros");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton7.setText("Obtener datos de fila seleccionada");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("Actualizar fila seleccionada");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2)
                .addGap(52, 52, 52)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(41, 41, 41))
            .addGroup(layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 765, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jTextField3)
                    .addComponent(jTextField5)
                    .addComponent(jTextField1)
                    .addComponent(jTextField6)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7)
                    .addComponent(jButton8))
                .addContainerGap(133, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(139, 139, 139)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton4))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton5))
                            .addComponent(jLabel2))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel4))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addGap(5, 5, 5)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ventanaPrincipal vr = new ventanaPrincipal(pacienteService, doctorService, citaService,pacienteService);
        vr.setVisible(true);
        this.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
         for (int i = 0; i < jTable1.getRowCount(); i++) {
                    modelo.setValueAt(!areAllChecked, i, 6); // Cambiar el valor de la celda de la ultima columna
                }

                // Invertir el estado para la próxima vez que se presione
                areAllChecked = !areAllChecked;

                // Cambiar el texto del botón según el estado
                if (areAllChecked) {
                    jButton2.setText("Desmarcar Todos");
                } else {
                    jButton2.setText("Marcar Todos");
                }
        
       
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
    boolean foundSelected = false;

    // Recorremos las filas en orden inverso para evitar problemas al eliminar
    for (int i = jTable1.getRowCount() - 1; i >= 0; i--) {
        boolean isChecked = (Boolean) modelo.getValueAt(i, 6); // Columna del JCheckBox
        int idPaciente = ((Long) modelo.getValueAt(i, 0)).intValue(); // ID del paciente en la columna 0

        if (isChecked) {
            pacienteService.eliminarPaciente(idPaciente); // Llamada para eliminar el paciente en la base de datos
            modelo.removeRow(i); // Eliminamos la fila del modelo
            foundSelected = true;
        }
    }

    // Si no se seleccionó ninguna fila
    if (!foundSelected) {
        JOptionPane.showMessageDialog(null, "No hay nada seleccionado");
    }

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        registrarPaciente();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        jTextField2.setText("");
        jTextField6.setText("");
        jTextField1.setText("");
        jTextField3.setText("");
        jTextField5.setText("");
        
        
        JOptionPane.showMessageDialog(this,"Imagen perso","Titulo", JOptionPane.PLAIN_MESSAGE ,getIcon("C:\\Users\\Nicolas\\OneDrive\\Documentos\\NetBeansProjects\\packImagenes",40,40));
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        obtenerDatos();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        try {
            boolean foundSelected = false;

            for (int i = jTable1.getRowCount() - 1; i >= 0; i--) {
            boolean isChecked = (Boolean) modelo.getValueAt(i, 6); // Columna del JCheckBox
            int idPaciente = ((Long) modelo.getValueAt(i, 0)).intValue(); // ID del paciente en la columna 0
        
           Paciente paciente = pacienteService.buscarPacientePorId(idPaciente);

            if (isChecked) {
                paciente.setNombre(jTextField2.getText());
                paciente.setApellido( jTextField6.getText());
                paciente.setEdad(jTextField1.getText());
               paciente.setGenero(jTextField3.getText())  ;
               paciente.setTelefono( jTextField5.getText());

               pacienteService.actualizarPaciente(paciente);

               modelo.setValueAt(paciente.getNombre(), i, 1);
               modelo.setValueAt(paciente.getApellido(), i, 2);
               modelo.setValueAt(paciente.getEdad(), i, 3);
               modelo.setValueAt(paciente.getGenero(), i, 4);
               modelo.setValueAt(paciente.getTelefono(), i, 5);

               jTextField2.setText("");
               jTextField6.setText("");
               jTextField1.setText("");
               jTextField3.setText("");
               jTextField5.setText("");
               
               foundSelected = true;

            }

        }
             
            if (!foundSelected) {
                JOptionPane.showMessageDialog(null, "No hay nada seleccionado");
            }
            
        }  catch (Exception e) {JOptionPane.showMessageDialog(this, "Parametros invalidos detectados","Alerta",JOptionPane.ERROR_MESSAGE);}               
    }//GEN-LAST:event_jButton8ActionPerformed

    TableRender claseRender = new TableRender();
    JCheckBox check = new JCheckBox();
    
    DefaultCellEditor defaultCellEditor = new DefaultCellEditor (check);
    
    
 public void obtenerDatos() {
    try {
    
        int seleccionados = 0;
        boolean foundSelected = false;

        
        for (int i = 0; i < jTable1.getRowCount(); i++) {
            Boolean isChecked = (Boolean) modelo.getValueAt(i, 6);

            if (isChecked != null && isChecked) {
                seleccionados++;
            }
        }

       
        if (seleccionados > 1) {
            JOptionPane.showMessageDialog(this, "Solo puedes seleccionar una fila");
            return;
        }

       
        for (int i = jTable1.getRowCount() - 1; i >= 0; i--) {
            Boolean isChecked = (Boolean) modelo.getValueAt(i, 6); 
            int idPaciente = ((Long) modelo.getValueAt(i, 0)).intValue(); 

            
            if (isChecked != null && isChecked) {
                Paciente paciente = pacienteService.buscarPacientePorId(idPaciente);

              
                jTextField2.setText(paciente.getNombre());
                jTextField6.setText(paciente.getApellido());
                jTextField1.setText(String.valueOf(paciente.getEdad()));
                jTextField3.setText(paciente.getGenero());
                jTextField5.setText(paciente.getTelefono());

                foundSelected = true;
                break; 
            }
        }

      
        if (!foundSelected) {
            JOptionPane.showMessageDialog(null, "No hay nada seleccionado");
        }

    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Hubo un problema al ejecutar el programa");
    }
}


    
    private void registrarPaciente() {
        try {
        String nombre = jTextField2.getText();
        String apellido = jTextField6.getText();
        String edad = jTextField1.getText();
        String genero = jTextField3.getText();
        String telefono = jTextField5.getText();
        
        
         if (jTextField1.getText().equals("") || jTextField2.getText().equals("") || jTextField3.getText().equals("") || jTextField6.getText().equals("") || jTextField5.getText().equals("")) {
               JOptionPane.showMessageDialog(this, "Los parametros se encuentran vacios","Alerta",JOptionPane.ERROR_MESSAGE);
            } 
         
         
         else{
      
        Paciente paciente = new Paciente(nombre,apellido,edad,telefono,genero);

        pacienteService.crear(paciente);
       
        modelo.addRow(new Object[]{
               paciente.getId(),        // Columna ID
                paciente.getNombre(),    // Columna Nombre
                paciente.getApellido(),  // Columna Apellido
                paciente.getEdad(),      // Columna Edad
                paciente.getGenero(),
                paciente.getTelefono(),
                false// Columna Teléfono
        });
        
          

        jTextField2.setText("");
        jTextField6.setText("");
        jTextField1.setText("");
        jTextField3.setText("");
        jTextField5.setText("");

        JOptionPane.showMessageDialog(null, "Registro de paciente exitoso");
        
        modelo.getClass();

        } 
        
        
        }catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Parametros invalidos detectados","Alerta",JOptionPane.ERROR_MESSAGE);
        }
         
         }
        
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables

    
    
    
    private Icon getIcon(String javacuervoImagenes, int w, int h) {
        return new ImageIcon(new ImageIcon(getClass().getResource(javacuervoImagenes)).getImage().getScaledInstance(w, h, 0));
    }

}


 
 
    

