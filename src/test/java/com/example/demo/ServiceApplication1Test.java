package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("test1")
@DirtiesContext
@SpringBootTest
class ServiceApplication1Test {

    @Test
    void contextLoads() {
    }

}
