package com.myshow.model;


import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author BhargavRajJinka
 *
 */
@Entity
public class Movie {

	@Id
	private Integer movieId;
	private String title;
	private String genre;
	private String language;
	private String location;
	private int rating;
	private int duration;
	
	
	/**
	 * 
	 */
	public Movie() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public Movie(Integer movieId, String title, String genre, String language, String location,
			int rating, int duration) {
		super();
		this.movieId = movieId;
		this.title = title;
		this.genre = genre;
		this.language = language;
		this.location = location;
		
		this.rating = rating;
		this.duration = duration;
	}
	
	

	public Movie(String title, String genre, String language, String location, int rating,
			int duration) {
		super();
		this.title = title;
		this.genre = genre;
		this.language = language;
		this.location = location;
	
		this.rating = rating;
		this.duration = duration;
	}


	/**
	 * @return
	 */
	public Integer getMovieId() {
		return movieId;
	}




	/**
	 * @param movieId
	 */
	public void setMovieId(Integer movieId) {
		this.movieId = movieId;
	}




	/**
	 * @return
	 */
	public String getTitle() {
		return title;
	}




	/**
	 * @param title
	 */
	public void setTitle(String title) {
		this.title = title;
	}




	/**
	 * @return
	 */
	public String getGenre() {
		return genre;
	}




	/**
	 * @param genre
	 */
	public void setGenre(String genre) {
		this.genre = genre;
	}




	/**
	 * @return
	 */
	public String getLanguage() {
		return language;
	}




	/**
	 * @param language
	 */
	public void setLanguage(String language) {
		this.language = language;
	}




	/**
	 * @return
	 */
	public String getLocation() {
		return location;
	}




	/**
	 * @param location
	 */
	public void setLocation(String location) {
		this.location = location;
	}


	@Override
	public String toString() {
		return "Movie [movieId=" + movieId + ", title=" + title + ", genre=" + genre + ", language=" + language
				+ ", location=" + location + ", rating=" + rating + ", duration="
				+ duration + "]";
	}


	/**
	 * @return
	 */
	public int getRating() {
		return rating;
	}




	/**
	 * @param rating
	 */
	public void setRating(int rating) {
		this.rating = rating;
	}




	/**
	 * @return
	 */
	public int getDuration() {
		return duration;
	}




	/**
	 * @param duration
	 */
	public void setDuration(int duration) {
		this.duration = duration;
	}


	
	
	
	
	
	
}
