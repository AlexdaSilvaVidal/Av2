package provaAv2.edu.br;

import java.util.Scanner;

public class Menu {
    private Principal principal;

    public Menu(Principal principal) {
        this.principal = principal;
    }

    public void gerenciarClientes(Scanner scanner) {
        int opcaoClientes;
        do {
            System.out.println("===== Menu de Clientes =====");
            System.out.println("1. Incluir Cliente");
            System.out.println("2. Alterar Cliente");
            System.out.println("3. Excluir Cliente");
            System.out.println("4. Listar Clientes");
            System.out.println("0. Voltar");
            System.out.print("Escolha uma opção: ");

            opcaoClientes = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            switch (opcaoClientes) {
                case 1:
                    principal.getClientes().incluirCliente(scanner);
                    break;
                case 2:
                    principal.getClientes().alterarCliente(scanner);
                    break;
                case 3:
                    principal.getClientes().excluirCliente(scanner);
                    break;
                case 4:
                    principal.getClientes().listarClientes();
                    break;
                case 0:
                    System.out.println("Retornando ao menu principal.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (opcaoClientes != 0);
    }

    // Métodos relacionados a outras funcionalidades (quartos, camas, reservas, etc.)
}
