package com.docker.test.dockerdemo.dto;


import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class BookDetails {

    Long ID;
    String name;
    String type;
}
