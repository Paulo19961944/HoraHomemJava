package com.mycompany.horahomem;

public class HoraHomem {
    public static void main(String[] args) {
        // Instancia as Classes de Gastos Mensais e Anuais
        GastosMensais gastosMensais = new GastosMensais();
        gastosMensais.gastosMensais();

        GastosAnuais gastosAnuais = new GastosAnuais();
        gastosAnuais.gastosAnuais();

        HorasTrabalho horasTrabalho = new HorasTrabalho();
        horasTrabalho.horasTrabalho(gastosMensais, gastosAnuais);
    }
}
