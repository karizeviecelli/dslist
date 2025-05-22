
package com.ProjetoSpring.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ProjetoSpring.demo.dto.GameMinDTO;
import com.ProjetoSpring.demo.entitys.Game;
import com.ProjetoSpring.demo.repositories.GameRepository;
import com.ProjetoSpring.demo.dto.*;


@Service
public class GameService {
	@Autowired
	private GameRepository gameRepository;
		
	public List<GameMinDTO> findAll(){
		List<Game> result = gameRepository.findAll();
		List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
		return dto;
	}

}
