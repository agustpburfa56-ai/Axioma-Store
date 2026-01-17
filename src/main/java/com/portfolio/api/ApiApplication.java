package com.portfolio.api; // Tu paquete

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiApplication.class, args);
	}

	// ESTO SE EJECUTA AL INICIAR LA APP
	@Bean
	public CommandLineRunner initData(ProductoRepository repo) {
		return (args) -> {
			if (repo.count() == 0) {
				// Mira como ahora enviamos 6 cosas: la última es la foto "1.jpg"
				repo.save(new Producto("VueJS", "CAM-001", 25.0, 10, "Framework", "1.jpg"));
				repo.save(new Producto("AngularJS", "CAM-002", 25.0, 10, "Framework", "2.jpg"));
				repo.save(new Producto("ReactJS", "CAM-003", 25.0, 10, "Libreria", "3.jpg"));
				repo.save(new Producto("Redux", "CAM-004", 25.0, 10, "Estado", "4.jpg"));
				repo.save(new Producto("Node.js", "CAM-005", 25.0, 10, "Backend", "5.jpg"));
				repo.save(new Producto("SASS", "CAM-006", 25.0, 10, "CSS", "6.jpg"));
				repo.save(new Producto("HTML5", "CAM-007", 25.0, 10, "Web", "7.jpg"));
				repo.save(new Producto("Github", "CAM-008", 25.0, 10, "Git", "8.jpg"));
				repo.save(new Producto("BulmaCSS", "CAM-009", 25.0, 10, "CSS", "9.jpg"));
				repo.save(new Producto("TypeScript", "CAM-010", 25.0, 10, "JS", "10.jpg"));

				System.out.println("✅ ¡Axioma Store: Productos cargados con éxito!");
			}
		};
	}
}