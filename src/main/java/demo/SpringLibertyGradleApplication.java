package demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringLibertyGradleApplication {

	public static void main(String[] args) {
		System.out.println("Arguments array = " + java.util.Arrays.toString(args));
		SpringApplication.run(SpringLibertyGradleApplication.class, args);
	}

}
