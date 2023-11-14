package l3.parcial.application;

import l3.parcial.application.mapper.EstudianteMapper;
import l3.parcial.domain.Estudiante;
import l3.parcial.infrastructure.repository.EstudianteRepository;
import l3.parcial.infrastructure.repository.model.EstudianteEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CrearEstudianteServiceImpl implements CrearEstudianteService {

    private final EstudianteRepository estudianteRepo;

    @Override
    public Estudiante crearEstudiante(Estudiante estudiante) {
        EstudianteEntity estudianteEntity = EstudianteMapper.INSTANCE.mapToEntity(estudiante);

        // Cuando se guarda una entidad en la base de datos con .save(), lo que se devuelve es la entidad después de ser
        // persistida. Por ejemplo, si la base de datos ejecuta un trigger que añade un timestamp a la entidad, este se
        // incluirá en la entidad devuelta. BUENA PRÁCTICA.
        EstudianteEntity estudianteEntityPersistido = estudianteRepo.save(estudianteEntity);
        return EstudianteMapper.INSTANCE.mapToDomain(estudianteEntityPersistido);
    }
}
