package Control;

import cuervo.Aplication.Services.CitaService;
import cuervo.Aplication.Services.DoctorService;
import cuervo.Aplication.Services.PacienteService;
import cuervo.Domain.Paciente;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ContainerAdapter;
import java.awt.event.ContainerEvent;

public class VentanaRegistroP extends JFrame {
    private final PacienteService pacienteService;
    private final DoctorService doctorService;
    private final CitaService citaService;

    private JTextField name;
    private JTextField lastName;
    private JTextField age;
    private JTextField gender;
    private JTextField phone;
    private JPanel panelPacientes;
    private JButton ingresarButton;
    private JButton regresarAPantallaDeButton;


    public VentanaRegistroP(PacienteService pacienteService, DoctorService doctorService, CitaService citaService) {
        this.pacienteService = pacienteService;
        this.doctorService = doctorService;
        this.citaService = citaService;

        setContentPane(panelPacientes);
        setTitle("Registro de pacientes");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600,500);
        setLocationRelativeTo(null);

        regresarAPantallaDeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new VentanaPrinicipal(pacienteService, doctorService, citaService);
                setVisible(false);
            }
        });


        ingresarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                registrarPaciente();
            }
        });



        setVisible(true);
    }

    private void registrarPaciente() {
        try {
        String nombre = name.getText();
        String apellido = lastName.getText();
        int edad = Integer.parseInt(age.getText());
        String genero = gender.getText();
        int telefono = Integer.parseInt(phone.getText());

        Paciente paciente = new Paciente(nombre,apellido,edad,telefono,genero);

        pacienteService.crear(paciente);

        name.setText("");
        lastName.setText("");
        age.setText("");
        gender.setText("");
        phone.setText("");

        JOptionPane.showMessageDialog(null, "Registro de paciente exitoso");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Parametros invalidos detectados");
        }

    }
}
