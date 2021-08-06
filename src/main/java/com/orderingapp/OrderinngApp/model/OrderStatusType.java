package com.orderingapp.OrderinngApp.model;

public enum OrderStatusType {
	
	PLACED("Placed"), PROCESSING("Processing"), DISPATCHED("Dsipatched"), DELIVERED("Delivered"), RETURNED("Rturned"), CANCELLED("Cancelled");

	private final String type;
	
	OrderStatusType(String type) {
		this.type = type;
	}

}
