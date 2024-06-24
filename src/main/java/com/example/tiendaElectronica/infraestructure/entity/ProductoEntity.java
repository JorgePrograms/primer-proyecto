package com.example.tiendaElectronica.infraestructure.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@Table(name = "producto")
public class ProductoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private BigDecimal precio;
    private String nombre;
    private int stock;

    @ManyToMany(mappedBy = "productosEntities")
    @JsonIgnore
    private Set<CategoriaEntity> categoriaEntities = new HashSet<>();

    public ProductoEntity() {
    }

    public ProductoEntity(Long id, BigDecimal precio, String nombre, int stock, Set<CategoriaEntity> categoriaEntities) {
        this.id = id;
        this.precio = precio;
        this.nombre = nombre;
        this.stock = stock;
        this.categoriaEntities = categoriaEntities;

    }


}