package com.github.diegofds92;

public class CriarConta {
    public static void main(String[] args) {
        Conta primeiraConta = new Conta();
        Conta segundaConta = new Conta();

        primeiraConta.saldo = 200;
        System.out.println(primeiraConta.saldo);

        segundaConta.saldo = 50;
        System.out.println(segundaConta.saldo);

        primeiraConta.depositar(150);
        System.out.println(primeiraConta.saldo);
    }
}
