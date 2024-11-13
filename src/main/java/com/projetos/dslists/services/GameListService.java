package com.projetos.dslists.services;

import com.projetos.dslists.dto.GameDTO;
import com.projetos.dslists.dto.GameListDTO;
import com.projetos.dslists.dto.GameMinDTO;
import com.projetos.dslists.entities.Game;
import com.projetos.dslists.entities.GameList;
import com.projetos.dslists.repositories.GameListRepository;
import com.projetos.dslists.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll(){
        List<GameList> result = gameListRepository.findAll();
        return result.stream().map(x -> new GameListDTO(x)).toList();
    }
}
