package l3.parcial.application;

import l3.parcial.application.mapper.EstudianteMapper;
import l3.parcial.domain.Estudiante;
import l3.parcial.exception.EntityNoSeEncuentraExcepcion;
import l3.parcial.infrastructure.repository.EstudianteRepository;
import l3.parcial.infrastructure.repository.model.EstudianteEntity;

import java.util.ArrayList;
import java.util.List;

public class VerEstudianteServiceImpl implements VerEstudianteService {

    EstudianteRepository estudianteRepo;

    @Override
    public Estudiante obtenerEstudiante(Long id) {
        EstudianteEntity estudianteEntity = estudianteRepo.findById(id)
                .orElseThrow(() -> new EntityNoSeEncuentraExcepcion(Estudiante.class));
        return EstudianteMapper.INSTANCE.mapToDomain(estudianteEntity);
    }

    @Override
    public List<Estudiante> obtenerTodosEstudiantes() {
        List<EstudianteEntity> estudianteEntities = estudianteRepo.findAll();
        List<Estudiante> estudiantes = new ArrayList<>();
        for (EstudianteEntity entity : estudianteEntities) {
            estudiantes.add(EstudianteMapper.INSTANCE.mapToDomain(entity));
        }
        return estudiantes;
    }
}
