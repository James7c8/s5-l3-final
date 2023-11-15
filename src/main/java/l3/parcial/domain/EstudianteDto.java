package l3.parcial.domain;

import lombok.*;

@Data
@Builder
@AllArgsConstructor
public class EstudianteDto {
    private String nombre;
    private String apellido;
    private int edad;
}