package provaAv2.edu.br;

import java.util.List;
import java.util.ArrayList;

public class Cama {
    // Atributos e construtor
	private int proximoId = 1;

    private int id;
    private String codigoCama;
    private boolean ehBeliche;
    private String posicao;
    private String descricao;

    public Cama(String codigoCama, boolean ehBeliche, String posicao, String descricao) {
        this.setId(proximoId++);
        this.setCodigoCama(codigoCama);
        this.setEhBeliche(ehBeliche);
        this.setPosicao(posicao);
        this.setDescricao(descricao);
    }

    public List<Cama> camas = new ArrayList<>();

    public void incluirCama(Cama cama) {
        camas.add(cama);
    }

    public void alterarCama(int id, Cama novaCama) {
        Cama camaExistente = encontrarCamaPorId(id);
        if (camaExistente != null) {
            camaExistente.setCodigoCama(novaCama.getCodigoCama());
            camaExistente.setEhBeliche(novaCama.isEhBeliche());
            camaExistente.setPosicao(novaCama.getPosicao());
            camaExistente.setDescricao(novaCama.getDescricao());
        }
    }

    public void excluirCama(int idCama) {
        Cama cama = encontrarCamaPorId(idCama);
        if (cama != null) {
            camas.remove(cama);
        }
    }

    public List<Cama> listarCamas() {
        return camas;
    }

    private Cama encontrarCamaPorId(int idCama) {
        for (Cama cama : camas) {
            if (cama.getId() == idCama) {
                return cama;
            }
        }
        return null;
    }

    //getters e setters
	private int getId() {
		// TODO Auto-generated method stub
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCodigoCama() {
		return codigoCama;
	}

	public void setCodigoCama(String codigoCama) {
		this.codigoCama = codigoCama;
	}

	public boolean isEhBeliche() {
		return ehBeliche;
	}

	public void setEhBeliche(boolean ehBeliche) {
		this.ehBeliche = ehBeliche;
	}

	public String getPosicao() {
		return posicao;
	}

	public void setPosicao(String posicao) {
		this.posicao = posicao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}
