package com.progra3.petstore.controllers;

import java.util.List;

import com.progra3.petstore.entities.Pet;
import com.progra3.petstore.services.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pet")
public class PetController {

	@Autowired
	private PetService service;

	@GetMapping
	public List<Pet> findAll(){
		return service.listAll();

	}
	@GetMapping(value = "/{id}")
	public Pet findByid(@PathVariable Integer id){
		return service.findById(id);
	}

	@PostMapping()
	@ResponseStatus(HttpStatus.CREATED)
	public Pet savePet(@RequestBody  Pet pet){
	return service.createPet(pet);
	}
	@PutMapping(value =  "/{id}")
	public Pet updatedPet(@PathVariable Integer id, @RequestBody Pet pet){
		Pet updatedPet = service.findById(id);
		updatedPet.setId(pet.getId());
		updatedPet.setName(pet.getName());
		updatedPet.setBirthDay(pet.getBirthDay());
		updatedPet.setPrice(pet.getPrice());

		return service.createPet(updatedPet);
	}
	@DeleteMapping(value = "/{id}")
	public void deletePet( @PathVariable Integer id){
		service.deletePet(id);
	}



}
