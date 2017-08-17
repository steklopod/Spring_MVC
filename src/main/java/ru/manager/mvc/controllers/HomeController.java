package ru.manager.mvc.controllers;

import ru.manager.mvc.data.entities.Project;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping(value="/")
	public String goHomeAgain(Model model, @ModelAttribute("project") Project project){
		model.addAttribute("currentProject", project);
		return "home";
	}

/*	@RequestMapping("/")
	public String goHome(Model model){
		
		Project project = new Project();
		project.setName("Проект №123");
		project.setSponsor(new Sponsor("ГАЗПРОМ", "+7(916)123-32-12", "gazprom@gazprom.ru"));
		project.setDescription("Заказчиком проекта является газпром");
		
		model.addAttribute("currentProject", project);
		
		return "welcome";
	}*/
}
