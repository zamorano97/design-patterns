package com.example.patterns_banking.controllers.account;

import com.example.patterns_banking.dtos.account.AccountDTO;
import com.example.patterns_banking.models.account.Account;
import com.example.patterns_banking.services.account.AccountService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/account")
public class AccountController {
    private final AccountService accountService;

    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @PostMapping
    public ResponseEntity<Account> createAccount(@RequestBody AccountDTO accountDTO) {
        return ResponseEntity.ok(accountService.create(accountDTO));
    }

}
