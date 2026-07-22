package com.sunitech.learningdeployment01.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(EmployeeController.class)
class EmployeeControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void shouldReturnEmployeeDetails() throws Exception {

        mockMvc.perform(get("/employees/employee"))
                .andExpect(status().isOk())
                .andExpect(content().string("Fetching all the employee details.."));
    }

    @Test
    void shouldCreateEmployeeSuccessfully() throws Exception {

        mockMvc.perform(post("/employees/create"))
                .andExpect(status().isOk())
                .andExpect(content().string("Employee created successfully"));
    }
}