package pe.dhexsoft.proyecto2_RutasDinamicas.Ejercicio5.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ItemNotFoundException extends RuntimeException  {

    public ItemNotFoundException(){
        super("item no encontrado");
    }

}
