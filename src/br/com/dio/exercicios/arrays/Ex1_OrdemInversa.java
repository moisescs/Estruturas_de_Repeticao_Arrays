package br.com.dio.exercicios.arrays;

public class Ex1_OrdemInversa  {
    public static void main(String[] args) {
        int [] vetor = {1, 3, 5, 8, 9};

        for (int i : vetor) {
            System.out.println(i);
        }
        
        System.out.println("\nVetor inverso: ");
        for (int i = (vetor.length -1 ); i >= 0; i--) {
            System.out.println(vetor[i]);
            
        }
    }
}
