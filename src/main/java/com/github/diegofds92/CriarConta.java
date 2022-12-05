package com.github.diegofds92;

public class CriarConta {
    public static void main(String[] args) {
        Conta primeiraConta = new Conta();
        Conta segundaConta = new Conta();

        primeiraConta.depositar(200);
        System.out.println(primeiraConta.getSaldo());

        segundaConta.depositar(50);
        System.out.println(segundaConta.getSaldo());

        primeiraConta.depositar(150);
        System.out.println(primeiraConta.getSaldo());
    }
}
