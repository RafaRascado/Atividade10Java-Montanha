// Faça um Programa que peça a temperatura em graus Celsius, transforme e mostre em graus Fahrenheit.


import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    System.out.println("Informe a temperatura que está na sua região: ");
    Scanner teclado = new Scanner(System.in);
    double tempCelsius = teclado.nextDouble();

    double tempFahren = tempCelsius * 1.8 + 32;

    System.out.println("A temperatura convertida para celsius: " + tempFahren);

  }
}