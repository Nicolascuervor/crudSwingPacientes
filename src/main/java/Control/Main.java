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

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        PacienteRepository repository = new FilePacienteRepository();
        PacienteService service = new PacienteService(repository);


        DoctorRepository doctorRepository = new FileDoctorRepository();
        DoctorService service2 = new DoctorService(doctorRepository);

        CitasRepository citasRepository = new FileCitasRepository();
        CitaService service3 = new CitaService(citasRepository);


        SwingUtilities.invokeLater(() -> {
            VentanaPrinicipal visualApp = new VentanaPrinicipal(service,service2,service3);
            visualApp.setVisible(true);
        });



    }

    }

