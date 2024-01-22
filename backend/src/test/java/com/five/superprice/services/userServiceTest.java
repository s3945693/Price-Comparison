package com.five.superprice.services;
import static org.hamcrest.core.Is.is;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.doNothing;
import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import java.util.ArrayList;
import java.util.List;

import com.five.superprice.SuperPriceApplication;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.five.superprice.entity.User;

@ExtendWith(SpringExtension.class)

@SpringBootTest(classes = SuperPriceApplication.class)
@AutoConfigureMockMvc
public class userServiceTest {
    @Autowired
    private MockMvc mockMvc;
    @MockBean
    private UserService service;
    @Test
    public void testGetAllUsers() throws Exception {
        User user = new User();
        user.setId(1);
        user.setFirstname("name");
        user.setEmail("email");
        user.setPassword("password");
        user.setLastname("Amazing");


        List<User> userList = new ArrayList<>();
        userList.add(user);
        given(service.getAllUsers()).willReturn(userList);
        mockMvc.perform(get("/usr/users").contentType(APPLICATION_JSON)).andExpect(status().isOk())
                .andExpectAll(
                        jsonPath("$[0].id", is(1)),
                        jsonPath("$[0].firstname", is(user.getFirstname())),
                        jsonPath("$[0].email", is(user.getEmail())),
                        jsonPath("$[0].password", is(user.getPassword())),
                        jsonPath("$[0].lastname", is(user.getLastname()))
                );
    }

}
