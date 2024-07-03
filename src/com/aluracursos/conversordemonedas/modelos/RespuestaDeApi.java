package com.aluracursos.conversordemonedas.modelos;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import com.google.gson.Gson;
public class RespuestaDeApi {

    public Moneda buscaMoneda(String moneda){
        URI direccion =URI.create("https://v6.exchangerate-api.com/v6/b0ed1fb9a195c5acd9d83fff/latest/"+ moneda);

        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Moneda.class);
        }catch (Exception e) {
            throw new RuntimeException("No encontre esa moneda. " + e);
        }
    }

}
