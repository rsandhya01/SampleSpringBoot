package com.org.SampleSpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.*;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class App {
	public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
		 SpringApplication app = new SpringApplication(App.class);
		 app.setDefaultProperties(Collections
          .singletonMap("server.port", "8583"));
        app.run(args);
        //SpringApplication.run(App.class, args);
    }
}
