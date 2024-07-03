package com.aluracursos.conversordemonedas.calculos;

import com.aluracursos.conversordemonedas.modelos.RespuestaDeApi;
import com.aluracursos.conversordemonedas.modelos.Moneda;

public class Conversion {

    public String calcularValorDeMoneda(String monedaBase, String monedaDestino, double valorAConvertir){
        double valorDeCambio = 0.0;
        double valorTotal = 0.0;
        StringBuilder stringBuilder = new StringBuilder();
        try{
            RespuestaDeApi consulta = new RespuestaDeApi();
            Moneda moneda = consulta.buscaMoneda(monedaBase);
            valorDeCambio = moneda.conversion_rates().get(monedaDestino);
            valorTotal = valorAConvertir * valorDeCambio;
            stringBuilder.append("1 " + " ["+monedaBase+"] " + " equivale a: " + valorDeCambio + " ["+monedaDestino+"]\n")
                    .append("El valor " + valorAConvertir + " ["+monedaBase+"] "+
                            "corresponde al valor final de =>>> " + valorTotal + " ["+monedaDestino+"]");
            return stringBuilder.toString();
        }catch (Exception e) {
            throw new RuntimeException("No encontre esa moneda. " + e);
        }

    }
    public String elegirOpcionConversionDeMoneda(int opcion, double valorAConvertir){


        String resultado ="";
        switch (opcion){
            case 1:
                //"1) Dolar =>> Peso argentino\n"
                resultado = this.calcularValorDeMoneda("USD", "ARS",valorAConvertir);
                break;
            case 2:
                // "2) Peso argentino =>> Dolar\n"
                resultado = this.calcularValorDeMoneda("ARS","USD", valorAConvertir);
                break;
            case 3:
                // "3) Dolar =>> Real brasileño\n"
                resultado = this.calcularValorDeMoneda("USD", "BRL", valorAConvertir);
                break;
            case 4:
                //"4) Real brasileño =>> Dolar\n"

                resultado = this.calcularValorDeMoneda("BRL","USD",valorAConvertir);
                break;
            case 5:
                    //"5) Dolar =>> Peso colombiano\n"
                resultado = this.calcularValorDeMoneda("USD", "COP",valorAConvertir);
                break;
            case 6:
                   // "6) Peso colombiano =>> Dolar\n"
                resultado = this.calcularValorDeMoneda("COP", "USD",valorAConvertir);
                break;
            default:
                resultado = "Opcion no valida";
                break;
        }
        return resultado;
    }
}
