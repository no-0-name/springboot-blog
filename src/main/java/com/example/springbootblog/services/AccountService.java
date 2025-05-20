package com.example.springbootblog.services;

import com.example.springbootblog.models.Account;
import com.example.springbootblog.repositories.AccountRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AccountService {
    private final PasswordEncoder passwordEncoder;
    private final AccountRepository accountRepository;

    public Account save(Account account) {
        account.setPassword(passwordEncoder.encode(account.getPassword()));
        return accountRepository.save(account);
    }

    // Method for new_post on the postController
    public Optional<Account> findByEmail(String email) {
        return accountRepository.findOneByEmail(email);
    }
}
