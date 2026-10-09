package com.clip.backend.controller;

import com.clip.backend.entity.Wallet;
import com.clip.backend.service.WalletService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/wallet")
public class WalletController {

    private final WalletService walletService;

    public WalletController(WalletService walletService) {

        this.walletService = walletService;
    }

    @GetMapping("/create")
    public Wallet createWallet(@RequestParam Long userId) {

        return walletService.createWallet(userId);
    }
}