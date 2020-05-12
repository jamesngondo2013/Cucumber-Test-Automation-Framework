package apiEngine.model.response;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import apiEngine.model.Book;

@JsonIgnoreProperties
public class Books {

	public List<Book> books;
}
