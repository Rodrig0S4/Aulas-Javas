//3) Crie uma classe produto eletrônico e apresente os atributos e métodos
//referentes esta classe, em seguida crie um objeto produto eletrônico,
//defina as instancias deste objeto e apresente as informações deste objeto
//no console.

package Turma29;

public class OrientaçãoObjeto3 {

	private String produto;
	private String eletroEletronicos;
	private String eletroDomesticos;
	
	public OrientaçãoObjeto3(String produto, String eletroEletronicos, String eletroDomesticos){
		
		this.produto = produto;
		this.eletroEletronicos = eletroEletronicos; //Classificação de produtos de uso doméstico...
		this.eletroDomesticos = eletroDomesticos;

				
	}

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public String getEletroEletronicos() {
		return eletroEletronicos;
	}

	public void setEletroEletronicos(String eletroEletronicos) {
		this.eletroEletronicos = eletroEletronicos;
	}

	public String getEletroDomesticos() {
		return eletroDomesticos;
	}

	public void setEletroDomesticos(String eletroDomesticos) {
		this.eletroDomesticos = eletroDomesticos;
	}


		public void imprimir () {
		
		System.out.println("\n"+produto);
		System.out.println("\n"+eletroEletronicos);
		System.out.println("\n"+eletroDomesticos);
		
		
		
	}
		
		
		
}	
