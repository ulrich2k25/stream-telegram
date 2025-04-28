package com.filmstream.backend.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping; // ➡️ Import ajouté
import org.springframework.web.bind.annotation.RequestBody; // ➡️ Import ajouté
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.filmstream.backend.model.Movie;
import com.filmstream.backend.repository.MovieRepository;

@RestController
@RequestMapping("/api/movies")
@CrossOrigin(origins = "*") // autorise les appels depuis Angular
public class MovieController {

	private final MovieRepository movieRepository;

	public MovieController(MovieRepository movieRepository) {
		this.movieRepository = movieRepository;
	}

	@GetMapping
	public List<Movie> getAllMovies() {
		return movieRepository.findAll();
	}

	// ✅ Nouvelle méthode pour ajouter un film depuis le frontend
	@PostMapping
	public Movie addMovie(@RequestBody Movie movie) {
		return movieRepository.save(movie);
	}
}
