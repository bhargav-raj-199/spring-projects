package com.myshow.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myshow.model.Movie;
import com.myshow.repository.IMyShowRepository;

/**
 * @author BhargavRajJinka
 *
 */

@Service
public class MyShowServiceImpl implements IMyShowService {

	
	private IMyShowRepository myShowRepository;
	@Autowired
	public void setMyShowRepository(IMyShowRepository myShowRepository) {
		this.myShowRepository = myShowRepository;
	}
	
	
	
	@Override
	public void addMovie(Movie movie) {
		// TODO Auto-generated method stub
		myShowRepository.save(movie);
	}


	@Override
	public void updateMovie(Movie movie) {
		myShowRepository.save(movie);
	}

	@Override
	public void deleteMovie(int movieId) {
		myShowRepository.deleteById(movieId);
	}

	@Override
	public List<Movie> getByGenre(String genre) {
		// TODO Auto-generated method stub
		return myShowRepository.getByGenre(genre);
	}

	@Override
	public List<Movie> getByGenreAndLanguage(String genre, String language) {
		// TODO Auto-generated method stub
		return myShowRepository.getByGenreAndLanguage(genre, language) ;
	}

	@Override
	public List<Movie> getByLanguage(String language) {
		// TODO Auto-generated method stub
		return myShowRepository.getByLanguage(language);
	}

	@Override
	public List<Movie> getByTitleStartingWith(String title) {
		// TODO Auto-generated method stub
		return myShowRepository.getByTitleStartingWith(title);
	}

	@Override
	public List<Movie> getByRatingGreaterThanEqual(int rating) {
		// TODO Auto-generated method stub
		return myShowRepository.getByRatingGreaterThanEqual(rating);
	}

	@Override
	public Movie getById(int movieId) {
		// TODO Auto-generated method stub
		return myShowRepository.findById(movieId).get();
	}

	@Override
	public List<Movie> getAll() {
		// TODO Auto-generated method stub
		return myShowRepository.findAll();
	}

	
}
