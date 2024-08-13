package com.myBankingApp.banking_app.service;

import com.myBankingApp.banking_app.dto.AccountDto;
import com.myBankingApp.banking_app.entity.Account;

public interface AccountService {

    AccountDto createAccount(AccountDto accountDto);
}
