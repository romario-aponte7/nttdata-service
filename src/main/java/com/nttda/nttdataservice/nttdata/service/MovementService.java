package com.nttda.nttdataservice.nttdata.service;

import com.nttda.nttdataservice.nttdata.entity.BankAccount;
import com.nttda.nttdataservice.nttdata.entity.Movement;
import com.nttda.nttdataservice.nttdata.presentation.presenter.BankAccountPresenter;
import com.nttda.nttdataservice.nttdata.presentation.presenter.MovementPresenter;
import com.nttda.nttdataservice.nttdata.presentation.presenter.MovementsReportPresenter;

import java.util.*;

public interface MovementService {

    Movement getMovementById(UUID movementId);

    MovementPresenter saveUpdateMovement(MovementPresenter movementPresenter);

    void deleteMovementById(UUID movementId);

    MovementPresenter toPresenter(Movement movement);

    List<MovementsReportPresenter> getMovementByClientAndDates(UUID clientId, Date initDate, Date endDate);
}
