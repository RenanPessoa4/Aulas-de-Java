package entidades;

public class Vendedor extends Pessoa {
	
	private double valorVendas; 
	private double comissao;
	
	public Vendedor(String nome, String endereco, String telefone, double valorVendas, double comissao) {
		super(nome, endereco, getAnoNasc(), telefone);
		this.valorVendas = valorVendas;
		this.comissao = comissao;
	}

	public double getValorVendas() {
		return valorVendas;
	}

	public void setValorVendas(double valorVendas) {
		this.valorVendas = valorVendas;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	
	public double finalVendas() {
		double valor = (this.valorVendas + (this.valorVendas * this.comissao));
		return valor;
	

}
}