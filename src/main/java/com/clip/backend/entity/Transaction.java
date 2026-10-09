package com.clip.backend.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.math.BigDecimal;
import java.time.LocalDateTime;


@Entity
@Table(name="transaction")
@Setter
@Getter
@NoArgsConstructor
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
    @CreationTimestamp
    public LocalDateTime CreatedAt;

    @Column(name="status", nullable = false)
    private String status;

    public Transaction(Long id, Long senderWalletId, Long receiverWalletId, BigDecimal amount, String status) {
        this.id = id;
        this.senderWalletId = senderWalletId;
        this.receiverWalletId = receiverWalletId;
        this.amount = amount;
        this.status = status;
    }
}
