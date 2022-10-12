package com.myshow.service;

import java.util.List;

import com.myshow.model.Movie;

/**
 * @author BhargavRajJinka
 *
 */
public interface IMyShowService {

	/**
	 * @param movie
	 */
	void addMovie(Movie movie);
	/**
	 * @param movieId
	 * @param language
	 * @return
	 */
	void updateMovie(Movie movie);
	/**
	 * @param movieId
	 * @return
	 */
	void deleteMovie(int movieId);
	
	/**
	 * @param genre
	 * @return
	 */
	List<Movie> getByGenre(String genre);
	
	/**
	 * @param genre
	 * @param language
	 * @return
	 */
	List<Movie> getByGenreAndLanguage(String genre,String language);
	/**
	 * @param language
	 * @return
	 */
	List<Movie> getByLanguage(String language);
	/**
	 * @param title
	 * @return
	 */
	List<Movie> getByTitleStartingWith(String title);
	/**
	 * @param rating
	 * @return
	 */
	List<Movie> getByRatingGreaterThanEqual(int rating);
	
	/**
	 * @param movieId
	 * @return
	 */
	Movie getById(int movieId);
	/**
	 * @return
	 */
	List<Movie> getAll();
	
}
