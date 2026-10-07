package com.clip.backend.entity;

import jakarta.persistence.*;
import lombok.Data;

@Table(name ="beneficiary")
@Entity
@Data // generates all the getter/setter logic
public class Beneficiary {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="owner_wallet_id", nullable = false)
    private Long ownerWalletId;

    @Column(name="owner_name",nullable = false)
    private String ownerName;

    @Column(name="beneficiary_wallet_id",nullable = false)
    private Long beneficiaryWalletId;

    // hibernate needs this empty constructor
    public Beneficiary() {
    }

}
