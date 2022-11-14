package ru.webred.back.auth.domain;

import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;

import javax.persistence.Id;
import javax.persistence.Table;
@Table(schema = "users")
@JsonPOJOBuilder

public class User {
    @Id
    private Long id;
    private Long name;

}
