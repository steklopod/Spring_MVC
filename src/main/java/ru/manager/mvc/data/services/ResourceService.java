package ru.manager.mvc.data.services;

import ru.manager.mvc.data.entities.Resource;

import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class ResourceService {

	private List<Resource> resources = new LinkedList<Resource>();

	public ResourceService() {
		this.resources.add(new Resource(1L, "Менеджер", "Служащий", new BigDecimal(
				"1000.00"), "Часы"));
		this.resources.add(new Resource(1L, "Аналитик", "Служащий", new BigDecimal(
				"500.00"), "Часы"));
		this.resources.add(new Resource(1L, "Тестировщик", "Служащий", new BigDecimal(
				"700.00"), "Часы"));

	}

	public List<Resource> findAll() {
		return this.resources;
	}

	public Resource find(Long resourceId) {
		return this.resources.stream().filter(r -> {
			return r.getResourceId().equals(resourceId);
		}).collect(Collectors.toList()).get(0);
	}
}
