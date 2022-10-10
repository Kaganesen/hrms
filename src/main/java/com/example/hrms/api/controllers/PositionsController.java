package com.example.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hrms.business.abstracts.PositionsService;
import com.example.hrms.entities.concretes.Position;

@RestController
@RequestMapping("/api/positions")

public class PositionsController {


	private PositionsService positionsService;

	@Autowired
	public PositionsController(PositionsService positionsService) {
		super();
		this.positionsService = positionsService;
	}

	@GetMapping("/getall")

	public List<Position> getAll() {
		return (List<Position>) this.positionsService.getAll();

	}

	@PostMapping("/add")

	public void add(Position position) {

		this.positionsService.add(position);

	}

}
