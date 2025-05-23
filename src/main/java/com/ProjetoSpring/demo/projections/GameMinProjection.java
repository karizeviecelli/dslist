package com.ProjetoSpring.demo.projections;

import jakarta.persistence.Column;

public interface GameMinProjection {
	
	 long getId();
	 String getTitle();
	 Integer getYear();	
	 String getImgUrl();
	 String getShortDescription();	
	 Integer getPosition();

}
