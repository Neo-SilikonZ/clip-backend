package com.clip.backend.controller;

import com.clip.backend.entity.Beneficiary;
import com.clip.backend.service.BeneficiaryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("api/v1/beneficiary")
public class BeneficiaryController {

    private final BeneficiaryService beneficiaryService;

    public BeneficiaryController(BeneficiaryService beneficiaryService) {
        this.beneficiaryService = beneficiaryService;
    }

    @GetMapping("/create")
    public Beneficiary createBeneficiary(@RequestParam Long ownerWalletId, String beneficiaryName, Long beneficiaryWalletId) {

        return beneficiaryService.createBeneficiary(ownerWalletId,beneficiaryName,beneficiaryWalletId);
    }
}
