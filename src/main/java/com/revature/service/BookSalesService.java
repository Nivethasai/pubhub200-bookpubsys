package com.revature.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.model.BookSales;
import com.revature.repository.BookSalesRepository;


@Service
public class BookSalesService {
	
	@Autowired
	private BookSalesRepository bookSalesRepository;
	
	public void save(BookSales bookSales) {
		bookSalesRepository.save(bookSales);
	}
}
