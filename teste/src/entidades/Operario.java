package entidades;
public class Operario extends Pessoa {
	
	private double valorProducao;
	private double comissao;
	public Operario(String nome, String endereco, String telefone, double valorProducao, double comissao) {
		super(nome, endereco, getAnoNasc(), telefone);
		this.valorProducao = valorProducao;
		this.comissao = comissao;
	}

	public static int getAnoNasc() {
		return 0;
	}

	public double getValorProducao() {
		return valorProducao;
	}

	public void setValorProducao(double valorProducao) {
		this.valorProducao = valorProducao;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	
	public double valorFinal() {
		double valor = (this.valorProducao + (this.valorProducao * this.comissao));
		return valor;
	}
}