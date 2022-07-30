package com.docker.test.dockerdemo.service;

import com.docker.test.dockerdemo.dto.BookDetails;

public interface GetBooksDetails {

    public BookDetails getBookDetails(Long id);
}
