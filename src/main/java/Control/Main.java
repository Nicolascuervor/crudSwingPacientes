/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import cuervo.Aplication.Services.CitaService;
import cuervo.Aplication.Services.DoctorService;
import cuervo.Aplication.Services.PacienteService;
import cuervo.Infraestructure.FileCitasRepository;
import cuervo.Infraestructure.FileDoctorRepository;
import cuervo.Infraestructure.FilePacienteRepository;
import cuervo.Interfaces.CitasRepository;
import cuervo.Interfaces.DoctorRepository;
import cuervo.Interfaces.PacienteRepository;

/**
 *
 * @author Nicolas
 */
public class Main {
    public static void main(String[] args) {
        
        java.awt.EventQueue.invokeLater(() -> {
            PacienteRepository repository = new FilePacienteRepository();
            PacienteService service = new PacienteService(repository);
            
            
            DoctorRepository doctorRepository = new FileDoctorRepository();
            DoctorService service2 = new DoctorService(doctorRepository);
            
            CitasRepository citasRepository = new FileCitasRepository();
            CitaService service3 = new CitaService(citasRepository);
            
            
            
            ventanaPrincipal visualApp = new ventanaPrincipal(service,service2,service3, null);
            visualApp.setVisible(true);
            
            
            
            
        });
       
    }
    
}
