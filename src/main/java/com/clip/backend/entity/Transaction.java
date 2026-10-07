package com.clip.backend.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;


@Entity
@Table(name="transaction")
@Data
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="sender_wallet_id", nullable = false)
    private Long senderWalletId;

    @Column(name="receiver_wallet_id", nullable = false)
    private Long receiverWalletId;

    @Column(name="amount", nullable = false)
    private BigDecimal amount;

    @Column(name="created_at", nullable = false)
    public LocalDateTime CreatedAt;

    @Column(name="status", nullable = false)
    private String status;
}
