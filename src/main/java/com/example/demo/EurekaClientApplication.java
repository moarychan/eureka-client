package com.example.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@Slf4j
public class EurekaClientApplication {

    @RequestMapping("/")
    public String home() {
        StringBuilder result = new StringBuilder();
        if(log.isDebugEnabled()) {
            result.append("support debug -> ");
        }
        result.append("Hello world");
        return result.toString();
    }

	public static void main(String[] args) {
		SpringApplication.run(EurekaClientApplication.class, args);
	}

}
