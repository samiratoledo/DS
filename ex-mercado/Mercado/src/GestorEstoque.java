import java.util.*;

public class GestorEstoque {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> estoque = new ArrayList<>();
        int opcao = 1;
        String produto;

        while (opcao != 0) {
            System.out.println("\n--- GESTOR DE ESTOQUE ---");
            System.out.println("1. Adicionar Produto");
            System.out.println("2. Listar Produtos");
            System.out.println("3. Remover Produto");
            System.out.println("4. Buscar Produto");
            System.out.println("0. Sair");

            System.out.print("Escolha: ");
            opcao = sc.nextInt();
            sc.nextLine(); // Limpar buffer

            switch (opcao) {
                case 1:
                    // TODO: Implementar Adição
                    System.out.println("1. Adicionar Produto");
                    System.out.println("Digite o nome do produto: ");
                    String item = sc.nextLine();
                    item = item.toUpperCase();

                    if (estoque.contains(item)) {
                        System.out.println("Produto já cadastrado");
                    } else {
                        estoque.add(item);
                        System.out.println("Produto cadastrado com sucesso!");
                    }

                    Collections.sort(estoque);
                    break;

                case 2:
                    // TODO: Implementar Listagem
                    System.out.println("2. Listar Produtos");
                    if (estoque.isEmpty()) {
                        System.out.println("Estoque vazio");
                    } else {
                        for (String est : estoque) {
                            int pos = estoque.indexOf(est) + 1;
                            System.out.println(pos + ". " + est);
                        }
                    }
                    break;

                case 3:
                    // TODO: Implementar Remoção
                    System.out.println("3. Remover Produto");
                    System.out.println("Digite o nome do produto: ");
                    produto = sc.nextLine();
                    produto = produto.toUpperCase();

                    if (estoque.contains(produto)) {
                        estoque.remove(produto);
                        System.out.println("Produto " + produto + " encontrado e removido com sucesso");
                    } else {
                        System.out.println("Produto não encontrado");
                    }
                    break;
                case 4:
                    // TODO: Implementar Busca
                    System.out.println("4. Buscar Produto");
                    System.out.println("Digite o nome do produto: ");
                    produto = sc.nextLine();
                    produto = produto.toUpperCase();
                    if (estoque.contains(produto)) {
                        int pos = estoque.indexOf(produto) + 1;
                        System.out.println("Produto encontrado no estoque! Produto: " + produto + ". Posição: " + pos);
                    }
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        }
        sc.close();
    }
}