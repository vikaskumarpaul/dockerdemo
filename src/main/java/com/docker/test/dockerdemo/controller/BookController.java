package com.docker.test.dockerdemo.controller;

import com.docker.test.dockerdemo.dto.BookDetails;
import com.docker.test.dockerdemo.service.GetBooksDetails;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping(value = "/library/book")
@AllArgsConstructor
public class BookController {

    private GetBooksDetails getBooksDetails;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<BookDetails> getBookDetailByID(@PathVariable("id") Long id) {
        return new ResponseEntity<>(getBooksDetails.getBookDetails(id), HttpStatus.OK);
    }
}
