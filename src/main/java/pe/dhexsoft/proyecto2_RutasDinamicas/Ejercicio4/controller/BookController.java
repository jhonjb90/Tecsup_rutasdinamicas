package pe.dhexsoft.proyecto2_RutasDinamicas.Ejercicio4.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import pe.dhexsoft.proyecto2_RutasDinamicas.Ejercicio4.model.Book;

@RestController
@RequestMapping("/books")
public class BookController {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Book addbook(@RequestBody Book book,
                        @RequestHeader("datoPrueba") String datoPrueba){
        book.setDato(datoPrueba);
        return book; //se esta retornando un objeto de tipo Book
    }
}
