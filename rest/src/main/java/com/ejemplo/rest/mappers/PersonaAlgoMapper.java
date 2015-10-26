package com.ejemplo.rest.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

import com.ejemplo.rest.PersonaBO;
import com.ejemplo.rest.model.PersonaModel;

@Mapper(componentModel = "spring", uses = { PersonaMapper.class})
public interface PersonaAlgoMapper {
	
	PersonaAlgoMapper INSTANCE = Mappers.getMapper(PersonaAlgoMapper.class);
	
	
	@Mappings({ @Mapping(target = "direccion", ignore = true), @Mapping(source = "fecha", dateFormat = "dd.MM.yyyy", target = "fecha") })
	PersonaBO modelToBO(PersonaModel personaModel);
	
	

	
	
	
}
