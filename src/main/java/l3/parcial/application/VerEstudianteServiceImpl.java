package l3.parcial.application;

import l3.parcial.application.mapper.EstudianteMapper;
import l3.parcial.domain.Estudiante;
import l3.parcial.exception.EntityNoSeEncuentraExcepcion;
import l3.parcial.infrastructure.repository.EstudianteRepository;
import l3.parcial.infrastructure.repository.model.EstudianteEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class VerEstudianteServiceImpl implements VerEstudianteService {

    private final EstudianteRepository estudianteRepo;

    @Override
    public Estudiante obtenerEstudiante(Long id) {
        EstudianteEntity estudianteEntity = estudianteRepo.findById(id)
                .orElseThrow(() -> new EntityNoSeEncuentraExcepcion(Estudiante.class));
        return EstudianteMapper.INSTANCE.mapToDomain(estudianteEntity);
    }

    @Override
    public List<Estudiante> obtenerTodosEstudiantes() {
        List<EstudianteEntity> estudianteEntities = estudianteRepo.findAll();

        return estudianteEntities.stream()
                .map(entity -> EstudianteMapper.INSTANCE.mapToDomain(entity))
                .collect(Collectors.toList());
    }
}
