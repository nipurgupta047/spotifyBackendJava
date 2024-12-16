package com.spotifyClone.spotifyBackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpotifyBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpotifyBackendApplication.class, args);
		System.out.println("server started");
	}

}
