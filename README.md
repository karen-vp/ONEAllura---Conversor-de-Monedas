# ONEAllura Conversor de Monedas

## Descripción
Este programa en Java permite a los usuarios realizar conversiones de moneda utilizando una API pública de tasas de cambio [ExchangeRate-API](https://www.exchangerate-api.com/docs/overview). El programa ofrece un menú interactivo con las siguientes opciones de conversión de monedas:

1. Dólar (USD) =>> Peso argentino (ARS)
2. Peso argentino (ARS) =>> Dólar (USD)
3. Dólar (USD) =>> Real brasileño (BRL)
4. Real brasileño (BRL) =>> Dólar (USD)
5. Dólar (USD) =>> Peso colombiano (COP)
6. Peso colombiano (COP) =>> Dólar (USD)
7. Salir

## Requisitos
- Java 8 o superior
- Conexión a Internet

## Uso

### 1. Clonar el repositorio
```bash
git clone https://github.com/karen-vp/ONEAllura-Conversor-de-Monedas.git
cd ConversorDeMonedas\out\artifacts\ConversorDeMonedas_jar
```
### 2. Ejecutar el programa
```bash
   java -jar ConversorDeMonedas.jar
```
## Funcionamiento
Al ejecutar el programa, se mostrará un menú con las opciones disponibles. El usuario debe ingresar el número correspondiente a la opción deseada y, a continuación, la cantidad a convertir. El programa realizará la conversión utilizando las tasas de cambio obtenidas de la API y mostrará el resultado.

```bash 
******************************************
Sea bienvenido/a al conversor de monedas
1) Dolar =>> Peso argentino
2) Peso argentino =>> Dolar
3) Dolar =>> Real brasileño
4) Real brasileño =>> Dolar
5) Dolar =>> Peso colombiano
6) Peso colombiano =>> Dolar
7) Salir
   Elija una opcion valida: 1
   Ingrese la cantidad a convertir: 100
   El valor 100.0 [USD] corresponde al valor final de =>>> 91450.0[ARS]
******************************************
```

