package com.descansos_del_recuerdo_spa.catalogo.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "imagen_urna")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ImagenUrna {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 255)
    private String url;

    @Column(nullable = false)
    private Boolean principal = false;

    @ManyToOne
    @JoinColumn(name = "urna_id", nullable = false)
    @JsonIgnore
    private Urna urna;
}