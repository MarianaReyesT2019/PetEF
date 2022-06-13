package com.progra3.petstore.REPOSITORI;

import com.progra3.petstore.entities.Pet;
import org.springframework.data.repository.CrudRepository;

public interface RepositoryPet extends CrudRepository<Pet, Integer>
{


}
