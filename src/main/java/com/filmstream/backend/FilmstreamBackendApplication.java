package com.filmstream.backend;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.filmstream.backend.model.Movie;
import com.filmstream.backend.repository.MovieRepository;

@SpringBootApplication
public class FilmstreamBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(FilmstreamBackendApplication.class, args);
	}

	@Bean
	public CommandLineRunner initDatabase(MovieRepository movieRepository) {
		return args -> {

			movieRepository.save(new Movie("The Crow 2024", "https://i.imgur.com/ylrSu2Y.jpeg", // image hébergée
					"https://t.me/c/1627510800/655" // lien direct vers le post Telegram

			));
			movieRepository.save(new Movie("The Infernal Machine", "https://i.imgur.com/EfIWwGO.jpeg",
					"https://t.me/c/1627510800/653"));

			movieRepository.save(new Movie("Chasse à l'homme 2", "https://i.imgur.com/8c24k06.jpeg",
					"https://t.me/c/1806452277/14711"));

		};
	}

}
