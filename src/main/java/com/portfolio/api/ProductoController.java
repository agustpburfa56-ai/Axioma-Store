package com.portfolio.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/productos")
public class ProductoController {

    @Autowired
    private ProductoRepository productoRepository;

    // 1. LISTAR (GET) - Para ver los productos
    @GetMapping
    public List<Producto> listarProductos() {
        return productoRepository.findAll();
    }

    // 2. GUARDAR (POST) - Para crear uno nuevo desde el Admin
    @PostMapping
    public Producto guardarProducto(@RequestBody Producto producto) {
        return productoRepository.save(producto);
    }

    // 3. ELIMINAR (DELETE) - Para borrar desde el Admin
    @DeleteMapping("/{id}")
    public void eliminarProducto(@PathVariable Long id) {
        productoRepository.deleteById(id);
    }
}