package com.ejemplo.rest.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.ejemplo.rest.PersonaBO;
import com.ejemplo.rest.model.PersonaModel;




@Mapper(componentModel = "spring", uses = { DireccionMapper.class})
public interface PersonaMapper {
	
	PersonaMapper INSTANCE = Mappers.getMapper(PersonaMapper.class);
	
	PersonaBO modelToBO(PersonaModel personaModel);
	PersonaModel BOToModel(PersonaBO personaBO);

}
