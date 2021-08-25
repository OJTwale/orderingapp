package com.orderingapp.OrderinngApp.resources;

import java.util.List;
import java.util.Optional;

import javax.ws.rs.core.Response.Status;

import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.orderingapp.OrderinngApp.model.CustomerOrder;
import com.orderingapp.OrderinngApp.service.CustomerOrderService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/orders")
public class CustomerOrderResource {
	private final CustomerOrderService customerOrderService;
	
	
	public CustomerOrderResource(CustomerOrderService customerOrderService) {
		super();
		this.customerOrderService = customerOrderService;
		
	}
	
	@PostMapping("/createOrder")
	public ResponseEntity<CustomerOrder> createOrder(@RequestBody CustomerOrder customerOrder) {
		if(customerOrder.getOrderCost()==null || customerOrder.getCustomerName()==null || customerOrder.getCustomerAddress()==null) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}else {
	CustomerOrder customerOrders = customerOrderService.createOrder(customerOrder);
	return new ResponseEntity<>(customerOrders, HttpStatus.CREATED);
	}
		}
	
	@GetMapping("/all")
	public ResponseEntity<List<CustomerOrder>> listAllOrders(){
		
		List<CustomerOrder> customerOrder = customerOrderService.listAllOrders();
		return new ResponseEntity<List<CustomerOrder>>(customerOrder, HttpStatus.OK);
		
	}
	
	@GetMapping("/{id}")
    public ResponseEntity<CustomerOrder> getCustomerOrderById(@PathVariable(value = "id") Integer id){
        CustomerOrder customerOrder = customerOrderService.findById(id);
        return new ResponseEntity<CustomerOrder>(customerOrder, HttpStatus.OK);
    }
	
	@PutMapping("/update")
	public ResponseEntity<CustomerOrder> updateOrder(@RequestBody CustomerOrder customerOrder){
		CustomerOrder updateStatus = customerOrderService.updateOrder(customerOrder);
		return new ResponseEntity<CustomerOrder>(updateStatus,HttpStatus.OK);
	}
	
	@PutMapping("/update/{status}")
    public ResponseEntity<CustomerOrder> updateOrderStatus(@RequestBody CustomerOrder customerOrder, @PathVariable Integer status) {
        CustomerOrder updateStatus = customerOrderService.updateStatus(customerOrder, status);
        return new ResponseEntity<CustomerOrder>(updateStatus, HttpStatus.OK);
    }
	
	@DeleteMapping("/delete/{id}")
	public void deleteOrder(@PathVariable int id){
		 customerOrderService.deleteOrder(id);
	}
	 
	@GetMapping("/byuser/{orderedByUser}")
	public ResponseEntity<List<CustomerOrder>> getByOrderedUser(@PathVariable String orderedByUser){
		List<CustomerOrder> customerOrder = customerOrderService.findByOrderedUser(orderedByUser);
		return new ResponseEntity<>(customerOrder, HttpStatus.OK);
	}
}
