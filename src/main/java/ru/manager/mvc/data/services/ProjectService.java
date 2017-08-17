package ru.manager.mvc.data.services;

import ru.manager.mvc.data.entities.Project;
import ru.manager.mvc.data.entities.Sponsor;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class  ProjectService {

	private List<Project> projects = new LinkedList<>();

	public ProjectService() {
		Project javaProject = this.createProject(1L, "Java проект",
				"Это Java проект", new Sponsor("Oracle", "+7(916)555-55-55",
						"oracle@oracle.com"));
		Project javascriptProject = this.createProject(2L,
				"Javascript проект", "Это Javascript проект",
				new Sponsor("Mozilla", "+7(916)666-66-66", "mozilla@mozilla.com"));
		Project htmlProject = this.createProject(3L, "HTML проект",
				"Это HTML проект", new Sponsor("Google",
						"+7(916)777-77-77", "google@google.com"));

		this.projects.addAll(Arrays.asList(new Project[] { javaProject,
				javascriptProject, htmlProject }));
	}

	public List<Project> findAll() {
		return this.projects;
	}

	public Project find(Long projectId) {
		return this.projects.stream().filter(p -> {
			return p.getProjectId().equals(projectId);
		}).collect(Collectors.toList()).get(0);
	}
	
	public void save(Project project){
		this.projects.add(project);
	}

	private Project createProject(Long projectId, String title,
			String description, Sponsor sponsor) {
		Project project = new Project();
		project.setName(title);
		project.setAuthorizedFunds(new BigDecimal("100000"));
		project.setAuthorizedHours(new BigDecimal("1000"));
		project.setProjectId(projectId);
		project.setSpecial(false);
		project.setType("multi");
		project.setYear("2017");
		project.setDescription(description);
		project.setSponsor(sponsor);
		return project;
	}
	

}
