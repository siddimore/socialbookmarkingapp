package com.smore.managers;

import com.smore.entities.Book;
import com.smore.entities.Movie;
import com.smore.entities.WebLink;

/**
 * Created by siddharthmore on 1/4/17.
 */
public class BookManager {

    private static BookManager instance = new BookManager();
    private BookManager() {

    }

    public BookManager getInstance() {
        if(instance != null) {
            return instance;
        }
        else {
            return new BookManager();
        }
    }

    public WebLink createWebLink(long id, String inputTitle,String host, String url ) {

        WebLink newWebLink = new WebLink();
        newWebLink.setId(id);
        newWebLink.setHost(host);
        newWebLink.setUrl(url);
        newWebLink.setTitle(inputTitle);

        return newWebLink;

    }

    public Book createBook(long id, String publisher, String[] authors, String genre, double rating, int year) {
        Book newBook = new Book();
        newBook.setId(id);
        newBook.setPublisher(publisher);
        newBook.setAuthor(authors);
        newBook.setGenre(genre);
        newBook.setAmazonRating(rating);
        newBook.setPublicationYear(year);

        return newBook;
    }

    private String[] cast;
    private String[] directors;
    private String genre;
    private double imdbRating;
    private int releaseYear;

    public Movie createMovie(String[] inputCast, String[] inputDirectors, String inputGenre, double inputRating, int inputYear) {

        Movie newMovie = new Movie();
        newMovie.setCast(inputCast);
        newMovie.setDirectors(inputDirectors);
        newMovie.setGenre(inputGenre);
        newMovie.setImdbRating(inputRating);
        newMovie.setReleaseYear(inputYear);

        return newMovie;
    }
}
