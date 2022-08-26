package com.nttda.nttdataservice.nttdata.service;

import com.nttda.nttdataservice.nttdata.entity.BankAccount;
import com.nttda.nttdataservice.nttdata.presentation.presenter.BankAccountPresenter;

import java.util.UUID;

public interface BankAccountService {

    BankAccount getBankAccountById(UUID bankAccountId);

    BankAccountPresenter getBankAccountByNumber(String bankAccountNumber);

    BankAccountPresenter saveBankAccount(BankAccountPresenter bankAccountPresenter);

    BankAccountPresenter updateBankAccount(BankAccountPresenter bankAccountPresenter);

    void deleteBankAccountById(UUID bankAccountId);

    BankAccountPresenter toPresenter(BankAccount bankAccount);

}
