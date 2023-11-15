package l3.parcial.infrastructure.controller;

import l3.parcial.application.ActualizarEstudianteService;
import l3.parcial.domain.Estudiante;
import l3.parcial.domain.EstudianteDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/estudiante")
public class ActualizarEstudianteController {

    private final ActualizarEstudianteService estudianteService;

    @PutMapping("/{id}/actualizar")
    public Estudiante actualizarEstudiante(@PathVariable("id") Long id, @RequestBody EstudianteDto estudianteDto) {
        log.info("Procesando la actualización del estudiante con id: {}", id);
        return estudianteService.actualizarEstudiante(id, estudianteDto);
    }
}
