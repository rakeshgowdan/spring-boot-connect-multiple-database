package com.rakesh.application;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.rakesh.application.model.book.Book;
import com.rakesh.application.model.book.repository.BookRepository;
import com.rakesh.application.model.user.User;
import com.rakesh.application.model.user.repository.UserRepository;

@SpringBootApplication
//@ComponentScan(basePackages="{com.rakesh.application.*}")
public class SpringBootConnectMultipleDatabaseApplication {

	@Autowired
	private UserRepository userRepository;
	@Autowired
	private BookRepository bookRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootConnectMultipleDatabaseApplication.class, args);
	}

	
	@PostConstruct
	public void addDataToDatabase() {
		userRepository.saveAll(Stream.of(new User(101, "Ram"), new User(102, "Raghu")).collect(Collectors.toList()));
		bookRepository.saveAll(Stream.of(new Book(101, "Java"), new Book(102, "Python")).collect(Collectors.toList()));

	}
}
