package com.orderingapp.OrderinngApp.model;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class CustomerOrder {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "order_generator")
    private int id;
    
    @Column
    private String orderNumber;
    
    @Column
    private Date orderDate;
    
    @Column
    private Double orderCost;
    
    @Column
    private String customerName;
    
    @Column
    private String customerAddress;
    
    @Column
    private Integer orderStatus;
    
    @ManyToMany
    @JoinTable(name = "customer_products", joinColumns = @JoinColumn(name="customerOrder_id"), inverseJoinColumns = @JoinColumn(name = "product_id"))
    private Set<Product> orderedProducts;
    
    public CustomerOrder() {}
    
    public CustomerOrder(int id, String orderNumber, Date orderDate, Double orderCost,String customerName,
            String customerAddress, Integer orderStatus, Set<Product> oProducts) {
        super();
        this.id = id;
        this.orderNumber = orderNumber;
        this.orderDate = orderDate;
        this.orderCost = orderCost;
        this.customerName = customerName;
        this.customerAddress = customerAddress;
        this.orderStatus = orderStatus;
        this.orderedProducts = oProducts;
    }
    public int getId() {
        return id;
    }
        
    public void setId(int id) {
        this.id = id;
    }   
    public String getOrderNumber() {
        return orderNumber;
    }
    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }
    public Date getOrderDate() {
        return orderDate;
    }
    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }
    public Double getOrderCost() {
        return orderCost;
    }
    public void setOrderCost(Double orderCost) {
        this.orderCost = orderCost;
    }
    public String getCustomerName() {
        return customerName;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public String getCustomerAddress() {
        return customerAddress;
    }
    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }
    public Integer getOrderStatus() {
        return orderStatus;
    }
    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

	public Set<Product> getOrderedProducts() {
		return orderedProducts;
	}

	public void setOrderedProducts(Set<Product> orderedProducts) {
		this.orderedProducts = orderedProducts;
	}   
    
    
    
}