package l3.parcial.application;

import l3.parcial.application.mapper.EstudianteMapper;
import l3.parcial.domain.Estudiante;
import l3.parcial.domain.EstudianteDto;
import l3.parcial.exception.EntityNoSeEncuentraExcepcion;
import l3.parcial.infrastructure.repository.EstudianteRepository;
import l3.parcial.infrastructure.repository.model.EstudianteEntity;
import org.springframework.stereotype.Service;

@Service
public class ActualizarEstudianteServiceImpl implements ActualizarEstudianteService {

    EstudianteRepository estudianteRepo;
    
    @Override
    public Estudiante actualizarEstudiante(Long id, EstudianteDto estudianteDto) {
        EstudianteEntity estudianteEntity = estudianteRepo.findById(id)
                .orElseThrow(() -> new EntityNoSeEncuentraExcepcion(Estudiante.class));

        estudianteEntity.setNombre(estudianteDto.getNombre());
        estudianteEntity.setApellido(estudianteDto.getApellido());
        estudianteEntity.setEdad(estudianteDto.getEdad());

        return EstudianteMapper.INSTANCE.mapToDomain(estudianteRepo.save(estudianteEntity));
    }
}
