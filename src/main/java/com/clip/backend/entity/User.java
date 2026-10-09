package com.clip.backend.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Table(name= "user")
@Entity
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="email", nullable = false, unique = true)
    private String email;

    @Column(name="password", nullable = false)
    private String password;

    @Column(name="user_name", nullable = false)
    private String username;

    @Column(name="", nullable = false)
    @CreationTimestamp
    private LocalDateTime createdAt;

    public User() {
    }

    public User(Long id, String email, String password, String username, LocalDateTime createdAt) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.username = username;
    }

}
