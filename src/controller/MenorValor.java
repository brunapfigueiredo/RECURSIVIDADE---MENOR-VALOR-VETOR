package controller;

public class MenorValor {

    public MenorValor() {
        super();
    }

    public int menorValor(int[] vetor, int tamanho, int menor) {
    	//Condição de parada - quando a posição no vetor for 0 (quando não há mais para analisar), retornar o menor valor.
        if (tamanho == 0) {
            return menor;
        }

        //comparação do menor valor analisado com o restante dos valores existentes no vetor, quando for menor, armazena o novo valor na variável
        if (vetor[tamanho - 1] < menor) {
            menor = vetor[tamanho - 1];
        }

        return menorValor(vetor, tamanho - 1, menor);
    }
}

//TESTE DE MESA

//vetor [6, 4, 1, 9, 10, 2]
//tamanho = 6
//menor = tamanho - 1 (posição)

//menor 2
// [6]