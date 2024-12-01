package pe.dhexsoft.proyecto2_RutasDinamicas.Ejercicio4.controller;

import org.springframework.web.bind.annotation.*;
import pe.dhexsoft.proyecto2_RutasDinamicas.Ejercicio4.model.Book;

@RestController
@RequestMapping("/books")
public class BookController {

    @PostMapping  //no le esta poniendo valor porque es el unico valor
    public String addbook(@RequestBody Book book){
        return "libro con lo siguientes datos: "+
                book.getTitle() + " Autor: " + book.getAuthor() +
                " Estado del libro: " + book.getState();
    }
}
