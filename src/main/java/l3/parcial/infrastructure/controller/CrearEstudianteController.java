package l3.parcial.infrastructure.controller;

import l3.parcial.application.CrearEstudianteService;
import l3.parcial.domain.Estudiante;
import l3.parcial.domain.EstudianteDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/estudiante")
public class CrearEstudianteController {

    private final CrearEstudianteService estudianteService;

    @PostMapping("/crear")
    public Estudiante crearEstudiante(@RequestBody EstudianteDto estudianteDto) {
        log.info("Procesando la creación del estudiante: {}", estudianteDto);
        return estudianteService.crearEstudiante(estudianteDto);
    }
}
