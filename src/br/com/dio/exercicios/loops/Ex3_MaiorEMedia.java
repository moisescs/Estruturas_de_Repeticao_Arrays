package br.com.dio.exercicios.loops;

import java.util.Scanner;

/*
Faça um programa que leia 5 números e informe o maior númeroe a média desses números.
*/

public class Ex3_MaiorEMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double numero, soma = 0, media, maior = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite o " + (i + 1) + "º nemero: ");
            numero = scan.nextDouble();
            soma += numero;
            if (numero > maior) maior = numero;
        }
        System.out.println("Maior: " + maior);
        System.out.println("Media: " + (soma/5));

    
    }
}
