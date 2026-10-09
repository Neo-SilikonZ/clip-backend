package com.clip.backend.entity;

import jakarta.persistence.*;
import lombok.*;

@Table(name ="beneficiary")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor// generates all the getter/setter logic
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

}
