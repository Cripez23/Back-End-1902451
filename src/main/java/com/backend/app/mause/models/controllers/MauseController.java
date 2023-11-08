package com.backend.app.mause.models.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backend.app.mause.models.entity.Mause;
import com.backend.app.mause.models.service.MauseService;



@RestController
public class MauseController {
	@Autowired
	private MauseService service;
	
	@GetMapping("/list")
	public List<Mause> list(){
		return service.findAll();
	}
	
	@GetMapping("/mause/[id]")
	public Mause detail(@PathVariable Long id) {
		return service.findById(id);	
	}
	
	@DeleteMapping("/mause/[id]")
	public Mause delete(@PathVariable Long id) {
		 return service.findById(id);
	}
	
    // post
    @PostMapping("/mause")
    public Mause addMause(@PathVariable String name, String marca) {
        return service.setMause(name, marca);
    }

    // put
    @PutMapping("/mause/[id]")
    public  Mause updateMause(@PathVariable Long id, String name, String marca){
    	Mause updateMause = service.findById(id);
    	updateMause.setName(name);
    	updateMause.setMarca(marca);
        return service.save(updateMause);
    }
	
}
