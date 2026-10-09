package com.clip.backend.entity;

import jakarta.persistence.*;
import lombok.*;

@Table(name ="beneficiary")
@Entity
@Getter
@Setter
@NoArgsConstructor

public class Beneficiary {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="owner_wallet_id", nullable = false)
    private Long ownerWalletId;

    @Column(name="beneficiary_name",nullable = false)
    private String beneficiaryName;

    @Column(name="beneficiary_wallet_id",nullable = false)
    private Long beneficiaryWalletId;

    public Beneficiary(Long ownerWalletId, String beneficiaryName, Long beneficiaryWalletId) {
        this.ownerWalletId = ownerWalletId;
        this.beneficiaryName = beneficiaryName;
        this.beneficiaryWalletId = beneficiaryWalletId;
    }
}
