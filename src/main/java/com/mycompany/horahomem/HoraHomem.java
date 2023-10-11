package com.mycompany.horahomem;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class HoraHomem {
    // Declaração de Variáveis
    private float gastosMensais;
    private float gastosAnuais;
    private int quantidadeGastosAnuais;

    public float getGastosMensais() {
        return gastosMensais;
    }

    public void setGastosMensais(float gastosMensais) {
        this.gastosMensais = gastosMensais;
    }

    public float getGastosAnuais() {
        return gastosAnuais;
    }

    public void setGastosAnuais(float gastosAnuais) {
        this.gastosAnuais = gastosAnuais;
    }

    public static void main(String[] args) {
        // Cria uma Lista
        List<Float> listaGastosMensais = new ArrayList<Float>();
        List<Float> listaGastosAnuais = new ArrayList<Float>();
        int i;

        // Instancia a Classe HoraHomem
        HoraHomem horaHomem = new HoraHomem();

        // Instancia a Classe Scanner
        Scanner scanner = new Scanner(System.in);

        // Formata a Inicialização
        System.out.println("\n---------- HORA HOMEM ----------\n");
        System.out.println("\n---------- QUANTIDADE DE GASTOS MENSAIS ----------\n");

        // Adiciona aos Gastos Mensais
        System.out.print("Digite a Quantidade de Gastos Mensais: ");
        horaHomem.quantidadeGastosAnuais = scanner.nextInt();

        System.out.println("\n---------- VALOR GASTOS MENSAIS ----------\n");
        for (i = 0; i < horaHomem.quantidadeGastosAnuais; i++) {
            System.out.print("Digite o valor do Gasto Mensal: ");
            float gastoMensal = scanner.nextFloat();
            listaGastosMensais.add(gastoMensal);
        }

        // Inicializa uma Variável Soma Gastos Mensais
        float somaGastosMensais = 0.0f;

        // Soma os Valores da Lista
        for (Float primeiroItem : listaGastosMensais) {
            somaGastosMensais += primeiroItem;
        }

        // Adiciona os Gastos Anuais
        System.out.println("\n---------- QUANTIDADE DE GASTOS ANUAIS ----------\n");
        System.out.print("Digite a Quantidade de Gastos Anuais: ");
        horaHomem.quantidadeGastosAnuais = scanner.nextInt();

        System.out.println("\n---------- VALOR GASTOS ANUAIS ----------\n");
        for (i = 0; i < horaHomem.quantidadeGastosAnuais; i++) {
            System.out.print("Digite o Valor do Gasto Anual: ");
            float gastoAnual = scanner.nextFloat();
            listaGastosAnuais.add(gastoAnual);
        }

        // Inicializa a Variável Soma Gastos Anuais
        float somaGastosAnuais = 0.0f;

        for (Float segundoItem : listaGastosAnuais) {
            somaGastosAnuais += segundoItem;
        }

        somaGastosAnuais /= 12.0f;

        // Calcula as Horas Trabalhadas
        System.out.println("\n---------- HORAS DE TRABALHO ----------\n");
        System.out.print("Digite quantas horas você trabalha: ");
        int horasTrabalhadas = scanner.nextInt();
        System.out.print("Digite quantos dias na semana você trabalha: ");
        int diasSemana = scanner.nextInt();
        float resultadoHorasTrabalho = (float) horasTrabalhadas * diasSemana * 4;

        // Captura o Valor Hora Homem
        float somaGastosTotais = somaGastosAnuais + somaGastosMensais;
        float valorHoraHomem = somaGastosTotais / resultadoHorasTrabalho;

        // Printa o Resultado na Tela
        System.out.println("\n---------- RESULTADO ----------\n");
        System.out.printf("O Valor de Hora Homem é: %.2fR$\n", valorHoraHomem);
        System.out.println("\n---------- FIM ----------\n");
    }
}
