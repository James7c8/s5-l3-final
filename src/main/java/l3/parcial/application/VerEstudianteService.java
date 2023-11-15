package l3.parcial.application;

import l3.parcial.domain.Estudiante;

import java.util.List;

public interface VerEstudianteService {
    Estudiante obtenerEstudiante(Long id);
    List<Estudiante> obtenerTodosEstudiantes();
}
