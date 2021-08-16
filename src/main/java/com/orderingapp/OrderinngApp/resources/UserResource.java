package com.orderingapp.OrderinngApp.resources;

 

import java.util.List;

 

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.orderingapp.OrderinngApp.model.User;
import com.orderingapp.OrderinngApp.service.UserService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/users")
public class UserResource {
    
    private final UserService userService;
    
    public UserResource(UserService userService) {
        super();
        this.userService = userService;
    }
    
    @GetMapping("/all")
    public ResponseEntity<List<User>> listAllUsers(){
        List<User> user = userService.listAllUsers();
        return new ResponseEntity<List<User>>(user, HttpStatus.OK);
    }
    
    @PostMapping("/addUser")
    public ResponseEntity<User> addUser(@RequestBody User user){
        User users = userService.createUser(user);
        return new ResponseEntity<>(users, HttpStatus.CREATED);
        
    }
    
    @PostMapping("/login")
    public boolean verifyUser(@RequestBody User user)
    {
        System.out.println(user.getUserName() +" , "+ user.getPassword());
        return userService.verifyUser(user.getUserName() , user.getPassword());
    }
    
    @GetMapping("/login/{userName}")
    public ResponseEntity<User> findUser(@PathVariable String userName){
    	User user = userService.findUser(userName);
    	return new ResponseEntity<User>(user, HttpStatus.OK);
    }
}