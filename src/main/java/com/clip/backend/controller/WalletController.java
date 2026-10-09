package com.clip.backend.controller;

import com.clip.backend.entity.Wallet;
import com.clip.backend.service.WalletService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/wallet")
public class WalletController {

    private final WalletService walletService;

    public WalletController(WalletService walletService) {

        this.walletService = walletService;
    }

    @PostMapping("/{userId}")
    public Wallet createWallet(@PathVariable Long userId) {
        return walletService.createWallet(userId);
    }
}