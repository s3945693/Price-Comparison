package com.five.superprice.controller;
import com.five.superprice.entity.Notifications;
import com.five.superprice.entity.User;
import com.five.superprice.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.CrossOrigin;
import java.util.List;
//for routing requests, and for mapping requests to methods, need to implement more as needed
@RestController
@RequestMapping ("/usr")
@CrossOrigin(origins = "http://localhost:3000")
public class UserController {

    UserService service;

    @Autowired
    public UserController(UserService service) {
        this.service = service;
    }

    @GetMapping("/users")
    public List<User> getAllUsers(){
        return service.getAllUsers();
    }

    @GetMapping("/user/{id}")
    public User getUser(@PathVariable("id") Long id){
        return service.getUser(id);
    }

    @PostMapping("/user")
    public User addUser(@RequestBody User user){
        return service.saveUser(user);
    }

    @DeleteMapping("/user/{id}")
    public void deleteUser(@PathVariable("id") Long id){
        service.deleteUser(id);
    }

    @GetMapping("/login/username")
    public User checkUserCredentials(
            @RequestParam("username") String username,
            @RequestParam("password") String password
    ){
        return service.checkUsernameAndPassword(username, password);
    }

    @GetMapping("/notification/get/{id}")
    public List<Notifications> getNotifications(
            @PathVariable("id") String id
    ){
        return service.getNotifications(id);
    }

    @PostMapping("/notification/set")
    public void setNotifications(
            @RequestParam("userId") String userId,
            @RequestParam("productId") String productId,
            @RequestParam("price") Double price
    ){
        service.setNotifications(userId, productId, price);
    }

    @GetMapping("/change/password")
    public User changePassword(
            @RequestParam("username") String username,
            @RequestParam("password") String password
    ){
        User user = service.checkEmail(username);
        if (user == null) {
            return null;
        }
        user.setPassword(password);
        return service.saveUser(user);
    }


}
