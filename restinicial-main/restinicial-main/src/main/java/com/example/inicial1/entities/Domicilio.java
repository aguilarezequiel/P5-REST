package com.example.inicial1.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="domicilio")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@Builder
public class Domicilio extends Base{
    @Column(name="calle")
    private String calle;

    @Column(name="numero")
    private int numero;


    @ManyToOne(optional=false)
    @JoinColumn(name = "fk_localidad")
    private Localidad localidad;
}
