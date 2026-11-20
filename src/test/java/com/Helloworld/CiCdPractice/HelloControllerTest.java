package com.Helloworld.CiCdPractice;

import org.junit.jupiter.api.Test;                                              // JUnit 5
import org.springframework.beans.factory.annotation.Autowired;                  // @Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;      // @WebMvcTest
import org.springframework.test.web.servlet.MockMvc;                            // MockMvc

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(HelloController.class)
public class HelloControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @Test
    void helloReturnsHelloWorld() throws Exception {
        mockMvc.perform(get("/"))
                .andExpect(status().isOk())
                .andExpect(content().string("Hello sanchip!"));
    }
}
