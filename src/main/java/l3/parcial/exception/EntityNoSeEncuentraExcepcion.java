package l3.parcial.exception;

public class EntityNoSeEncuentraExcepcion extends RuntimeException {

    public EntityNoSeEncuentraExcepcion(Class<?> entity) {
        super("El " + entity.getSimpleName().toLowerCase() + " no se encuentra en nuestros registros");
    }
}
