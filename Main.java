import java.util.Scanner;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        LivroRazao meuLivroRazao = new LivroRazao();
        Scanner sc = new Scanner(System.in);

        System.out.println("Iniciando aplicação...");
        while (true){
            int opcao = lerOpcao(sc);

            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome da nova conta: ");
                    String nomeConta = sc.next();
                    Conta novaConta = new Conta(nomeConta);
                    meuLivroRazao.adicionarConta(novaConta);
                    System.out.println("Deseja fazer um depósito inicial para a conta " + nomeConta + "? (s/n):");
                    char querDepositoInicial = sc.next().toLowerCase().charAt(0);
                    if (querDepositoInicial != 's') {
                        break;
                    } else {
                        System.out.println("Digite o valor do depósito inical: ");
                        double valorDepositoInical = sc.nextDouble();
                        novaConta.creditar(valorDepositoInical);
                    }
                    break;
                case 2:
                    System.out.println("Digite a descrição da transação: ");
                    sc.nextLine();
                    String descricao = sc.nextLine();

                    System.out.println("Digite o valor: ");
                    double valor = sc.nextDouble();

                    System.out.println("Digite o nome da conta de origem: ");
                    sc.nextLine();
                    String nomeOrigem = sc.nextLine();

                    System.out.println("Digite o nome da conta de destino: ");
                    String nomeDestino = sc.nextLine();

                    Conta contaOrigem = meuLivroRazao.buscarConta(nomeOrigem);
                    Conta contaDestino = meuLivroRazao.buscarConta(nomeDestino);

                    if (contaOrigem != null && contaDestino != null) {
                        Transacao novaTransacao = new Transacao(LocalDate.now(), descricao, valor, contaOrigem, contaDestino);
                        meuLivroRazao.registrarTransacao(novaTransacao);
                    } else {
                        System.out.println("Erro: uma ou ambas as contas não foram encontradas.");
                    }
                    break;
                case 3:
                    meuLivroRazao.exibirSaldos();
                    break;
                case 4:
                    meuLivroRazao.exibirTransacoes();
                    break;
                default:
                    System.out.println("Opção inválida");
            }

            System.out.print("Deseja fazer outra operação? (s/n): ");
            char continuar = sc.next().toLowerCase().charAt(0);
            if (continuar != 's') break;
        }
        sc.close();
        System.out.println("Encerrando aplicação...");
    }

    static int lerOpcao(Scanner scanner){
        System.out.println("\nOpções disponíveis: ");
        System.out.println("1 - Adicionar Conta");
        System.out.println("2 - Adicionar Transação");
        System.out.println("3 - Exibir Saldo");
        System.out.println("4 - Exibir Transações");
        System.out.println("Escolha a opção (1-4): ");
        return scanner.nextInt();
    }
}
