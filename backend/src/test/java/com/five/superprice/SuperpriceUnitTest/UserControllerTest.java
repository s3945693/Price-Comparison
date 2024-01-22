package com.five.superprice.SuperpriceUnitTest;

import org.springframework.boot.test.context.SpringBootTest;
import com.five.superprice.entity.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;
import com.five.superprice.controller.UserController;
import com.five.superprice.services.UserService;

@SpringBootTest
public class UserControllerTest {
    
    UserService service;
    UserController controller;

    @BeforeEach
    void setUp() {
        this.service = mock(UserService.class);
        controller = new UserController(this.service);
    }

    @Test
    void shouldReturnNoUser(){
        when(this.service.getUser(1L)).thenReturn(null);
        assertNull(this.controller.getUser(1L));
    }

    @Test
    void shouldReturnUser(){
        User user = new User();
        when(this.service.getUser(1L)).thenReturn(user);
        assertNotNull(this.controller.getUser(1L));
    }

    @Test
    void deleteUser(){
        doNothing().when(this.service).deleteUser(1L);
        this.controller.deleteUser(1L);
        verify(this.service, times(1)).deleteUser(1L);
    }

    @Test
    void validUserLogin(){
        User user = new User();
        when(this.service.checkUsernameAndPassword("username", "password")).thenReturn(user);
        assertNotNull(this.controller.checkUserCredentials("username", "password"));
    }

    @Test
    void invalidUserLogin(){
        when(this.service.checkUsernameAndPassword("username", "password")).thenReturn(null);
        assertNull(this.controller.checkUserCredentials("username", "password"));
    }   

    @Test
    void createUser() {
        User user = new User();
        when(this.service.saveUser(user)).thenReturn(user);
        this.controller.addUser(user);
        verify(this.service, times(1)).saveUser(user);
    }

    @Test
    void getNotifications() {
        List<Notifications> notifications = new ArrayList<>();
        when(this.service.getNotifications("1")).thenReturn(notifications);
        assertNotNull(this.controller.getNotifications("1"));
    }

    

}
