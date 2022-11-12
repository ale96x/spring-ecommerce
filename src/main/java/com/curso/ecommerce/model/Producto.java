package com.curso.ecommerce.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Producto {
    private Integer id;
    private String nombre;
    private String description;
    private String imagen;
    private Double precio;
    private Integer cantidad;
}
