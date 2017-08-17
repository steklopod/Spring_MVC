package ru.manager.mvc.converters;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;

import ru.manager.mvc.data.entities.Resource;
import ru.manager.mvc.data.services.ResourceService;

public class ResourceConverter implements Converter<String, Resource> {

	@Autowired
	private ResourceService service;
	
	@Override
	public Resource convert(String resourceId) {
		return service.find(new Long(resourceId));
	}

}
