package l3.parcial.infrastructure.repository;

import l3.parcial.infrastructure.repository.model.EstudianteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstudianteRepository extends JpaRepository<EstudianteEntity, Long> {
}
