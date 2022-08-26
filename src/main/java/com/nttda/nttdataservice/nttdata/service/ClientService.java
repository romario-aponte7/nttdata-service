package com.nttda.nttdataservice.nttdata.service;

import com.nttda.nttdataservice.nttdata.entity.Client;
import com.nttda.nttdataservice.nttdata.presentation.presenter.ClientPresenter;
import com.nttda.nttdataservice.nttdata.presentation.presenter.PersonPresenter;

import java.util.UUID;

public interface ClientService {

    Client getClientById(UUID clientId);

    ClientPresenter getClientByIdentification(String identification);

    ClientPresenter saveClient(ClientPresenter clientPresenter);

    ClientPresenter updateClient(ClientPresenter clientPresenter);

    void deleteClientById(UUID clientId);

    ClientPresenter toPresenter(Client client);

}
