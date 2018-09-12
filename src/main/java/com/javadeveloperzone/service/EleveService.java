package com.javadeveloperzone.service;

import com.javadeveloperzone.model.Eleve;
import com.javadeveloperzone.repository.EleveRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EleveService  {
    @Autowired
    private EleveRepository eleveRepository;

    public Eleve create(Eleve eleve){
        return eleveRepository.save(eleve);
    }

    public Eleve update(Eleve eleve){

        return eleveRepository.save(eleve);
    }

    public Eleve getOne(String id){
        return eleveRepository.findByidEleve(id);
    }

    public List<Eleve> getAll(){
        return eleveRepository.findAll();
    }

    public boolean delete(String id){
         eleveRepository.deleteById(id);
         return true;
    }
}
