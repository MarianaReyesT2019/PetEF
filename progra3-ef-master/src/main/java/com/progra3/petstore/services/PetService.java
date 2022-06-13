package com.progra3.petstore.services;

import java.util.List;

import com.progra3.petstore.entities.Pet;

public interface PetService {
	
	List<Pet> listAll();
	Pet findById(Integer id);
	Pet createPet(Pet pet);
	Pet updatePet (Integer id, Pet pet);
	void deletePet(Integer id);


}
