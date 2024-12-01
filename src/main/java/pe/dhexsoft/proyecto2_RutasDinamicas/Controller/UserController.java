package pe.dhexsoft.proyecto2_RutasDinamicas.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping("/{name}/age/{id}") //lo de parentisis{} es variables
    public String greetUser(@PathVariable String name, @PathVariable int age){ //para cada paremetro tiene que tener su @PathVariable
        return "hola usuario " + name + " tu edad es " + age;
    }


}
