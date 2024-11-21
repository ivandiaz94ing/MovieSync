package Calculos;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import modelos.Serie;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class ManejoArchivo {

    public void copiarArchivo (List<Serie> lista){
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        try {
            FileWriter archivo = new FileWriter("peliculas.json");
            archivo.write(gson.toJson(lista));
            archivo.close();
            System.out.println("Archivo JSON creado exitosamente.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
