package com.company.controller;

import com.company.model.User;
import com.company.service.UserService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import java.util.ArrayList;
import java.util.List;

import static org.springframework.http.RequestEntity.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest
class UserControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private UserService userService;

    // Not Implemented
//    @Test
//    void addUser() throws Exception {
//        User user = new User();
//        user.setUserName("John");
//        List<String> buildingIds = new ArrayList<>();
//        buildingIds.add("1234");
//        buildingIds.add("5678");
//        user.setBuildingIds(buildingIds);
//
//        ObjectMapper objectMapper = new ObjectMapper();
//        String json = objectMapper.writeValueAsString(user);
//        String uri = "/api/user";
//
//        this.mockMvc.perform(post(uri).andExpect(status().isOk()));
//
//    }
}