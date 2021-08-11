package Turma29;

	import java.util.ArrayList;
	import java.util.Scanner;

	public class Ex3Colecao {

		

		public static void main(String[] args) {
			// TODO Auto-generated method stub

			int inst;
			
			Scanner leia = new Scanner(System.in);
			
			ArrayList<String> biblioteca = new ArrayList();
			
			do
			{				
				System.out.println("\n\t\tEscolha uma opção do Menu. ");
				System.out.println("--------------------------------------------");
				System.out.println("\n(1) Adicione itens para sua biblioteca..."
						+ "\n(2) Remova produtos do seu biblioteca."
						+ "\n(3) Atualize um produto da sua biblioteca"
						+ "\n(4) Listar produtos da biblioteca"
						+ "\n(0) Finalize o programa.");
				System.out.println("--------------------------------------------");
				System.out.println("\n\t\tDigite a opção desejada ");
				inst = leia.nextInt();
				
				switch(inst)
				{
				
				case 1:
					
					leia.nextLine();
					System.out.println("\nDigite um produto para adicionar à biblioteca: ");
					String produto = leia.nextLine();
					biblioteca.add(produto);
					
					break;
					
				case 2:
					leia.nextLine();
					System.out.println("\nDigite um produto para remover da biblioteca: ");
					String produtor = leia.nextLine();
					
					if(biblioteca.contains(produtor))
					{
						biblioteca.remove(produtor);
					}
					
					else
					{
						
						System.out.println("\nProduto não existe ou não cadastrado!");
					}
					break;
					
				case 3:
					
					leia.nextLine(); //limpa o buffer de memória
					System.out.println("\nDigite o produto que deseja atualizar: ");
					String examine = leia.nextLine();
					System.out.println("\nDigite o nome do produto que será colocado no lugar do produto "+examine+" : ");
					String novo = leia.nextLine();
					
					if(biblioteca.contains(examine))
					{
						biblioteca.remove(examine);
						biblioteca.add(novo);
					}
					
					else						
					{
						System.out.println("\nProduto não existe no estoque!!!");
					}
					System.out.println("\n"+biblioteca);
					
					break;
				
				case 4:
										
					System.out.println("\nProdutos do estoque: ");
					System.out.println("\n"+biblioteca);
					break;
					
					default:
						System.out.println("\nPrograma Finalizado!!! ");
						
				}
				
			}while(inst!=0);
		}

	}
