package l3.parcial.infrastructure.controller;

import l3.parcial.application.EliminarEstudianteService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/estudiante")
public class EliminarEstudianteController {

    private final EliminarEstudianteService estudianteService;

    @DeleteMapping("/{id}/eliminar")
    public void eliminarEstudiante(@PathVariable("id") Long id) {
        estudianteService.eliminarEstudiante(id);
        log.info("Se eliminó el estudiante con id {} con éxito.", id);
    }
}
