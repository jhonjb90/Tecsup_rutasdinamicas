package pe.dhexsoft.proyecto2_RutasDinamicas.Ejercicio3;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Search")
public class SearchController {

    @GetMapping("/products")
    public String searchProducts(@RequestParam String clave,
                                 @RequestParam(required = false) String category){
        return  "Buscando los productos con la clave: " + clave +
                (category != null ? " con categoria " + category : ""); // se esta utilizando operador ternario
    }

}
