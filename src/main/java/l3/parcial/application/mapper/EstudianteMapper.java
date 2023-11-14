package l3.parcial.application.mapper;

import l3.parcial.domain.Estudiante;
import l3.parcial.infrastructure.repository.model.EstudianteEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/*
* Utilizar un Mapper permite separar la lógica de aplicación (dominio) de la lógica de base de datos (entidad).
* Esta separación hace que el código sea más mantenible, ya que cambios en una capa no requieren cambios en la otra.
* También agrega seguridad a la aplicación debido a que la capa del domain no tiene acceso directo a la base de datos.
*
* Un Mapper nos deja convertir una entidad a un dominio y viceversa.
* */

@Mapper
public interface EstudianteMapper {

    EstudianteMapper INSTANCE = Mappers.getMapper(EstudianteMapper.class);

    EstudianteEntity mapToEntity(Estudiante estudiante);

    Estudiante mapToDomain(EstudianteEntity estudianteEntity);
}
