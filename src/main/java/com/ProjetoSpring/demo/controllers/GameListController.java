package com.ProjetoSpring.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ProjetoSpring.demo.services.GameListService;
import com.ProjetoSpring.demo.services.GameService;
import com.ProjetoSpring.demo.dto.GameDTO;
import com.ProjetoSpring.demo.dto.GameListDTO;
import com.ProjetoSpring.demo.dto.GameMinDTO;
import com.ProjetoSpring.demo.entitys.Game;

@RestController
@RequestMapping(value = "/lists" )
public class GameListController {

    
	@Autowired
	private GameListService gameListService;

@Autowired
private GameService gameService;
  
	

	@GetMapping
	public List<GameListDTO> findAll(){
		List<GameListDTO> result = gameListService.findAll();
		return result;
	}
	
	@GetMapping(value = "/{listId}/games")
	public List<GameMinDTO> findByList(@PathVariable long listId){
	List<GameMinDTO> result = gameService.findByList(listId);
	return result;
		
	}
}
