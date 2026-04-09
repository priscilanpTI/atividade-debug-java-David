package org.senai.exemplos;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("------====[ C A L C U L A D O R A]====------\n\n");

        double total= 10;

        System.out.print("Digite um número: ");
        double num1 = ler.nextDouble();

        System.out.print("Digite outro número: ");
        double num2 = ler.nextDouble();

        System.out.print ("Digite a operação:(+, -, / e x)  ");
        String opera = ler.next();

        switch (opera) {
            case "+":
                total=num1+num2;
                System.out.println("Resultado = "+total);
                break;
            case "-":
                total=num1-num2;
                System.out.println("Resultado = "+total);
                break;
            case "/":
                total=num1/num2;
                System.out.println("Resultado = "+total);
                break;
            case "*":
                total=num1*num2;
                System.out.println("Resultado = "+num1);
                break;
        }
        }
    }
