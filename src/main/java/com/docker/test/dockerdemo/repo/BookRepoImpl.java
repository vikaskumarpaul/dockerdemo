package com.docker.test.dockerdemo.repo;

import com.docker.test.dockerdemo.dto.BookDetails;
import org.springframework.stereotype.Repository;

@Repository
public class BookRepoImpl implements BookRepo{

    @Override
    public BookDetails getBookByID(Long ID) {
        return BookDetails.builder().ID(ID).name("TestBook").type("Science").build();
    }
}
