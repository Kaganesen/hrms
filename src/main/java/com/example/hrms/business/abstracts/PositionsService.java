package com.example.hrms.business.abstracts;

import java.util.List;

import com.example.hrms.core.utilities.results.DataResult;
import com.example.hrms.entities.concretes.Position;

public interface PositionsService {
	
	DataResult<List<Position>> getAll();
	
	void add(Position position);
	

}
