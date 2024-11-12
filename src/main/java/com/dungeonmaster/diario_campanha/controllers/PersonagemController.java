package com.dungeonmaster.diario_campanha.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dungeonmaster.diario_campanha.dto.PersonagemMinDTO;
import com.dungeonmaster.diario_campanha.entities.Personagem;
import com.dungeonmaster.diario_campanha.services.PersonagemService;

@RestController
@RequestMapping(value = "/personagens")
public class PersonagemController {

    @Autowired
    private PersonagemService personagemService;

    @GetMapping
    public List<PersonagemMinDTO> findAll() {
        List<PersonagemMinDTO> result = personagemService.findAll();
        return result;        
    }
}
