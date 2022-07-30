package com.docker.test.dockerdemo.repo;

import com.docker.test.dockerdemo.dto.BookDetails;

public interface BookRepo {

    public BookDetails getBookByID(Long ID);
}
