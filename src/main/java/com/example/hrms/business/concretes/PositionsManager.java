package com.example.hrms.business.concretes;

import java.util.List;

import com.example.hrms.dataAccess.abstracts.PositionDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hrms.business.abstracts.PositionsService;
import com.example.hrms.entities.concretes.Position;

@Service

public class PositionsManager implements PositionsService{


	private final PositionDao positionDao;

	@Autowired
	public PositionsManager(PositionDao positionDao) {
		this.positionDao = positionDao;
	}


	@Override
	public List<Position> getAll() {
		
		return this.positionDao.findAll();
		
	}


	@Override
	public void add(Position position) {

		this.positionDao.save(position);
		
	}
	

}
