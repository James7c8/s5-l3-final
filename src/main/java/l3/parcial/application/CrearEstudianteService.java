package l3.parcial.application;

import l3.parcial.domain.Estudiante;
import l3.parcial.domain.EstudianteDto;

public interface CrearEstudianteService {
    Estudiante crearEstudiante(EstudianteDto estudianteDto);
}
