package com.myshow.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.myshow.model.Movie;

/**
 * @author BhargavRajJinka
 *
 */
@Repository
public interface IMyShowRepository extends JpaRepository<Movie,Integer>{
	
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
	
}
