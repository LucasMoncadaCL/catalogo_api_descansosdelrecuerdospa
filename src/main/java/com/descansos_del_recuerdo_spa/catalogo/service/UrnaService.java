package com.descansos_del_recuerdo_spa.catalogo.service;

import com.descansos_del_recuerdo_spa.catalogo.entities.Urna;

import java.util.List;
import java.util.Optional;

public interface UrnaService {
    List<Urna> findAll();
    Optional<Urna> findById(Long id);
    List<Urna> findByMaterial(Long materialId);
    List<Urna> findByColor(Long colorId);
    List<Urna> findByModelo(Long modeloId);
    Urna save(Urna urna);
    Urna update(Long id, Urna urna);
    void delete(Long id);
}