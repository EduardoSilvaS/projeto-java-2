import java.util.Scanner;

public class TestaProduto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("Menu:");
            System.out.println("1- Criar produto");
            System.out.println("2- Criar produto perecível");
            System.out.println("3- Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite a descrição do produto: ");
                    String descricaoProduto = scanner.next();
                    System.out.print("Digite o valor do produto: ");
                    double valorProduto = scanner.nextDouble();

                    Produto produto = new Produto(descricaoProduto, valorProduto);
                    System.out.println("Produto criado com sucesso:\n" + produto);
                    break;
                case 2:
                    System.out.print("Digite a descrição do produto perecível: ");
                    String descricaoPerecivel = scanner.next();
                    System.out.print("Digite o valor do produto perecível: ");
                    double valorPerecivel = scanner.nextDouble();
                    System.out.print("Digite a data de validade (dia mês ano): ");
                    int dia = scanner.nextInt();
                    int mes = scanner.nextInt();
                    int ano = scanner.nextInt();

                    int[] validade = {dia, mes, ano};
                    Perecivel produtoPerecivel = new Perecivel(descricaoPerecivel, valorPerecivel, validade);
                    System.out.println("Produto perecível criado com sucesso:\n" + produtoPerecivel);

                    if (produtoPerecivel.estaVencido()) {
                        System.out.println("Este produto está vencido.");
                    } else {
                        System.out.println("Este produto não está vencido.");
                    }

                    produtoPerecivel.aplicaDesconto( 15);
                    System.out.println("Produto com desconto de 15% aplicado:\n" + produtoPerecivel);
                    break;
                case 3:
                    System.out.println("Encerrando o programa.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 3);

        scanner.close();
    }
}