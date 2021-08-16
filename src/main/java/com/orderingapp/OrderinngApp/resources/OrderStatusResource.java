package com.orderingapp.OrderinngApp.resources;

import com.orderingapp.OrderinngApp.model.OrderStatus;
import com.orderingapp.OrderinngApp.service.OrderStatusService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/orders")
public class OrderStatusResource {
    @Autowired
    private final OrderStatusService orderStatusService;

    public OrderStatusResource(OrderStatusService orderStatusService) {
        this.orderStatusService = orderStatusService;
    }

    @GetMapping("/status/{id}")
    public ResponseEntity<OrderStatus> getStatus(@PathVariable Integer id){
        return new ResponseEntity<>(orderStatusService.get(id),HttpStatus.OK);
    }
     
    @GetMapping("/status/all")
    public ResponseEntity<List<OrderStatus>> getStatus(){
        return new ResponseEntity<>(orderStatusService.getAll(),HttpStatus.OK);
    }

}
