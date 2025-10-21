package com.descansos_del_recuerdo_spa.catalogo.controller;

import com.descansos_del_recuerdo_spa.catalogo.entities.Urna;
import com.descansos_del_recuerdo_spa.catalogo.service.UrnaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/urnas")
@CrossOrigin(origins = "*")
public class UrnaController {

    private final UrnaService urnaService;

    public UrnaController(UrnaService urnaService) {
        this.urnaService = urnaService;
    }

    @GetMapping
    public ResponseEntity<List<Urna>> getAll() {
        return ResponseEntity.ok(urnaService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Urna> getById(@PathVariable Long id) {
        return urnaService.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/material/{materialId}")
    public ResponseEntity<List<Urna>> getByMaterial(@PathVariable Long materialId) {
        return ResponseEntity.ok(urnaService.findByMaterial(materialId));
    }

    @GetMapping("/color/{colorId}")
    public ResponseEntity<List<Urna>> getByColor(@PathVariable Long colorId) {
        return ResponseEntity.ok(urnaService.findByColor(colorId));
    }

    @GetMapping("/modelo/{modeloId}")
    public ResponseEntity<List<Urna>> getByModelo(@PathVariable Long modeloId) {
        return ResponseEntity.ok(urnaService.findByModelo(modeloId));
    }

    @PostMapping
    public ResponseEntity<Urna> create(@RequestBody Urna urna) {
        return ResponseEntity.status(201).body(urnaService.save(urna));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Urna> update(@PathVariable Long id, @RequestBody Urna urna) {
        return ResponseEntity.ok(urnaService.update(id, urna));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        urnaService.delete(id);
        return ResponseEntity.noContent().build();
    }
}