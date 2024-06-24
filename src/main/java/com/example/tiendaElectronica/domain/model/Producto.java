package com.example.tiendaElectronica.domain.model;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Set;

@Getter
@Setter
public class Producto {
    private Long id;
    private BigDecimal precio;
    private String nombre;
    private int stock;
    private Set<Categoria> categorias;

    public Producto(Long id, BigDecimal precio, String nombre, int stock, Set<Categoria> categorias) {
        this.id = id;
        this.precio = precio;
        this.nombre = nombre;
        this.stock = stock;
        this.categorias = categorias;
    }
}
