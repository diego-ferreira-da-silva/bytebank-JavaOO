package com.github.diegofds92;

public class TesteSacaNegativos {
    public static void main(String[] args) {
        Conta conta = new Conta();

        conta.depositar(100);

        //Já não é mais acessível diretamente.
        //System.out.println(conta.saldo);

        System.out.println(conta.sacar(120));
        System.out.println(conta.getSaldo());

    }

}
