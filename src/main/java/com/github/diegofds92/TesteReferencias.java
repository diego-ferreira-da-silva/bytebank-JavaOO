package com.github.diegofds92;

public class TesteReferencias {
    public static void main(String[] args) {
        Conta primeiraConta = new Conta();
        primeiraConta.depositar(300);

        System.out.println("Saldo da primeira: " + primeiraConta.pegaSaldo());

        Conta segundaConta = primeiraConta;

    }
}
