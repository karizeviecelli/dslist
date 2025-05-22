package com.ProjetoSpring.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ProjetoSpring.demo.entitys.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
