package com.JavierDev.conversor;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        System.out.println( "Bienvenido al conversor de Monedas");
        Scanner menuDeConversor = new Scanner(System.in);
        int opcion ;
        Double USD;
        Double UE;
        Double COL;
        int peso;


        System.out.println("por favor seleccione una opcion: 1 =  USD a Peso MX 2=  UE a Peso MX  3 =  Peso Colombiano a Peso MX ");
        opcion = menuDeConversor.nextInt();
        System.out.println("Digite la cantidad a Convertir");
        peso = menuDeConversor.nextInt();

        if (opcion == 1) {
            USD = peso / 17.95;
            System.out.println( peso + " Pesos, equivalen a " + USD + "dolares");
        } else if ( opcion == 2) {
            UE = peso / 19.26;
            System.out.println( peso +" Pesos, Equivalen a "+  UE + "Euros");
        } else if (opcion ==3) {
            COL = peso * 227.81;
            System.out.println( peso +" Pesos, Equivalen a "+  COL + "Pesos Colombianos");
        }else {
            System.out.println("seleccione una opcion valida");
        }
      menuDeConversor.close();
    }
}
