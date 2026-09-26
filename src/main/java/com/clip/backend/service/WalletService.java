package com.clip.backend.service;

import com.clip.backend.entity.Wallet;
import com.clip.backend.repository.WalletRepository;
import org.springframework.stereotype.Service;
import java.math.BigDecimal;

@Service
public class WalletService {

    private final WalletRepository walletRepository;

    // Spring Boot automatically injects the Repository here!
    public WalletService(WalletRepository walletRepository) {
        this.walletRepository = walletRepository;
    }

    public Wallet createWallet(Long userId) {
        // 1. Create a new Wallet object with a balance of 0.00
        Wallet wallet = new Wallet(BigDecimal.ZERO, userId);

        // 2. Tell the Repository to save it to the database
        return walletRepository.save(wallet);
    }
}