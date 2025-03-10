package com.example.firstproject.Services;

import com.example.firstproject.Entities.Client;

import java.util.List;

public interface IClientService {

    List<Client> retrieveAllClients();

    Client addClient(Client e);

    Client updateClient(Client e);

    Client retrieveClient(Long idClient);

    void removeClient(Long idClient);

    List<Client> addClients (List<Client> Clients);

    String testClient();
}
