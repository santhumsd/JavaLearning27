package io.javabrainssrpingboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;







@SpringBootApplication

//@ComponentScan(basePackages = "io.javabrainssrpingboot")
public class CourseApiApplication {

	public static void main(String[] args) {
		System.out.println("enter into SpringBootApplication");
		SpringApplication.run(CourseApiApplication.class, args);
		System.out.println(" After SpringBootApplication run");
	}


}
