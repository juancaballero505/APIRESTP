package com.example.demo.Controllers;

import com.example.demo.Entities.Libro;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping( path = "api/v1/libros")
@CrossOrigin("*")
public class LibroController extends BaseControllerImpl<Libro, LibroServiceImplem>{
}
