package com.dungeonmaster.diario_campanha.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dungeonmaster.diario_campanha.entities.Personagem;

public interface PersonagemRepository extends JpaRepository<Personagem, Long> {

}
