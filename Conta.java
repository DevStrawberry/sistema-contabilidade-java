public class Conta {
    private final String nome;
    private double saldo;

    public Conta(String nomeDaConta) {
        this.nome = nomeDaConta;
        this.saldo = 0;
    }

    public String getNome() {
        return this.nome;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public boolean debitar(double valor) {
        if (valor > 0) {
            if (saldo >= valor) {
                this.saldo -= valor;
                System.out.println("Transação registrada e executada com sucesso.");
                return true;
            } else {
                System.out.println("Erro: Saldo insuficiente.");
                return false;
            }
        }
        System.out.println("Erro: Valor do débito deve ser positivo.");
        return false;
    }

    public boolean creditar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            return true;
        }
        System.out.println("Erro: Valor do crédito deve ser positivo.");
        return false;
    }
}
