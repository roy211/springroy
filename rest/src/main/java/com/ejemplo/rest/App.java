package com.ejemplo.rest;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ejemplo.rest.mappers.PersonaAlgoMapper;
import com.ejemplo.rest.mappers.PersonaMapper;
import com.ejemplo.rest.model.DireccionModel;
import com.ejemplo.rest.model.PersonaModel;

@RestController
@EnableAutoConfiguration
@ComponentScan
public class App {

	@Autowired
	private PersonaModel  personaModel;
	
	@Autowired
	private DireccionModel  direccionModel;
	
	@Autowired
	private PersonaAlgoMapper  personaAlgoMapper;	
	
    @RequestMapping("/persona")
    public @ResponseBody PersonaBO persona() {
    	
    	Date now = new Date();
    	
    	personaModel.setNombre("royner");
    	personaModel.setApellido("mejia");
    	personaModel.setFecha(now);
    	direccionModel.setId(10L);
    	direccionModel.setTexto("caracas");
    	personaModel.setDireccion(direccionModel);

    	
        return personaAlgoMapper.modelToBO(personaModel);
    }
    
    @RequestMapping(value ="/registrar", consumes="application/json",method = RequestMethod.PUT)
    public void registrar(@RequestBody  PersonaBO persona) {
    	
    	System.out.println(persona.getFecha());
    	System.out.println(persona.getNombre());
        
    }
    

    public static void main(String[] args) throws Exception {
        SpringApplication.run(App.class, args);
    }

}