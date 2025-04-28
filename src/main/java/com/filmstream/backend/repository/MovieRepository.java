package com.filmstream.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.filmstream.backend.model.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {
	// aucune méthode à écrire, tout est auto-géré 🎉
}
