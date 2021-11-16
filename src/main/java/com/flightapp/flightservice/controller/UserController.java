package com.flightapp.flightservice.controller;

import com.flightapp.flightservice.model.User;
import com.flightapp.flightservice.repository.UserRepository;
import com.flightapp.flightservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/flight")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("users")
    List<User> getAllUsers(){
        return userService.findAll();
    }

    @PostMapping("user/Signup")
    User addUser(@RequestBody User user){
         return userService.save(user);
    }

    @PostMapping("admin/login")
    String  userAdminLogin(@RequestBody User data){
       Optional<User> userData = userService.findById(data.getEmail());
        if(userData.isPresent()){
            User user = userData.get();
            user.setAdmin(true);
            user.setPassword(data.getPassword());
            userService.save(user);
            return "Logged In Successfully";
        }
        return "Admin User is not registered with this email Id";
    }

    @PostMapping("userLogin/login")
    String  userLogin(@RequestBody User data){
        Optional<User> userData = userService.findById(data.getEmail());
        if(userData.isPresent()){
            User user = userData.get();
            user.setPassword(data.getPassword());
            userService.save(user);
            return "User Logged In Successfully";
        }
        return "User is not registered with this email Id";
    }


    @DeleteMapping("users/{id}")
    void deleteUsersByID(@PathVariable("id") Long id){
        userService.deleteById(id);
    }

}