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
        List<Serie> series = new ArrayList<>();

        System.out.println("*******   Bienvenidos a MovieSync   *******");

        do {
            System.out.println("Seleccione una pelicula del 1 al 6");


            try {
                valor = lectura.nextInt();
                Serie serie = peticion.getFilm(valor);
                series.add(serie);
                System.out.println(serie);

            }catch (Exception e){
                e.getMessage();
            }

            System.out.println();
            System.out.println("**** Presione ´s´ para salir ****");
            band = lectura.next();

            if (band.equals("s")){
                archivo.copiarArchivo(series);
                break;
            }



        }while (valor!= 9);


    }
}
