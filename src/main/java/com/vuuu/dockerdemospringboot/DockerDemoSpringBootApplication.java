package com.vuuu.dockerdemospringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@RestController
@SpringBootApplication
public class DockerDemoSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(DockerDemoSpringBootApplication.class, args);
	}

	@RequestMapping("")
    public String hello(){
        return "Hello! Docker!";
    }
}
