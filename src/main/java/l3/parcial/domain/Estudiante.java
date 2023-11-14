package l3.parcial.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class Estudiante {
    private Long id;
    private String nombre;
    private String apellido;
    private int edad;
}
