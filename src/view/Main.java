package view;

import controller.MenorValor;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MenorValor menorValorVetor = new MenorValor(); 

        System.out.print("Digite o tamanho do seu vetor: ");
        int tamanho = scanner.nextInt();
        
        int[] vetor = new int[tamanho];

        System.out.println("Digite os elementos do vetor:");
        for (int i = 0; i < tamanho; i++) {
            vetor[i] = scanner.nextInt();
        }

        int menorValor = menorValorVetor.menorValor(vetor, tamanho, vetor[tamanho - 1]);

        System.out.println("O menor valor do vetor é: " + menorValor);

        scanner.close();
    }
}
