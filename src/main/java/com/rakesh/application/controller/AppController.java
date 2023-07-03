package com.rakesh.application.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rakesh.application.model.book.Book;
import com.rakesh.application.model.book.repository.BookRepository;
import com.rakesh.application.model.user.User;
import com.rakesh.application.model.user.repository.UserRepository;

@RestController
@RequestMapping("/app")
public class AppController {
	
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private BookRepository bookRepository;
	
	@GetMapping("/test")
	public String testApp() {
		return "Application Running";
	}

	@GetMapping("/users")
	public List<User> getUsers(){
		return userRepository.findAll();
	}
	
	@GetMapping("/books")
	public List<Book> getBooks(){
		return bookRepository.findAll();
	}
}
