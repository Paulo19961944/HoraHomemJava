package com.mycompany.horahomem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GastosMensais {
    // Declaração de Variáveis
    private int quantidadeGastosMensais;
    private List<Float> listaGastosMensais = new ArrayList<Float>();

    public float getSomaGastosMensais() {
        float somaGastosMensais = 0.0f;
        for (Float item : listaGastosMensais) {
            somaGastosMensais += item;
        }
        return somaGastosMensais;
    }

    public void gastosMensais() {
        // Código para adicionar gastos mensais à lista
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n---------- QUANTIDADE DE GASTOS MENSAIS ----------\n");
        System.out.print("Digite a Quantidade de Gastos Mensais: ");
        quantidadeGastosMensais = scanner.nextInt();

        System.out.println("\n---------- VALOR GASTOS MENSAIS ----------\n");
        for (int i = 0; i < quantidadeGastosMensais; i++) {
            System.out.print("Digite o valor do Gasto Mensal: ");
            listaGastosMensais.add(scanner.nextFloat());
        }
    }
}
