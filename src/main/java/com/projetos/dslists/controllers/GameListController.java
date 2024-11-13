package com.projetos.dslists.controllers;

import com.projetos.dslists.dto.GameDTO;
import com.projetos.dslists.dto.GameListDTO;
import com.projetos.dslists.dto.GameMinDTO;
import com.projetos.dslists.services.GameListService;
import com.projetos.dslists.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {

    @Autowired
    private GameListService gameListService;

    @GetMapping
    public List<GameListDTO> findAll() {
        List<GameListDTO> result = gameListService.findAll();
        return result;
    }
}
