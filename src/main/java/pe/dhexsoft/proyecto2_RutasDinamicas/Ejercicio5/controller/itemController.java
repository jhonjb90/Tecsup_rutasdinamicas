package pe.dhexsoft.proyecto2_RutasDinamicas.Ejercicio5.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.dhexsoft.proyecto2_RutasDinamicas.Ejercicio5.exception.ItemNotFoundException;

@RestController
@RequestMapping("/items")
public class itemController {

    @GetMapping("/{id}")
    public String getItemById(@PathVariable int id){
        if(id != 1){
            throw new ItemNotFoundException();
        }
        return "el item buscado con ID: "+ id + " ha sido ubicado ";
    }
}
