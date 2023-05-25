package com.example.student_jpa_mapping;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentJpaMappingApplication {
	@Autowired
	StudentEntity student;
	@Autowired
	Laptop laptop;

	@Autowired
	Address address;


	public static void main(String[] args) {
		SpringApplication.run(StudentJpaMappingApplication.class, args);
	}

	public void run(String... args) throws Exception
	{
		StudentEntity studentEntity = new StudentEntity(101,"mayank");
		ob.save(student);
		Address address = new Address(1, "Sonipat", student);
		ob1.save(address);
	}

}
