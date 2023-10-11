package com.mycompany.horahomem;

import java.util.Scanner;

public class HorasTrabalho {
    public void horasTrabalho(GastosMensais calculoGastosMensais, GastosAnuais calculoGastosAnuais) {
        // Instancia o Scanner
        Scanner scanner = new Scanner(System.in);

        // Calcula as Horas Trabalhadas
        System.out.println("\n---------- HORAS DE TRABALHO ----------\n");
        System.out.print("Digite quantas horas você trabalha: ");
        int horasTrabalhadas = scanner.nextInt();
        System.out.print("Digite quantos dias na semana você trabalha: ");
        int diasSemana = scanner.nextInt();
        float resultadoHorasTrabalho = (float) horasTrabalhadas * diasSemana * 4;

        // Captura o Valor Hora Homem
        float somaGastosMensais = calculoGastosMensais.getSomaGastosMensais();
        float somaGastosAnuais = calculoGastosAnuais.getSomaGastosAnuais();
        float valorHoraHomem = (somaGastosMensais + somaGastosAnuais) / resultadoHorasTrabalho;

        // Printa o Valor na Tela
        System.out.println("\n---------- RESULTADO ----------\n");
        System.out.printf("O Valor de Hora Homem é: %.2fR$\n", valorHoraHomem);
        System.out.println("\n---------- FIM ----------\n");
    }
}
