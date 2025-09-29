package kr.co.sboard.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class EmailServiceTest {


    @Autowired
    EmailService emailService;

    @Test
    void sendCode() {


        emailService.sendCode("qq923359@gmail.com");




    }
}