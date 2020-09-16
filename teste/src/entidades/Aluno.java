package entidades;
public class Aluno extends Pessoa
{
	private String turma;
	private double notas[] = new double[2];
	public Aluno(String nome, char telefone, int anoNasc, String endereço, String turma )
	{
		super(nome, telefone, anoNasc, endereço);
		this.turma = turma;
		
	}
	public String getTurma() {
		return turma;
	}
	public void setTurma(String turma) {
		this.turma = turma;
	}

}
	/*private String nome; // nome
	private char sexo; // sexo M OU F
	private int anoNasc; // valor inteiro
	private String etnia; // ETNIA - texto
	private String turma;
	private int notas[] = new int[2];
	
	//**/


