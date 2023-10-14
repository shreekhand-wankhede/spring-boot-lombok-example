package com.example.springbootlombokexample;

import com.example.models.Employee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootLombokExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootLombokExampleApplication.class, args);

		Employee employee = new Employee();
		employee.setFirstName("Sachin");
		employee.setLastName("Tendulkar");
		employee.setRollNo(1);

		System.out.println(employee);

	}

}
