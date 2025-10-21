package com.descansos_del_recuerdo_spa.catalogo.service.impl;

import com.descansos_del_recuerdo_spa.catalogo.entities.Urna;
import com.descansos_del_recuerdo_spa.catalogo.repositories.UrnaRepository;
import com.descansos_del_recuerdo_spa.catalogo.service.UrnaService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UrnaServiceImpl implements UrnaService {

    private final UrnaRepository urnaRepository;

    public UrnaServiceImpl(UrnaRepository urnaRepository) {
        this.urnaRepository = urnaRepository;
    }

    @Override
    public List<Urna> findAll() {
        return urnaRepository.findAll();
    }

    @Override
    public Optional<Urna> findById(Long id) {
        return urnaRepository.findById(id);
    }

    @Override
    public List<Urna> findByMaterial(Long materialId) {
        return urnaRepository.findByMaterial_Id(materialId);
    }

    @Override
    public List<Urna> findByColor(Long colorId) {
        return urnaRepository.findByColor_Id(colorId);
    }

    @Override
    public List<Urna> findByModelo(Long modeloId) {
        return urnaRepository.findByModelo_Id(modeloId);
    }

    @Override
    public Urna save(Urna urna) {
        return urnaRepository.save(urna);
    }

    @Override
    public Urna update(Long id, Urna urna) {
        urna.setId(id);
        return urnaRepository.save(urna);
    }

    @Override
    public void delete(Long id) {
        urnaRepository.deleteById(id);
    }
}