package Principal;

import Calculos.ConsultaAPI;
import Calculos.ManejoArchivo;
import modelos.Serie;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Principal {

    public static void main(String[] args) {
        int valor=0;
        String band;
        ConsultaAPI peticion = new ConsultaAPI();
        ManejoArchivo archivo = new ManejoArchivo();

        Scanner lectura = new Scanner(System.in);

        System.out.println("*******   Bienvenidos a MovieSync   *******");

            System.out.println("Seleccione una pelicula del 1 al 6");


            try {
                valor = lectura.nextInt();
                Serie serie = peticion.getFilm(valor);
                System.out.println(serie);
                archivo.copiarArchivo(serie);

            }catch (Exception e){
                e.getMessage();
            }

    }
}
