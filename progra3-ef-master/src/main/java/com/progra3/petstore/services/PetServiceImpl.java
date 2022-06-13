package com.progra3.petstore.services;


import com.progra3.petstore.REPOSITORI.RepositoryPet;
import com.progra3.petstore.entities.Pet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PetServiceImpl implements PetService{

@Autowired
private RepositoryPet respositorypet;

    @Override
    public List<Pet> listAll() {
        return (List<Pet>) respositorypet.findAll();
    }

    @Override
    public Pet findById(Integer id) {
        return respositorypet.findById(id).orElse(null);
    }

    @Override
    public Pet createPet(Pet pet) {
        return respositorypet.save(pet);
    }

    @Override
    public Pet updatePet(Integer id, Pet pet) {
        Pet petUpdate=respositorypet.findById(id).orElse(null);
                petUpdate.setId(pet.getId());
                petUpdate.setName(pet.getName());
                petUpdate.setBirthDay(pet.getBirthDay());
                petUpdate.setPrice(pet.getPrice());
        return respositorypet.save(petUpdate);
    }

    @Override
    public void deletePet(Integer id) {
        respositorypet.deleteById(id);

    }
}
