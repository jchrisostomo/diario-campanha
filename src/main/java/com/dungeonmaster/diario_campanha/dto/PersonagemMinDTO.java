package com.dungeonmaster.diario_campanha.dto;

import com.dungeonmaster.diario_campanha.entities.Personagem;

public class PersonagemMinDTO {
    private Long id;
    private String characterName;
    private String characterSpecie;
    private String characterClass;
    private String characterimgUrl;
    private String characterDescription;

    public PersonagemMinDTO() {

    }

    public PersonagemMinDTO(Personagem entity) {
        id = id;
        characterName = entity.getCharacterName();
        characterSpecie = entity.getCharacterSpecie();
        characterClass = entity.getCharacterClass();
        characterimgUrl = entity.getCharacterimgUrl();
        characterDescription = entity.getCharacterDescription();
    }

    public Long getId() {
        return id;
    }

    public String getCharacterName() {
        return characterName;
    }

    public String getCharacterSpecie() {
        return characterSpecie;
    }

    public String getCharacterClass() {
        return characterClass;
    }

    public String getCharacterimgUrl() {
        return characterimgUrl;
    }

    public String getCharacterDescription() {
        return characterDescription;
    }

    
}
