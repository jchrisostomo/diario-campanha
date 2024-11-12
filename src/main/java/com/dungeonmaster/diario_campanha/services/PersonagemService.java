package com.dungeonmaster.diario_campanha.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dungeonmaster.diario_campanha.dto.PersonagemMinDTO;
import com.dungeonmaster.diario_campanha.entities.Personagem;
import com.dungeonmaster.diario_campanha.repositories.PersonagemRepository;

@Service
public class PersonagemService {
    
    @Autowired
    private PersonagemRepository personagemRepository;

    public List<PersonagemMinDTO> findAll() {
        List<Personagem> result = personagemRepository.findAll();
        List<PersonagemMinDTO> dto = result.stream().map(x -> new PersonagemMinDTO(x)).toList();
        return dto;
    }

}
