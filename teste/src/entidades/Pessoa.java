package entidades;
public class Pessoa {
		
		private String nome;
		private String telefone;
		private static int anoNasc;
		private String endere�o;
		public Pessoa(String nome, char telefone, int anoNasc, String endere�o) {
			super();
			this.nome = nome;
		}
		
			
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getEndere�o() {
			return endere�o;
		}
		public void setEndere�o(String endere�o) {
			this.endere�o = endere�o;
		}


	
		public Pessoa(String nome, String telefone, int anoNasc, String endere�o) {
			super();
			this.nome = nome;
			this.telefone = telefone;
			this.setAnoNasc(anoNasc);
			this.endere�o = endere�o;
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
