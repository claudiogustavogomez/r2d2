package com.r2d2.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
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
