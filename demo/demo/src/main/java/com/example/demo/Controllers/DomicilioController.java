package com.example.demo.Controllers;

import com.example.demo.Entities.Domicilio;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/v1/domicilios")
@CrossOrigin("*")
public class DomicilioController extends BaseControllerImpl<Domicilio, DomicilioServiceImplem> {
}
