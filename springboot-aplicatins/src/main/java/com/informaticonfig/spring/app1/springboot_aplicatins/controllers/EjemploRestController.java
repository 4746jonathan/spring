// 📦 Indica el paquete donde se encuentra esta clase (su ruta dentro del proyecto)
package com.informaticonfig.spring.app1.springboot_aplicatins.controllers;

// 🧩 Importa las clases necesarias para crear un mapa (clave-valor)
import java.util.HashMap;
import java.util.Map;

// 🧠 Importa las anotaciones que usaremos del framework Spring
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// 📄 Importa la clase "Empleados" que se encuentra en el paquete "models"
import com.informaticonfig.spring.app1.springboot_aplicatins.models.Empleados;
import com.informaticonfig.spring.app1.springboot_aplicatins.models.dto.ClaseDTO;

/*
 * 📘 Este controlador se encarga de manejar solicitudes HTTP tipo REST.
 * Desde aquí se envían datos a la vista o se devuelven en formato JSON.
 * También se aplica el patrón de inyección de dependencias de Spring.
 */

@RestController 
// 🔹 Indica que esta clase es un controlador REST (no devuelve vistas HTML, sino datos en formato JSON o similar).
// 🔹 Equivale a usar @Controller + @ResponseBody, por lo que el retorno de los métodos se convierte directamente en respuesta HTTP.

@RequestMapping("/api")
// 🔹 Define una ruta base para todas las peticiones de este controlador.
// 🔹 Todo lo que se defina dentro de esta clase comenzará con "/api", por ejemplo: /api/detalles_info2

public class EjemploRestController {  // 💡 Clase pública llamada "EjemploRestController"

    @GetMapping(path = "/detalles_info2")
    // 🔹 Define que este método responderá a solicitudes HTTP de tipo GET
    // 🔹 La ruta completa sería: http://localhost:8080/api/detalles_info2
    // 🔹 "path" es un alias de "value" (ambos indican la URL que manejará el método).

   
    public ClaseDTO detalles_info(){
      ClaseDTO usuario1= new ClaseDTO();

    usuario1.setTitulo ("administrador");
    usuario1.setUsuario("informaticonfig");
    
    
    
    
      return usuario1;
    }
}
