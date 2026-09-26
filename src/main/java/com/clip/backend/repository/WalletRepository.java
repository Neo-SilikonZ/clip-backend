package com.clip.backend.repository;

import com.clip.backend.entity.Wallet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WalletRepository extends JpaRepository<Wallet, Long> {
    // Spring Data JPA automatically provides:
    // save(), findById(), findAll(), deleteById(), count(), etc.
    // You don't have to write any of the SQL!
}