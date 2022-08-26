package com.nttda.nttdataservice.nttdata.presentation.presenter;

import com.nttda.nttdataservice.nttdata.enums.BankAccountStatus;
import com.nttda.nttdataservice.nttdata.enums.BankAccountType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Set;
import java.util.UUID;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BankAccountPresenter {

    private UUID bankAccountId;
    private String number;
    private BankAccountType type;
    private BigDecimal initialBalance;
    private BankAccountStatus status;
    private UUID clientId;
    private Set<MovementPresenter> movementPresenters;

}
