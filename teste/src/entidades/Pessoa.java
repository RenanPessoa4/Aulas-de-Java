package entidades;
public class Pessoa {
		
		private String nome;
		private String telefone;
		private static int anoNasc;
		private String enderešo;
		public Pessoa(String nome, char telefone, int anoNasc, String enderešo) {
			super();
			this.nome = nome;
		}
		
			
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getEnderešo() {
			return enderešo;
		}
		public void setEnderešo(String enderešo) {
			this.enderešo = enderešo;
		}


	
		public Pessoa(String nome, String telefone, int anoNasc, String enderešo) {
			super();
			this.nome = nome;
			this.telefone = telefone;
			this.setAnoNasc(anoNasc);
			this.enderešo = enderešo;
		}


		private void setAnoNasc(int anoNasc) {
			
			
		}


		public static int getAnoNasc() {
			return anoNasc;
		}


		//*public Pessoa(String nome2, String endereco2, String telefone2) {
			
	


		//public int getAnoNasc() {
			///return anoNasc;
		//}


		//public void setAnoNasc(int anoNasc) {
		//	//anoNasc = //anoNasc;//
		//}
		
		
		
		








}
