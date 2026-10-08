package com.clip.backend.service;

import com.clip.backend.entity.Beneficiary;
import com.clip.backend.repository.BeneficiaryRepository;
import org.springframework.stereotype.Service;

@Service
public class BeneficiaryService {
    // dependency injection
    private final BeneficiaryRepository beneficiaryRepository;

    public BeneficiaryService(BeneficiaryRepository beneficiaryRepository) {
        this.beneficiaryRepository = beneficiaryRepository;
    }

    public Beneficiary createBeneficiary(Long ownerWalletId, String beneficiaryName, Long beneficiaryWalletId) {
        Beneficiary beneficiary = new Beneficiary(ownerWalletId, beneficiaryName, beneficiaryWalletId);

        return beneficiaryRepository.save(beneficiary);

    }
}
