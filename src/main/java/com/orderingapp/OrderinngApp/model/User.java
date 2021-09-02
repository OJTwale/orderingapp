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
    
    @Column
    private String question1;
    
    @Column
    private String answer1;
    
    @Column
    private String question2;
    
    @Column
    private String answer2;
    
    @Column
    private boolean isBlocked;
    
    
    public User() {}
    

 

    public User(int id, String username, String password, boolean isAdmin, String question1, String answer1, String question2, String answer2, boolean isBlocked) {
        super();
        this.id = id;
        this.userName = username;
        this.password = password;
        this.isAdmin = isAdmin;
        this.question1= question1;
        this.answer1=answer1;
        this.question2=question2;
        this.isBlocked = isBlocked;
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




	public String getQuestion1() {
		return question1;
	}




	public void setQuestion1(String question1) {
		this.question1 = question1;
	}




	public String getAnswer1() {
		return answer1;
	}




	public void setAnswer1(String answer1) {
		this.answer1 = answer1;
	}




	public String getQuestion2() {
		return question2;
	}




	public void setQuestion2(String question2) {
		this.question2 = question2;
	}




	public String getAnswer2() {
		return answer2;
	}




	public void setAnswer2(String answer2) {
		this.answer2 = answer2;
	}




	public boolean isBlocked() {
		return isBlocked;
	}




	public void setBlocked(boolean isBlocked) {
		this.isBlocked = isBlocked;
	}

}