package com.myshow;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.myshow.model.Movie;
import com.myshow.service.IMyShowService;

@SpringBootApplication
public class SpringJpaMyShowApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringJpaMyShowApplication.class, args);
	}
	
	
	private IMyShowService myShowService;
	@Autowired
	public void setMyShowService(IMyShowService myShowService) {
		this.myShowService = myShowService;
	}
	

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		System.out.println("enter\n1.add movie\n2.update Movie\n3.delete movie"
				+ "\n4.movie by genre\n5.movie by genre and language"
				+ "\n6.movie by name\n7.movie by rating\n8.movie by language\n9.all movies\n10.get by id");
		int choice = s.nextInt();
		s.nextLine();
		switch (choice) {
		case 1:
			List<Movie> movies=Arrays.asList(
					new Movie(1,"Don","comedy","tamil","chennai",4,3),
					new Movie(2,"GameOfThrones","thriller","english","kinglanding",5,50),
					new Movie(3,"Parampara","action","telugu","hyderabad",4,10),
					new Movie(4,"MeesayaMurukku","romance","tamil","chennai",4,2),
					new Movie(5,"MoneyHeist","horror","english","france",4,30),
					new Movie(6,"AeDilHaiMushkil","animation","hindi","delhi",3,4),
					new Movie(7,"Darshana","sciencefiction","malayalam","kerala",2,3)
					
					);
			
			for(Movie movie:movies)
				myShowService.addMovie(movie);

		case 2:
			Movie movie=new Movie(1,"Don","action","telugu","hyderabad",5,2);
			myShowService.updateMovie(movie);
			break;

		case 3:
			myShowService.deleteMovie(1);
			break;

		case 4:
			myShowService.getByGenre("action").forEach(System.out::println);
			break;
		case 5:
			myShowService.getByGenreAndLanguage("action", "telugu").forEach(System.out::println);
			break;

		case 6:
			myShowService.getByTitleStartingWith("Gam").forEach(System.out::println);
			break;

		case 7:
			myShowService.getByRatingGreaterThanEqual(2).forEach(System.out::println);
			break;

		case 8:
			myShowService.getByLanguage("telugu").forEach(System.out::println);
			break;

		case 9:
			myShowService.getAll().forEach(System.out::println);
			break;

		case 10:
			System.out.println(myShowService.getById(1));
			break;

		default:
			System.out.println("wrong input");
		}

		s.close();

		
	}
	

}
