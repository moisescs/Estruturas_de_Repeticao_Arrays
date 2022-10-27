package br.com.dio.exercicios.loops;

import java.util.Scanner;

import javax.swing.JSpinner.NumberEditor;

/*
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números impares.
*/

public class Ex4_ParEImpar {
    public static void main(String[] args) {
        int numero, qtdNumeros, qtdPares = 0, qtdImpares=0;

        Scanner scan = new Scanner(System.in);
        
        System.out.println("Informe a quantidade de núemros: ");
        qtdNumeros = scan.nextInt();

        int count = 0;
        do {
            System.out.println("Digite um número: ");
            numero = scan.nextInt();
            
            if(numero % 2 == 0) qtdPares++;
            else qtdImpares++;

            count++;
        } while (count < qtdNumeros);

        System.out.println(qtdPares + ": Pares");
        System.out.println(qtdImpares + ": Impares");
    }
}
