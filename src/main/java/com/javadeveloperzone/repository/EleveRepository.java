package com.javadeveloperzone.repository;

import com.javadeveloperzone.model.Eleve;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

public interface EleveRepository extends ElasticsearchRepository<Eleve,String>{
Eleve findByidEleve(String idEleve);
List<Eleve> findAll();
}
