package bytebankEncapsulado;

public class Conta {
    private double saldo;
    private int agencia, numero;
    private Cliente titular;

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

    public double getSaldo(){
        return this.saldo;
    }

    public int getNumero(){
        return this.numero;
    }
    public void setNumero(int numero){
        this.numero = numero;
    }


    public int getAgencia() {
        return this.agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }
}
