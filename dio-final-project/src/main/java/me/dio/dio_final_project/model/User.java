package me.dio.dio_final_project.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;

    public Long getId() {
        return 0L;
    }

    public String getName() {
        return "";
    }

    public String getEmail() {
        return "";
    }
    // Getters and setters...
}
