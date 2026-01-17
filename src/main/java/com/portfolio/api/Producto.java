package com.portfolio.api;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;      // Ej: "VueJS"
    private String codigo;      // Ej: "CAM-001"
    private Double precio;      // Ej: 25.0
    private Integer stock;      // Ej: 10
    private String categoria;   // Ej: "FrontEnd"

    // 👇 NUEVO CAMPO: Para guardar "1.jpg", "2.jpg", etc.
    private String imagen;

    // --- CONSTRUCTORES ---
    public Producto() { }

    // Actualizamos el constructor para incluir la imagen
    public Producto(String nombre, String codigo, Double precio, Integer stock, String categoria, String imagen) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.precio = precio;
        this.stock = stock;
        this.categoria = categoria;
        this.imagen = imagen;
    }

    // --- GETTERS Y SETTERS ---
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getCodigo() { return codigo; }
    public void setCodigo(String codigo) { this.codigo = codigo; }

    public Double getPrecio() { return precio; }
    public void setPrecio(Double precio) { this.precio = precio; }

    public Integer getStock() { return stock; }
    public void setStock(Integer stock) { this.stock = stock; }

    public String getCategoria() { return categoria; }
    public void setCategoria(String categoria) { this.categoria = categoria; }

    // Getter y Setter para la Imagen
    public String getImagen() { return imagen; }
    public void setImagen(String imagen) { this.imagen = imagen; }
}