package bytebankEncapsulado;

public class TestaValores {
    public static void main(String[] args) {
        Conta conta = new Conta(1337, 24228);

        //System.out.println(conta.getAgencia());

        Conta conta2 = new Conta(1337, 56889);
        Conta conta3 = new Conta(1337, 44896);


        System.out.println("O Total de contas abertas é: " + Conta.getTotal());
    }
}
