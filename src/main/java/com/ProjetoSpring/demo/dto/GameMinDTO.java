package com.ProjetoSpring.demo.dto;

import com.ProjetoSpring.demo.entitys.Game;
import com.ProjetoSpring.demo.projections.GameMinProjection;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;




public class GameMinDTO {

	
	private long id;
	private String title;
	private Integer year;	
	private String imgUrl;	
	private String shortDescription;
	
	
	public GameMinDTO() {
		
	}


	public GameMinDTO(Game entity) {
		
		id = entity.getId();
		title = entity.getTitle();
		year = entity.getYear();
		imgUrl = entity.getImgUrl();
		shortDescription = entity.getShortDescription();
	}

	public GameMinDTO(GameMinProjection projection
			) {
		
		id = projection.getId();
		title = projection.getTitle();
		year = projection.getGameYear();
		imgUrl = projection.getImgUrl();
		shortDescription = projection.getShortDescription();
	}


	public long getId() {
		return id;
	}


	public String getTitle() {
		return title;
	}


	public Integer getYear() {
		return year;
	}


	public String getImgUrl() {
		return imgUrl;
	}


	public String getShortDescription() {
		return shortDescription;
	}
	
	
	
	
	
}
