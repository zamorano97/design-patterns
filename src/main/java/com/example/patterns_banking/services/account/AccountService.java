package com.example.patterns_banking.services.account;

import com.example.patterns_banking.dtos.account.AccountDTO;
import com.example.patterns_banking.models.account.Account;
import com.example.patterns_banking.repositories.account.AccountRepository;
import com.example.patterns_banking.repositories.account.IAccountRepository;
import org.springframework.stereotype.Service;

@Service
public class AccountService {

//    private IAccountRepository accountRepository;
    private AccountRepository accountRepository;

    public AccountService(IAccountRepository accountRepository) {
//        this.accountRepository = accountRepository;
        this.accountRepository = AccountRepository.getInstance();
    }

    public Account create(AccountDTO accountDTO) {
        Account account = Account.builder()
                .number(accountDTO.getNumber())
                .type(accountDTO.getType())
                .balance(accountDTO.getBalance())
                .isActive(accountDTO.getIsActive())
                .build();
        return accountRepository.save(account);
    }
}
