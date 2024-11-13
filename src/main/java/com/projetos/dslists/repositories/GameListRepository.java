package com.projetos.dslists.repositories;

import com.projetos.dslists.entities.Game;
import com.projetos.dslists.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {
}
