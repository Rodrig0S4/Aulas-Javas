package Turma29;

public class OrientaçãoObjeto {

	//declaração dos atributos da classe
	
			private String nome;
			private String end;
			private String telefone;
			private String documento;
			private String email;
			
						
			public OrientaçãoObjeto(String nome, String end, String telefone, String documento, String email){
			
				this.nome = nome;
				this.end = end; // inicializa os atributos da classe Automovel
				this.telefone = telefone;
				this.documento = documento;
				this.email = email;
			
				

	}

			public String getNome() {
				return nome;
			}


			public void setNome(String nome) {
				this.nome = nome;
			}


			public String getEnd() {
				return end;
			}


			public void setEnd(String end) {
				this.end = end;
			}


			public String getTelefone() {
				return telefone;
			}


			public void setTelefone(String telefone) {
				this.telefone = telefone;
			}


			public String getDocumento() {
				return documento;
			}


			public void setDocumento(String documento) {
				this.documento = documento;
			}


			public String getEmail() {
				return email;
			}


			public void setEmail(String email) {
				this.email = email;
			}



 			public void imprimir() {
 			
 			System.out.println("\n Nome do cliente:" +nome);
 			System.out.println("\n Informe seu endereço:" +end);
 			System.out.println("\n Informe seu telefone:" +telefone);
 			System.out.println("\n Informe seu RG ou CPF:" +documento);
 			System.out.println("\n Informe seu e-mail:" +email);
 			
 			}
 			
}