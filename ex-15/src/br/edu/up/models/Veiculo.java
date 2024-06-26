package br.edu.up.models;

public class Veiculo {
	private String tipoCombustivel;
	private double valor;

	public Veiculo(String tipoCombustivel, double valor) {
		this.tipoCombustivel = tipoCombustivel;
		this.valor = valor;
	}

	public String getTipoCombustivel() {
		return tipoCombustivel;
	}

	public double getValor() {
		return valor;
	}

	public double calcularDesconto() {
		double desconto = 0;
		if (tipoCombustivel.equals("alcool")) {
			desconto = valor * 0.25;
		} else if (tipoCombustivel.equals("gasolina")) {
			desconto = valor * 0.21;
		} else if (tipoCombustivel.equals("diesel")) {
			desconto = valor * 0.14;
		}
		return desconto;
	}

	public double calcularValorPago() {
		return valor - calcularDesconto();
	}
}
