package com.example.hrms.business.abstracts;

import java.util.List;

import com.example.hrms.entities.concretes.Position;

public interface PositionsService {
	
	List <Position>getAll();
	
	void add(Position position);
	

}
