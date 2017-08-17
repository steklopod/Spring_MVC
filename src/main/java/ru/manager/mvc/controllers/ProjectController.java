package ru.manager.mvc.controllers;

import ru.manager.mvc.data.entities.Project;
import ru.manager.mvc.data.services.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.util.ArrayList;

@Controller
@RequestMapping("/project")
public class ProjectController {

	@Autowired
	private ProjectService projectService;

	@RequestMapping(value = "find/{projectId}")
	public @ResponseBody
	Project findProjectObject(Model model,
							  @PathVariable("projectId") Long projectId) {
		return this.projectService.find(projectId);
	}

	@RequestMapping(value = "/{projectId}")
	public String findProject(Model model,
			@PathVariable("projectId") Long projectId) {
		model.addAttribute("project", this.projectService.find(projectId));
		return "project";
	}

	@RequestMapping(value = "/find")
	public String find(Model model) {
		model.addAttribute("projects", this.projectService.findAll());
		return "projects";
	}

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String addProject(Model model) {

		model.addAttribute("types", new ArrayList<String>() {
			{
				add("");
				add("Срочный");
				add("Несрочный");
			}
		});

		model.addAttribute("project", new Project());

		return "project_add";
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String saveProject(@Valid @ModelAttribute Project project,
			Errors errors, RedirectAttributes attributes) {
		
		if(errors.hasErrors()){
			return "project_add";
		}
		
		project.setProjectId(55L);
		this.projectService.save(project);
		System.out.println(project);
		
		attributes.addFlashAttribute("project", project);
		return "redirect:/";
	}


}
