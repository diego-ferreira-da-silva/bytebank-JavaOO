package bytebankEncapsulado;

public class Conta {
    private double saldo;
    private int agencia, numero;
    private Cliente titular;
    private static int total;

    public Conta(int agencia, int numero){
        total++;
        //System.out.println("O total de contas é: " + total);
        this.agencia = agencia;
        this.numero = numero;
        //System.out.println("Estou criando uma conta " + this.numero);
    }

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
        if (numero <= 0){
            System.out.println("Não pode valor <= 0");
            return;
        }
        this.numero = numero;
    }


    public int getAgencia() {
        return this.agencia;
    }

    public void setAgencia(int agencia) {
        if(agencia <= 0){
            System.out.println("Não pode valor menor igual a 0");
            return;
        }
        this.agencia = agencia;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public static int getTotal(){
        return total;
    }
}
