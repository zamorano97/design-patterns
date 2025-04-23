package com.example.patterns_banking.repositories.account;

import com.example.patterns_banking.models.account.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAccountRepository extends JpaRepository<Account, Long> {
}
