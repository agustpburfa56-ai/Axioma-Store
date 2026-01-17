package com.portfolio.api;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Long> {
    // ¡Listo! Spring Boot ya sabe hacer todo el CRUD (Guardar, Borrar, Buscar)
}