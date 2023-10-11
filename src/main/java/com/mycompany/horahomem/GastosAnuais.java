package com.mycompany.horahomem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GastosAnuais {
    // Declaração de Variável
    private int quantidadeGastosAnuais;
    private List<Float> listaGastosAnuais = new ArrayList<Float>();

    public float getSomaGastosAnuais() {
        float somaGastosAnuais = 0.0f;
        for (Float item : listaGastosAnuais) {
            somaGastosAnuais += item;
        }
        return somaGastosAnuais / 12.0f;
    }

    public void gastosAnuais() {
        // Código para adicionar gastos anuais à lista
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n---------- QUANTIDADE DE GASTOS ANUAIS ----------\n");
        System.out.print("Digite a Quantidade de Gastos Anuais: ");
        quantidadeGastosAnuais = scanner.nextInt();

        System.out.println("\n---------- VALOR GASTOS ANUAIS ----------\n");
        for (int i = 0; i < quantidadeGastosAnuais; i++) {
            System.out.print("Digite o Valor do Gasto Anual: ");
            listaGastosAnuais.add(scanner.nextFloat());
        }
    }
}
