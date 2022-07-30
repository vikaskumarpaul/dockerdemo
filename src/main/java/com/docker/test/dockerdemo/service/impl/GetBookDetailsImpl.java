package com.docker.test.dockerdemo.service.impl;

import com.docker.test.dockerdemo.dto.BookDetails;
import com.docker.test.dockerdemo.repo.BookRepo;
import com.docker.test.dockerdemo.service.GetBooksDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GetBookDetailsImpl implements GetBooksDetails {

    @Autowired
    private BookRepo bookRepo;

    @Override
    public BookDetails getBookDetails(Long id) {
        return bookRepo.getBookByID(id);
    }
}
