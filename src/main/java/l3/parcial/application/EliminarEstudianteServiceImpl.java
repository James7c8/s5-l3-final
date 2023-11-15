package l3.parcial.application;

import l3.parcial.domain.Estudiante;
import l3.parcial.exception.EntityNoSeEncuentraExcepcion;
import l3.parcial.infrastructure.repository.EstudianteRepository;
import lombok.RequiredArgsConstructor;
import org.hibernate.action.internal.EntityActionVetoException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EliminarEstudianteServiceImpl implements EliminarEstudianteService {

    private final EstudianteRepository estudianteRepo;

    @Override
    public void eliminarEstudiante(Long id) {
        if (!estudianteRepo.existsById(id)) throw new EntityNoSeEncuentraExcepcion(Estudiante.class);
        estudianteRepo.deleteById(id);
    }
}
