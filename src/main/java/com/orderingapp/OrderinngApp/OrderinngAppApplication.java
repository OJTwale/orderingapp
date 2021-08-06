package com.orderingapp.OrderinngApp;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

@SpringBootApplication
public class OrderinngAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderinngAppApplication.class, args);
	}
 
//			{
//			    "orderNumber": "AZ102",
//			    "orderDate":"2019-04-28T14:45:15",
//			    "orderCost":"653.57",
//			    "customerName":"Sachin",
//			    "customerAddress":"Bhopal"
//			}
	
}
