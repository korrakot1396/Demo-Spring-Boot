package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.UUID;

public class Person {

    private final UUID id;
    @NotBlank(message = "Username is required")
    @Size(min = 3, max = 12, message = "Username must be between 3 and 12 characters long")
    private final String name;

    public Person(@JsonProperty("id") UUID id,@JsonProperty("name") String name) {
        this.id = id;
        this.name = name;
    }

    public UUID  getID() {
        return id;
    }

    public String getName() {
        return name;
    }
}
