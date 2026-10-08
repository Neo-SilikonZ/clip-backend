package com.clip.backend.entity;

import jakarta.persistence.*;
import java.math.BigDecimal;
import lombok.Data;


@Entity
@Table(name = "wallets")
@Data
public class Wallet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="balance",nullable = false, precision = 19, scale = 2)
    private BigDecimal balance;

    @Column(name="user_id",nullable = false)
    private Long userId;

    public Wallet() {
    }

    public Wallet(BigDecimal balance, Long userId) {
        this.balance = balance;
        this.userId = userId;
    }
}
