package com.orderingapp.OrderinngApp.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.orderingapp.OrderinngApp.model.User;
import com.orderingapp.OrderinngApp.repo.UserRepo;

 
@Service
public class UserService {
		private final UserRepo userRepo;
        
        public UserService (UserRepo userRepo) {
            super();
            this.userRepo = userRepo;
        }

 

        public List<User> listAllUsers() {
            return userRepo.findAll();
        }

 

        public User createUser(User user) {
            return userRepo.save(user);
        }
        
        public boolean verifyUser(String uname, String pass)
        {
            User u=null;
            u=userRepo.findByUserName(uname).orElse(null);
            if(u!=null && u.getPassword().equals(pass))
            {
                return true;
            }
            else
            {
                return false;
            }
            
        }
        
        public User findUser(String userName) {
			return userRepo.findByUserName(userName).orElse(null);
        }
}