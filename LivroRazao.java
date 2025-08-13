import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

public class LivroRazao {
    private final Map<String, Conta> contas;
    private final List<Transacao> transacoes;

    public LivroRazao() {
        this.contas = new HashMap<>();
        this.transacoes = new ArrayList<>();
    }

    public void adicionarConta(Conta novaConta) {
        String nomeDaConta = novaConta.getNome();

        if (contas.containsKey(nomeDaConta)) {
            System.out.println("Erro: A conta " + nomeDaConta + " já existe.");
        } else {
            this.contas.put(nomeDaConta, novaConta);
            System.out.println("Conta '" + nomeDaConta + "' adicionada com sucesso.");
        }
    }

    public void registrarTransacao(Transacao novaTransacao) {
        this.transacoes.add(novaTransacao);
        novaTransacao.executar();
        System.out.println("Transação registrada e executada com sucesso.");
    }

    public void exibirSaldos() {
        System.out.println("---Saldos das Contas---");
        for (Conta conta : contas.values()) {
            System.out.println("Conta: " + conta.getNome() + " | Saldo: " + conta.getSaldo());
        }
    }

    public void exibirTransacoes() {
        System.out.println("---Transacoes---");
        for (Transacao transacao : transacoes) {
            System.out.println("------------------------------------");
            System.out.println("Data: " + transacao.getData());
            System.out.println("Descrição: " + transacao.getDescricao());
            System.out.println("Valor: R$ " + transacao.getValor());
            System.out.println("Conta Origem: " + transacao.getContaOrigem().getNome());
            System.out.println("Conta Destino: " + transacao.getContaDestino().getNome());
        }
        System.out.println("------------------------------------");
    }

    public Conta buscarConta(String nomeConta) {
        return this.contas.get(nomeConta);
    }
}

