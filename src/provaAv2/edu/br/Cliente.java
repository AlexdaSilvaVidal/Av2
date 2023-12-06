package provaAv2.edu.br;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Cliente {
    private  int proximoId = 1;

    private int id;
    private String nome;
    private String endereco;
    private String postalCode;
    private String pais;
    private String cpf;
    private String passaporte;
    private String email;
    private Date dataNascimento;

    public Cliente(String nome, String endereco, String postalCode, String pais, String cpf, String passaporte,
            String email, Date dataNascimento) {
        this.setId(proximoId++);
        this.setNome(nome);
        this.setEndereco(endereco);
        this.setPostalCode(postalCode);
        this.setPais(pais);
        this.setCpf(cpf);
        this.setPassaporte(passaporte);
        this.setEmail(email);
        this.setDataNascimento(dataNascimento);
    }

    public List<Cliente> clientes = new ArrayList<>();

    public void incluirCliente(Scanner scanner) {
        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("Endereço: ");
        String endereco = scanner.nextLine();

        System.out.print("Código Postal: ");
        String postalCode = scanner.nextLine();

        System.out.print("País: ");
        String pais = scanner.nextLine();

        System.out.print("CPF: ");
        String cpf = scanner.nextLine();

        System.out.print("Passaporte: ");
        String passaporte = scanner.nextLine();

        System.out.print("Email: ");
        String email = scanner.nextLine();

        System.out.print("Data de Nascimento (dd/MM/yyyy): ");
        String dataNascimentoStr = scanner.nextLine();

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date dataNascimento;
        try {
            dataNascimento = sdf.parse(dataNascimentoStr);
        } catch (ParseException e) {
            System.out.println("Formato de data inválido. Cliente não incluído.");
            return;
        }

        Cliente cliente = new Cliente(nome, endereco, postalCode, pais, cpf, passaporte, email, dataNascimento);
        clientes.add(cliente);
        System.out.println("Cliente incluído com sucesso!");
    }

    public void alterarCliente(Scanner scanner) {
        System.out.print("Informe o ID do Cliente que deseja alterar: ");
        int idCliente = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha

        Cliente clienteExistente = encontrarClientePorId(idCliente);
        if (clienteExistente != null) {
            System.out.println("Digite os novos dados do Cliente:");

            System.out.print("Nome: ");
            String nome = scanner.nextLine();

            System.out.print("Endereço: ");
            String endereco = scanner.nextLine();

            System.out.print("Código Postal: ");
            String postalCode = scanner.nextLine();

            System.out.print("País: ");
            String pais = scanner.nextLine();

            System.out.print("CPF: ");
            String cpf = scanner.nextLine();

            System.out.print("Passaporte: ");
            String passaporte = scanner.nextLine();

            System.out.print("Email: ");
            String email = scanner.nextLine();

            System.out.print("Data de Nascimento (dd/MM/yyyy): ");
            String dataNascimentoStr = scanner.nextLine();

            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            Date dataNascimento;
            try {
                dataNascimento = sdf.parse(dataNascimentoStr);
            } catch (ParseException e) {
                System.out.println("Formato de data inválido. Cliente não alterado.");
                return;
            }

            clienteExistente.setNome(nome);
            clienteExistente.setEndereco(endereco);
            clienteExistente.setPostalCode(postalCode);
            clienteExistente.setPais(pais);
            clienteExistente.setCpf(cpf);
            clienteExistente.setPassaporte(passaporte);
            clienteExistente.setEmail(email);
            clienteExistente.setDataNascimento(dataNascimento);

            System.out.println("Cliente alterado com sucesso!");
        } else {
            System.out.println("Cliente não encontrado.");
        }
    }

    public void excluirCliente(Scanner scanner) {
        System.out.print("Informe o ID do Cliente que deseja excluir: ");
        int idCliente = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha

        Cliente cliente = encontrarClientePorId(idCliente);
        if (cliente != null) {
            clientes.remove(cliente);
            System.out.println("Cliente excluído com sucesso!");
        } else {
            System.out.println("Cliente não encontrado.");
        }
    }

    public List<Cliente> listarClientes() {
        System.out.println("===== Lista de Clientes =====");
        for (Cliente cliente : clientes) {
            System.out.println("ID: " + cliente.getId());
            System.out.println("Nome: " + cliente.getNome());
            System.out.println("CPF: " + cliente.getCpf());
            System.out.println("Endereço: " + cliente.getEndereco());
            System.out.println("Código Postal: " + cliente.getPostalCode());
            System.out.println("País: " + cliente.getPais());
            System.out.println("Passaporte: " + cliente.getPassaporte());
            System.out.println("Email: " + cliente.getEmail());
            System.out.println("Data de Nascimento: " + cliente.getDataNascimento());
            System.out.println("=============================");
        }
        return clientes;
    }

    private Cliente encontrarClientePorId(int idCliente) {
        for (Cliente cliente : clientes) {
            if (cliente.getId() == idCliente) {
                return cliente;
            }
        }
        return null;
    }
//getters e setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getPassaporte() {
		return passaporte;
	}

	public void setPassaporte(String passaporte) {
		this.passaporte = passaporte;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
