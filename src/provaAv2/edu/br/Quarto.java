// Classe Quarto
package provaAv2.edu.br;

import java.util.List;
import java.util.ArrayList;

public class Quarto {
    // Atributos e construtor
	private int proximoId = 1;

    private int id;
    private String nomeQuarto;
    private int qtdeCamas;
    private boolean temBanheiro;
    private String descricao;

    public Quarto(String nomeQuarto, int qtdeCamas, boolean temBanheiro, String descricao) {
        this.setId(proximoId++);
        this.setNomeQuarto(nomeQuarto);
        this.setQtdeCamas(qtdeCamas);
        this.setTemBanheiro(temBanheiro);
        this.setDescricao(descricao);
    }

    public List<Quarto> quartos = new ArrayList<>();

    public void incluirQuarto(Quarto quarto) {
        quartos.add(quarto);
    }

    public void alterarQuarto(int id, Quarto novoQuarto) {
        Quarto quartoExistente = encontrarQuartoPorId(id);
        if (quartoExistente != null) {
            quartoExistente.setNomeQuarto(novoQuarto.getNomeQuarto());
            quartoExistente.setQtdeCamas(novoQuarto.getQtdeCamas());
            quartoExistente.setTemBanheiro(novoQuarto.isTemBanheiro());
            quartoExistente.setDescricao(novoQuarto.getDescricao());
        }
    }

    public void excluirQuarto(int idQuarto) {
        Quarto quarto = encontrarQuartoPorId(idQuarto);
        if (quarto != null) {
            quartos.remove(quarto);
        }
    }

    public  List<Quarto> listarQuartos() {
        return quartos;
    }

    private  Quarto encontrarQuartoPorId(int idQuarto) {
        for (Quarto quarto : quartos) {
            if (quarto.getId() == idQuarto) {
                return quarto;
            }
        }
        return null;
    }
    
//getter and setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNomeQuarto() {
		return nomeQuarto;
	}

	public void setNomeQuarto(String nomeQuarto) {
		this.nomeQuarto = nomeQuarto;
	}

	public int getQtdeCamas() {
		return qtdeCamas;
	}

	public void setQtdeCamas(int qtdeCamas) {
		this.qtdeCamas = qtdeCamas;
	}

	public boolean isTemBanheiro() {
		return temBanheiro;
	}

	public void setTemBanheiro(boolean temBanheiro) {
		this.temBanheiro = temBanheiro;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}
