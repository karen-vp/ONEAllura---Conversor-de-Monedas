package com.aluracursos.conversordemonedas.principal;

import com.aluracursos.conversordemonedas.calculos.Conversion;
import com.aluracursos.conversordemonedas.modelos.RespuestaDeApi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        RespuestaDeApi consulta = new RespuestaDeApi();
        Scanner lectura  = new Scanner(System.in);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("******************************************\n")
                .append("Sea bienvenido/a al conversor de monedas\n")
                .append("1) Dolar =>> Peso argentino\n")
                .append("2) Peso argentino =>> Dolar\n")
                .append("3) Dolar =>> Real brasileño\n")
                .append("4) Real brasileño =>> Dolar\n")
                .append("5) Dolar =>> Peso colombiano\n")
                .append("6) Peso colombiano =>> Dolar\n")
                .append("7) Salir\n")
                .append("Elija una opcion valida: ")
                .append("******************************************\n");
        int opcion = 0;
        Conversion conversion = new Conversion();
        while(opcion != 7){
            try{
                System.out.println(stringBuilder.toString());
                opcion = lectura.nextInt();
                lectura.nextLine();
                if(opcion<7){
                    System.out.println("Ingrese el valor que desea convertir: ");
                    double valor = lectura.nextDouble();
                    lectura.nextLine();
                    System.out.println(conversion.elegirOpcionConversionDeMoneda(opcion,valor));
                }else{
                    System.out.println("Finalizo ejecucion del programa!");

                }
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
        }

    }
}