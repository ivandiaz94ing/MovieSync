package Calculos;

import com.google.gson.Gson;
import modelos.Serie;


import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaAPI {
     String baseUrl = "https://swapi.py4e.com/api/films/";

     public Serie getFilm (int numeroSerie) {

         URI direccion = URI.create("https://swapi.dev/api/films/"+numeroSerie);



             //CREACION DEL CLIENTE
             HttpClient cliente = HttpClient.newHttpClient();

             //CREACION DE LA PETICION.
             HttpRequest request = HttpRequest.newBuilder()
                     .uri(direccion)
                     .GET()
                     .build();

         try {
             HttpResponse<String> response = cliente
                     .send(request, HttpResponse.BodyHandlers.ofString());

             return new Gson().fromJson(response.body(), Serie.class);

         } catch (IOException | InterruptedException e) {
             throw new RuntimeException("No encontré esa serie.");
         }







     }
}
