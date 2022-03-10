package com.practica;

import com.azure.cosmos.ConsistencyLevel;
import com.azure.cosmos.CosmosClient;
import com.azure.cosmos.CosmosClientBuilder;

import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        CosmosClient client = new CosmosClientBuilder()
                .endpoint("https://cosmos-prueba-1.documents.azure.com:443/")
                .key("l3VNnZgE5LrjEkoFLkCoJwPOjoW68zlx7kUJDfokPktOFsC6xMnfMTqL2g1zuUAJ6GOQR5KmSERXdDbwvVtX7g==")
                .consistencyLevel(ConsistencyLevel.EVENTUAL)
                .buildClient();
    }
}
