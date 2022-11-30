package com.github.diegofds92;

public class TestaBanco {
    public static void main(String[] args) {
        Cliente diego = new Cliente();
        diego.nome = "Diego Ferreira";
        diego.cpf = "222.222.333.44";
        diego.profissao = "Programador";

        Conta contaDoDiego = new Conta();
        contaDoDiego.depositar(100);
        contaDoDiego.titular = diego;

        System.out.println(contaDoDiego.titular.nome);

    }
}
