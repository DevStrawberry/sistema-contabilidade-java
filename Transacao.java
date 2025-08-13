import java.time.LocalDate;

public class Transacao {
    private final LocalDate data;
    private final String descricao;
    private final double valor;
    private final Conta contaOrigem;
    private final Conta contaDestino;

    public Transacao(LocalDate data, String descricao, double valor, Conta contaOrigem, Conta contaDestino) {
        this.data = data;
        this.descricao = descricao;
        this.valor = valor;
        this.contaOrigem = contaOrigem;
        this.contaDestino = contaDestino;
    }

    public void executar(){
        if (this.contaOrigem.debitar(this.valor)) {
            this.contaDestino.creditar(this.valor);
        }
    }

    public LocalDate getData() {
        return this.data;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public double getValor() {
        return this.valor;
    }

    public Conta getContaOrigem() {
        return this.contaOrigem;
    }

    public Conta getContaDestino() {
        return this.contaDestino;
    }
}
