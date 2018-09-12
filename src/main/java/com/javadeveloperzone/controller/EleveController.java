package com.javadeveloperzone.controller;

import com.javadeveloperzone.model.Document;
import com.javadeveloperzone.model.Eleve;
import com.javadeveloperzone.service.EleveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.sql.SQLException;
import java.util.List;

@RestController("EleveController")
@RequestMapping("/eleves")
@CrossOrigin(origins = "*")
public class EleveController {
    @Autowired
    private EleveService eleveService;
    @Autowired
    HttpServletRequest request;


    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Eleve> createEleve(@RequestBody Eleve eleve) throws SQLException {
        Eleve result = eleveService.create(eleve);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<Eleve>> getAll() throws SQLException {
        List<Eleve> result = eleveService.getAll();
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public ResponseEntity<Eleve> getOne(@PathVariable String id) throws SQLException {
        Eleve result = eleveService.getOne(id);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }


    @RequestMapping(method = RequestMethod.PUT)
    public ResponseEntity<Eleve> updateEleve(Eleve eleve) throws SQLException {
        Eleve result = eleveService.update(eleve);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }


    @RequestMapping(method = RequestMethod.DELETE,value = "/{id}")
    public ResponseEntity<Boolean> deleteEleve(@PathVariable String id) throws SQLException {
        boolean result;
        result = eleveService.delete(id);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

}
