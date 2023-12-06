package provaAv2.edu.br;

import java.util.Scanner;

public class Principal {
    private Menu menu;
    private Cliente clientes;

    public Principal() {
        this.menu = new Menu(this);
        this.clientes = new Cliente(null, null, null, null, null, null, null, null);
    }

    public static void main(String[] args) {
        Principal principal = new Principal();
        principal.menuPrincipal();
    }

    public void menuPrincipal() {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("===== Menu Principal =====");
            System.out.println("1. Gerenciar Clientes");
            System.out.println("2. Gerenciar Quartos");
            System.out.println("3. Gerenciar Camas");
            System.out.println("4. Gerenciar Reservas");
            System.out.println("5. Consultar Disponibilidades");
            System.out.println("6. Cancelar Reserva");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            switch (opcao) {
                case 1:
                    menu.gerenciarClientes(scanner);
                    break;
                /*case 2:
                    menu.gerenciarQuartos(scanner);
                    break;
                case 3:
                    menu.gerenciarCamas(scanner);
                    break;
                case 4:
                    menu.gerenciarReservas(scanner);
                    break;*/
                case 0:
                    System.out.println("Encerrando o programa. Até mais!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (opcao != 0);
    }

	public Cliente getClientes() {
		return clientes;
	}

	public void setClientes(Cliente clientes) {
		this.clientes = clientes;
	}
}
