package com.curso.ecommerce.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "productos")
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombre;
    private String description;
    private String imagen;
    private Double precio;
    private Integer cantidad;
    @ManyToOne
    private Usuario usuario;

    //En un producto no es necesario que muestra el detalleOrden al cual pretenece
    //@ManyToOne
    //private DetalleOrden detalle;
}
