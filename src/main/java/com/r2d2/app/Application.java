package com.r2d2.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages={"com.r2d2.*"})
@EnableAutoConfiguration
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(Application.class, args);
//		try{
//		    FileInputStream fis = new FileInputStream("src/main/resources/wavs/13.mp3");
//		    Player playMP3 = new Player(fis);
//		    playMP3.play();
//		}
//		catch(Exception exc){
//		    exc.printStackTrace();
//		    System.out.println("Failed to play the file.");
//		}		
	}
}
