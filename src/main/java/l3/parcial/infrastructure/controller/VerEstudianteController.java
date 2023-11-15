package l3.parcial.infrastructure.controller;

import l3.parcial.application.VerEstudianteService;
import l3.parcial.domain.Estudiante;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/estudiante")
public class VerEstudianteController {
    
    private final VerEstudianteService estudianteService;
    
    @GetMapping("/{id}/ver")
    public Estudiante obtenerEstudiante(@PathVariable("id") Long id) {
        log.info("Procesando la búsqueda del estudiante con id: {}", id);
        return estudianteService.obtenerEstudiante(id);
    }

    @GetMapping("/ver-todos")
    public List<Estudiante> obtenerTodosEstudiantes() {
        log.info("Procesando la búsqueda de todos los estudiantes");
        return estudianteService.obtenerTodosEstudiantes();
    }
}
