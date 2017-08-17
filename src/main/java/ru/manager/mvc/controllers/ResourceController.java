package ru.manager.mvc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;
import ru.manager.mvc.data.entities.Resource;
import ru.manager.mvc.data.services.ResourceService;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

@Controller
@RequestMapping("/resource")
@SessionAttributes("resource")
public class ResourceController {

	@Autowired
	private ResourceService service;
	
	@RequestMapping("/add")
	public String add(Model model) {
		return "resource_add";
	}

	@RequestMapping("/{resourceId}")
	@ResponseBody
	public Resource findResource(@PathVariable("resourceId") Resource resource){
		return resource;
	}
	
	@RequestMapping("/find")
	public String find(Model model){
		model.addAttribute("resources", service.findAll());
		return "resources";
	}
	
	@RequestMapping("/request")
	@ResponseBody
	public String request(@RequestBody Resource resource){
		System.out.println(resource);
		//Send out an email for request
		return "Запрос был отправлен на утверждение";
	}
	
	@RequestMapping("/review")
	public String review(@ModelAttribute Resource resource){
		System.out.println("Invoking review()");
		return "resource_review";
	}
	
	@RequestMapping("/save")
	public String save(@ModelAttribute Resource resource, SessionStatus status) {
		System.out.println("Invoking save()");
		System.out.println(resource);
		status.setComplete();
		return "redirect:/resource/add";
	}

	@ModelAttribute("resource")
	public Resource getResource(){
		System.out.println("Добовляем новый ресурс в модель");
		return new Resource();
	}
	
	@ModelAttribute("typeOptions")
	public List<String> getTypes(){
		return new LinkedList<>(Arrays.asList(new String[] {
				"Материал", "Другое", "Рабочий", "Оборудование" }));
	}
	
	@ModelAttribute("radioOptions")
	public List<String> getRadios(){
		return new LinkedList<>(Arrays.asList(new String[]{
				"Часов", "Частей", "кг"
			}));
	}
	
	@ModelAttribute("checkOptions")
	public List<String> getChecks(){
		return new LinkedList<>(Arrays.asList(new String[]{
				"Времени", "Тариф", "Требует согласования"
			}));
	}
	
}
