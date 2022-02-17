package com.example.restservice;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.*;

@RestController
public class GreetingController {

	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	@GetMapping("/greeting")
	public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
	}
	@GetMapping("/test")
	public String test (){
		return "Hello Students";

	}
	@GetMapping("/person")
	public Person getPerson(@RequestParam(value = "firstname") String firstname,
							@RequestParam(value = "lastname") String lastname){
		return new Person(firstname, lastname);
	}

	@PostMapping("/person")

	public String postPerson(@RequestBody Person person){
		System.out.println(person);
		return "Person is created";

	}

	@GetMapping("/soda")
	public Soda getSoda(@RequestParam(value = "brand") String brand,
							@RequestParam(value = "flavour") String flavour){
		return new Soda(brand, flavour);
	}
	@PostMapping("/soda")
	public String postSoda(@RequestBody Soda soda){
		System.out.println(soda);
		return "Enjoy your soda";
	}


}