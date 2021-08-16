package com.orderingapp.OrderinngApp;
import com.orderingapp.OrderinngApp.model.OrderStatus;
import com.orderingapp.OrderinngApp.model.OrderStatusType;
import com.orderingapp.OrderinngApp.service.OrderStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
public class OrderinngAppApplication implements CommandLineRunner {
    @Autowired
    private final OrderStatusService orderStatusService;
    public OrderinngAppApplication(OrderStatusService orderStatusService) {
        this.orderStatusService = orderStatusService;
    }
    public static void main(String[] args) {
        SpringApplication.run(OrderinngAppApplication.class, args);
    }
    @Override
    public void run(String... args) throws Exception {
        int i = 1;
        for (OrderStatusType type : OrderStatusType.values()) {
            orderStatusService.create(new OrderStatus(i++, type));
            System.out.println(type);
        }
    }
//          {
//              "orderNumber": "AZ102",
//              "orderDate":"2019-04-28T14:45:15",
//              "orderCost":"653.57",
//              "customerName":"Sachin",
//              "customerAddress":"Bhopal"
//          }
}