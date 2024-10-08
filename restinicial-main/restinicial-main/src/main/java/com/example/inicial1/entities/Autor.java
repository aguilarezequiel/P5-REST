package com.example.inicial1.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.Audited;

@Entity
@Table(name = "Autor")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Autor extends Base{
    @Column(name = "nombre")
    private String nombre;

    @Column(name = "Apellido")
    private String apellido;

    @Column(name = "biografia", length = 1500)
    private String biografia;


}
