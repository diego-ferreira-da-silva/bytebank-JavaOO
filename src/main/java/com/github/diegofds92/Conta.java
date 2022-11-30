package com.github.diegofds92;

public class Conta {
    double saldo;
    int agencia, numero;
    Cliente titular;

    public void depositar(double valorDepositar){
        this.saldo += valorDepositar;
    }

    public boolean sacar(double valorSacar){
        if(this.saldo >= valorSacar){
            this.saldo -= valorSacar;
            return true;
        }else{
            return false;
        }
    }

    public boolean transfere(double valor, Conta destino){
        if(this.saldo >= valor){
            this.saldo -= valor;
            destino.depositar(valor);
            return true;
        }else{
            return false;
        }
    }


}
