package com.nttda.nttdataservice.nttdata.controller;

import com.nttda.nttdataservice.nttdata.presentation.controller.ClientController;
import com.nttda.nttdataservice.nttdata.presentation.presenter.ClientPresenter;
import com.nttda.nttdataservice.nttdata.service.ClientService;

import org.assertj.core.api.Assertions;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Answers;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashSet;
import java.util.UUID;

import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class ClientControllerTest {

    @Mock
    private ClientService clientService;
    @InjectMocks
    private ClientController clientController;

    @Test
    public void shouldGetClientById() {
        UUID clientId = UUID.randomUUID();
        clientController.getClientById(clientId);
        verify(clientService, times(1)).getClientById(clientId);
    }

    @Test
    public void shouldSaveClient() {
        ClientPresenter clientPresenter = new ClientPresenter();
        clientController.saveClient(clientPresenter);
        verify(clientService, times(1)).saveClient(clientPresenter);
    }

}
