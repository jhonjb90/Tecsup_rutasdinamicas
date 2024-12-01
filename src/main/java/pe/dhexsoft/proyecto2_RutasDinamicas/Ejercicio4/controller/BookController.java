package pe.dhexsoft.proyecto2_RutasDinamicas.Ejercicio4.controller;

import org.springframework.http.StreamingHttpOutputMessage;
import org.springframework.web.bind.annotation.*;
import pe.dhexsoft.proyecto2_RutasDinamicas.Ejercicio4.model.Book;

@RestController
@RequestMapping("/books")
public class BookController {

    @PostMapping
    public Book addbook(@RequestBody Book book){
        return book; //se esta retornando un objeto de tipo Book
    }
}
