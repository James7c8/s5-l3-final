package l3.parcial.application;

import l3.parcial.domain.Estudiante;

import java.util.List;

public interface VerEstudianteService {
    Estudiante getEstudiante(Long id);
    List<Estudiante> getAllEstudiantes();
}
