package l3.parcial.application;

import l3.parcial.domain.Estudiante;
import l3.parcial.domain.EstudianteDto;

public interface ActualizarEstudianteService {
    Estudiante actualizarEstudiante(Long id, EstudianteDto estudianteDto);
}
