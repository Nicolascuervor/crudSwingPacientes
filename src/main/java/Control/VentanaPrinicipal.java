package Control;

import cuervo.Aplication.Services.CitaService;
import cuervo.Aplication.Services.DoctorService;
import cuervo.Aplication.Services.PacienteService;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaPrinicipal extends JFrame{

    private final PacienteService pacienteService;
    private final DoctorService doctorService;
    private final CitaService citaService;

    private JButton Botton1;
    private JPanel panel1;
    private JButton verListaDePacientesButton;
    private JButton verListaDeCitasButton;
    private JButton Rpacientes;

    public VentanaPrinicipal(PacienteService pacienteService, DoctorService doctorService, CitaService citaService){
        this.pacienteService = pacienteService;
        this.doctorService = doctorService;
        this.citaService = citaService;
        setContentPane(panel1);
        setTitle("Ventana 1");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600,500);
        setLocationRelativeTo(null);
        setVisible(true);

        Rpacientes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new VentanaRegistroP(pacienteService, doctorService, citaService);
                setVisible(false);
            }
        });
    }


}
