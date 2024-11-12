package com.projetos.dslists.repositories;

import com.projetos.dslists.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}
