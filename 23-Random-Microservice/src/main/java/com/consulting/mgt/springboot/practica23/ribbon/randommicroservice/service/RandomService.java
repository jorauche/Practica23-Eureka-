package com.consulting.mgt.springboot.practica23.ribbon.randommicroservice.service;

import java.util.Random;

import org.hibernate.validator.constraints.Range;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class RandomService {
	@Autowired
	private Random random;

	public int next() {
		log.info(" Se genera el random ");
		return random.nextInt(40);

	}

}
