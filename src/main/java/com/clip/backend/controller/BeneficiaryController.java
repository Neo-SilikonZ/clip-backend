package com.clip.backend.controller;

import com.clip.backend.entity.Beneficiary;
import com.clip.backend.service.BeneficiaryService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/beneficiary")
public class BeneficiaryController {

    private final BeneficiaryService beneficiaryService;

    public BeneficiaryController(BeneficiaryService beneficiaryService) {
        this.beneficiaryService = beneficiaryService;
    }

    @PostMapping
    public Beneficiary createBeneficiary(@RequestBody Beneficiary beneficiary) {

        return beneficiaryService.createBeneficiary(beneficiary.getOwnerWalletId(), beneficiary.getBeneficiaryName(), beneficiary.getBeneficiaryWalletId());
    }
}
