package com.descansos_del_recuerdo_spa.catalogo.repositories;


import com.descansos_del_recuerdo_spa.catalogo.entities.ImagenUrna;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ImagenUrnaRepository extends JpaRepository<ImagenUrna, Long> {

    // Buscar imágenes asociadas a una urna
    List<ImagenUrna> findByUrna_Id(Long urnaId);

    // Buscar la imagen principal
    ImagenUrna findByUrna_IdAndPrincipalTrue(Long urnaId);
}