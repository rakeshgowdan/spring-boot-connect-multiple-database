package com.rakesh.application.model.book;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Setter;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="books")
public class Book {

	@Id
	private int id;
	private String bookName;
}
