package provaAv2.edu.br;

import java.util.List;
import java.util.ArrayList;
import java.util.Date;

public class Reserva {
    // Atributos e construtor
	private static int proximoId = 1;

    private int id;
    private int idQuarto;
    private int idCama;
    private int idCliente;
    private Date dataEntrada;
    private Date dataSaida;

    public Reserva(int idQuarto, int idCama, int idCliente, Date dataEntrada, Date dataSaida) {
        this.setId(proximoId++);
        this.setIdQuarto(idQuarto);
        this.setIdCama(idCama);
        this.setIdCliente(idCliente);
        this.setDataEntrada(dataEntrada);
        this.setDataSaida(dataSaida);
    }

    public static List<Reserva> reservas = new ArrayList<>();

    public static void realizarReserva(Reserva reserva) {
        reservas.add(reserva);
    }

    public static void alterarReserva(int id, Reserva novaReserva) {
        Reserva reservaExistente = encontrarReservaPorId(id);
        if (reservaExistente != null) {
            reservaExistente.setIdQuarto(novaReserva.getIdQuarto());
            reservaExistente.setIdCama(novaReserva.getIdCama());
            reservaExistente.setIdCliente(novaReserva.getIdCliente());
            reservaExistente.setDataEntrada(novaReserva.getDataEntrada());
            reservaExistente.setDataSaida(novaReserva.getDataSaida());
        }
    }

    public static void excluirReserva(int idReserva) {
        Reserva reserva = encontrarReservaPorId(idReserva);
        if (reserva != null) {
            reservas.remove(reserva);
        }
    }

    public static List<Reserva> listarReservas() {
        return reservas;
    }

    private static Reserva encontrarReservaPorId(int idReserva) {
        for (Reserva reserva : reservas) {
            if (reserva.getId() == idReserva) {
                return reserva;
            }
        }
        return null;
    }

	private int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIdQuarto() {
		return idQuarto;
	}

	public void setIdQuarto(int idQuarto) {
		this.idQuarto = idQuarto;
	}

	public int getIdCama() {
		return idCama;
	}

	public void setIdCama(int idCama) {
		this.idCama = idCama;
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public Date getDataSaida() {
		return dataSaida;
	}

	public void setDataSaida(Date dataSaida) {
		this.dataSaida = dataSaida;
	}

	public Date getDataEntrada() {
		return dataEntrada;
	}

	public void setDataEntrada(Date dataEntrada) {
		this.dataEntrada = dataEntrada;
	}
}