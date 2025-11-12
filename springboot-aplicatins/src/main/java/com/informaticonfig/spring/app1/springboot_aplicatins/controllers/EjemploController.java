// 📦 Define el paquete donde se encuentra esta clase dentro del proyecto
package com.informaticonfig.spring.app1.springboot_aplicatins.controllers;

// 🧩 Importa las clases necesarias del framework Spring
import org.springframework.stereotype.Controller;  // Permite que esta clase sea detectada como un controlador MVC (que devuelve vistas HTML)
import org.springframework.ui.Model;             // Se usa para pasar datos desde el controlador hacia la vista
import org.springframework.web.bind.annotation.GetMapping; // Define rutas HTTP tipo GET

// 📄 Importa la clase "Empleados" desde el paquete models
import com.informaticonfig.spring.app1.springboot_aplicatins.models.Empleados;

/*
 * 📘 Desde este controlador se envían datos a la vista (por ejemplo, una página HTML).
 * Esto se realiza mediante el objeto Model, aplicando el patrón de inyección de dependencias.
 */

@Controller
// 🔹 Indica que esta clase es un controlador de tipo MVC (Model-View-Controller)
// 🔹 A diferencia de @RestController, aquí los métodos retornan vistas (HTML) y no JSON.

public class EjemploController {

    @GetMapping("/detalles_info")
    // 🔹 Define una ruta para manejar solicitudes HTTP GET a la URL /detalles_info
    // 🔹 Por ejemplo: http://localhost:8080/detalles_info

    public String info(Model model) {
        // 🔹 Método público llamado "info" que recibe un objeto Model.
        // 🔹 El objeto "model" se usa para enviar información del backend (Java)
        //    a la vista (por ejemplo, un archivo HTML con Thymeleaf).

        // 🧍‍♂️ Crea un objeto de tipo Empleados con datos simulados
        Empleados empleado1 = new Empleados("juan", "riguez", "calle 1", "gerente", 200, 7627777, 001);

        // 🧠 Agrega un atributo al modelo (clave-valor)
        // 🔹 "Empleado" será el nombre con el que accedemos en la vista (HTML)
        // 🔹 "empleado1" es el objeto con la información que queremos mostrar
        model.addAttribute("Empleado", empleado1);

        // 🔹 Retorna el nombre de la vista (sin extensión)
        // 🔹 Spring buscará un archivo llamado "detalles_info.html" dentro de /src/main/resources/templates/
        return "detalles_info";
    }
}

