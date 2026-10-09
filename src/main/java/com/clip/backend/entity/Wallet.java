package com.clip.backend.entity;

import jakarta.persistence.*;
import java.math.BigDecimal;

import lombok.*;


@Entity
@Table(name = "wallets")
@Getter
@Setter
@NoArgsConstructor

public class Wallet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="balance",nullable = false, precision = 19, scale = 2)
    private BigDecimal balance;

    @Column(name="user_id",nullable = false)
    private Long userId;

    public Wallet(BigDecimal balance, Long userId) {
        this.userId = userId;
        this.balance = balance;
    }
}
