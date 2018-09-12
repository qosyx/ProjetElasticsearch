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

@RestController("EleveController")
@RequestMapping("/eleves")
@CrossOrigin(origins = "*")
public class EleveController {
    @Autowired
    private EleveService eleveService;
    @Autowired
    HttpServletRequest request;


    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Eleve> createAccountws(@RequestBody Eleve eleve) throws SQLException {
        Eleve result = eleveService.create(eleve);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }
}
