package com.consulting.mgt.springboot.practica23.ribbon.agemicroservice.client;

import java.net.URI;
import java.util.Map;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;


@Slf4j
@Profile(value = { "load-balanced-rest-template" })
@Component
public class RibbonApiRandomServiceClient implements IRandomService{

	@Autowired
	private Random random;
	
	@Autowired
	private RestTemplate loadBalancedRestTemplate;

	
	@Value("${random-service-name:random-microservice}")
	private String serviceName;
	
	
	

	@Override
	@SneakyThrows
	public int getRandomValue() {

		log.info("[local implementation] generating random value from");
		
		URI uri = new URI(String.format("http://"+ serviceName +"/random-service/next"));
		
		log.info("Obteniendo numero aleatorio");
		
		Map<String, Object> mapResponse = loadBalancedRestTemplate.getForObject(uri, Map.class);
		log.info("[Api ribbon]{} response: {}", serviceName, mapResponse);

		return (int) mapResponse.get("random");
	}

}
