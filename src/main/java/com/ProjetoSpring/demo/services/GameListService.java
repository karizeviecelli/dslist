
package com.ProjetoSpring.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ProjetoSpring.demo.dto.GameDTO;
import com.ProjetoSpring.demo.dto.GameListDTO;
import com.ProjetoSpring.demo.dto.GameMinDTO;
import com.ProjetoSpring.demo.entitys.Game;
import com.ProjetoSpring.demo.entitys.GameList;
import com.ProjetoSpring.demo.repositories.GameListRepository;
import com.ProjetoSpring.demo.repositories.GameRepository;

import org.springframework.transaction.annotation.Transactional;


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
