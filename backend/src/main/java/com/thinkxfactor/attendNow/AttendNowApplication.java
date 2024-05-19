package com.thinkxfactor.attendNow;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
public class AttendNowApplication {

	public static void main(String[] args) {
		SpringApplication.run(AttendNowApplication.class, args);
	}

}

// Hello World API

@RestController
@RequestMapping("/api")
class TestController {

	@GetMapping("/hello")
	public String hello() {
		System.out.println("Welcome to Hello World API");
		return "Hello, World from controllers!!";
	}

	@GetMapping("/test")
	public String test() {
		return "Hello from test method!!";
	}

	public String login(String username, String password) {
		// Logic for login
		return "Login Successful";
		// return "Login Failed";
	}
}
