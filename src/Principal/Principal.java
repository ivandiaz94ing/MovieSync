package Principal;

import Calculos.ConsultaAPI;
import modelos.Serie;

import java.util.Scanner;


public class Principal {

    public static void main(String[] args) {
        System.out.println("*******   Bienvenidos a MovieSync   *******");
        int valor;
        ConsultaAPI peticion = new ConsultaAPI();

        Scanner lectura = new Scanner(System.in);
        System.out.println("Seleccione una pelicula del 1 al 6");
        try {
        valor = lectura.nextInt();
        Serie serie = peticion.getFilm(valor);
        System.out.println(serie);
        }catch (Exception e){
            e.getMessage();
        }

    }
}
