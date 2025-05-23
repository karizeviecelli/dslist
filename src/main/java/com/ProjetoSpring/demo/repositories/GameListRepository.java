package com.ProjetoSpring.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ProjetoSpring.demo.entitys.GameList;



public interface GameListRepository extends JpaRepository<GameList, Long> {

}
