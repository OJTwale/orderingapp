package com.orderingapp.OrderinngApp.model;

 


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

 

@Entity
@Table(name = "appuser")
public class User {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_generator")
    private int id;
    
    @Column
    private String userName;
    
    @Column
    private String password;
    
    @Column
    private boolean isAdmin;
    
    
    public User() {}
    

 

    public User(int id, String username, String password, boolean isAdmin) {
        super();
        this.id = id;
        this.userName = username;
        this.password = password;
        this.isAdmin = isAdmin;
    }

 

    public int getId() {
        return id;
    }

 

    public void setId(int id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

 

    public void setPassword(String password) {
        this.password = password;
    }




	public String getUserName() {
		return userName;
	}




	public void setUserName(String userName) {
		this.userName = userName;
	}




	public boolean isAdmin() {
		return isAdmin;
	}




	public void setAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
	}
    
    
 

}