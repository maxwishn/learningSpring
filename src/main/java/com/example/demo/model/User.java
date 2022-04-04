package com.example.demo.model;

import lombok.Data;

import javax.persistence.*;
/**
 * Entity class for user
 */
@Table(name = "users", schema = "public")
@Data
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String login;
    private String password;
}