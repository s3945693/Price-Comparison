package com.five.superprice.services;
import com.five.superprice.entity.Notifications;
import com.five.superprice.entity.Order;
import com.five.superprice.entity.Products;
import com.five.superprice.entity.User;
import com.five.superprice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.five.superprice.repository.NotificationRepository;
import com.five.superprice.repository.OrderRepository;

import java.util.List;
import java.util.Optional;

//service class, this is where we create the methods that will be used in the controller
@Service
public class UserService {

     //ignore the red squiggly line
    UserRepository userRepository;
    NotificationRepository notificationRepository;
    OrderRepository orderRepository;
    ProductService ProductService;
    
    @Autowired
    public UserService(UserRepository userRepository, NotificationRepository notificationRepository, OrderRepository orderRepository, ProductService ProductService) {
        this.userRepository = userRepository;
        this.notificationRepository = notificationRepository;
        this.orderRepository = orderRepository;
        this.ProductService = ProductService;
    }
    public User getUser(Long id){

        return userRepository.findById(id).orElseThrow();
    }

    public List<User> getAllUsers(){
        return (List<User>) userRepository.findAll();
    }

    public User saveUser(User user){
        return userRepository.save(user);
    }

    public void deleteUser(Long id){
        userRepository.deleteById(id);
    }

    public User checkUsernameAndPassword(String email, String password) {
        Optional<User> userOptional = userRepository.findUserByUsernameAndPassword(email, password);
        return userOptional.orElse(null);
    }

    public User checkEmail(String email) {
        Optional<User> userOptional = userRepository.findUserByEmail(email);
        return userOptional.orElse(null);
    }

    public List<Notifications> getNotifications(String userId) {
        return notificationRepository.findNotificationsByUserId(userId);
    }

    public void setNotifications(String userId, String productId,Double price) {
        User user = getUser(Long.parseLong(userId));
        Products product = ProductService.getProduct(Long.parseLong(productId));
        
        Notifications notification = new Notifications();
        notification.setPrice(price);
        notification.setProduct(product);
        notification.setUser(user);
        notificationRepository.save(notification);
    }

}

