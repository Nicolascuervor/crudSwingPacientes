package cuervo.Interfaces;

import cuervo.Domain.Paciente;

import java.util.List;

public interface PacienteRepository {
    void save(Paciente paciente);

    void update(Paciente paciente);

    void delete(int id);

    Paciente findById(long id);

    List<Paciente> findAll();
}
