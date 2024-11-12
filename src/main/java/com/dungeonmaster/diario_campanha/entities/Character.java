package com.dungeonmaster.diario_campanha.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbl_character")
public class Character {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String characterName;
    private String characterSpecie;
    private String characterClass;
    private Integer characterLevel;
    private String characterimgUrl;

    @Column(columnDefinition = "TEXT")
    private String characterDescription;

    public Character() {       
    }

    public Character(Long id, String characterName, String characterSpecie, String characterClass,
            Integer characterLevel, String characterimgUrl, String characterDescription) {
        this.id = id;
        this.characterName = characterName;
        this.characterSpecie = characterSpecie;
        this.characterClass = characterClass;
        this.characterLevel = characterLevel;
        this.characterimgUrl = characterimgUrl;
        this.characterDescription = characterDescription;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }

    public String getCharacterSpecie() {
        return characterSpecie;
    }

    public void setCharacterSpecie(String characterSpecie) {
        this.characterSpecie = characterSpecie;
    }

    public String getCharacterClass() {
        return characterClass;
    }

    public void setCharacterClass(String characterClass) {
        this.characterClass = characterClass;
    }

    public Integer getCharacterLevel() {
        return characterLevel;
    }

    public void setCharacterLevel(Integer characterLevel) {
        this.characterLevel = characterLevel;
    }

    public String getCharacterimgUrl() {
        return characterimgUrl;
    }

    public void setCharacterimgUrl(String characterimgUrl) {
        this.characterimgUrl = characterimgUrl;
    }

    public String getCharacterDescription() {
        return characterDescription;
    }

    public void setCharacterDescription(String characterDescription) {
        this.characterDescription = characterDescription;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Character other = (Character) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }

    
}
