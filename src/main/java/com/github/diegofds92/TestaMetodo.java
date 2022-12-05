package com.github.diegofds92;

public class TestaMetodo {
    public static void main(String[] args) {
        Conta conta = new Conta();
        Conta contaTeste = new Conta();

        conta.depositar(500);
        System.out.println("Valor inicial: R$" + conta.getSaldo());

        conta.sacar(120);
        System.out.println("Valor restante após saque de R$120: R$" + conta.getSaldo());

        System.out.println("O Valor da conta ANTES da transferência é de R$"+conta.getSaldo());
        System.out.println("O Valor da contaTeste ANTES da transferência de R$"+contaTeste.getSaldo());
        if (conta.transfere(100, contaTeste)){
            System.out.println("Transferência feita com sucesso!");
        }else{
            System.out.println("Transfereência FALHOU! Faltou dinheiro!");
        }
        System.out.println("O Valor da conta APÓS a transferência é de R$"+conta.getSaldo());
        System.out.println("O Valor da contaTeste APÓS a transferência é de R$"+contaTeste.getSaldo());
        //Teste de criação de while
        /*while (conta.saldo < 1000){
            conta.depositar(100);
            System.out.println("Valor depositado: R$"+conta.saldo);
        }*/


    }
}
