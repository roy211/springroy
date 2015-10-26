package com.ejemplo.rest.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.ejemplo.rest.DireccionBO;
import com.ejemplo.rest.model.DireccionModel;

@Mapper (componentModel = "spring")
public interface DireccionMapper {
	
	DireccionMapper INSTANCE = Mappers.getMapper(DireccionMapper.class);
	
	DireccionBO modelToBO (DireccionModel direccionModel);
	DireccionModel BOToModel(DireccionBO direccionBO);

}
