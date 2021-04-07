package elevador;
import java.util.Scanner;

public class Principal {

	//chamarElevador() << chama o elevador
	//entrarElevador() << entra no elevador
	//escolherAndar(int and) << escolhe o andar
	//sairElevador() << sai do elevador
	//alguemPegouElev() << alguem pega o Elevador
	//status() << status do elevador
	
	/*public static void main(String[] args){
		
		Scanner leia = new Scanner(System.in);
		
		Elevador elevator = new Elevador();
		
		int opcao = 0;
		
		System.out.println("BEM VINDO AO SIMULADOR DE ELEVADOR!!!");
		
		do {
			
			System.out.println("DIGITE 1 PARA CHAMAR O ELEVADOR");
			System.out.println("DIGITE 2 PARA ENTRAR NO ELEVADOR");
			System.out.println("DIGITE 3 PARA SAIR DO ELEVADOR");
			System.out.println("DIGITE 4 PARA SABER OS STATUS DO ELEVADOR");
			System.out.println("DIGITE 5 PARA ESCOLHER O ANDAR QUE VOCE QUE IR");
			System.out.println("DIGITE 6 PARA FECHAR!");	
			
			opcao = leia.nextInt();
			
			switch (opcao) {
				
				case 1:
					System.out.println();
					System.out.println("Aguarde enquanto o elevador chega ");
					elevator.chamarElevador();
					System.out.println();
					break;
				
				case 2:
					System.out.println();
					elevator.entrarElevador();;
					System.out.println();
					break;
					
				case 3:
					System.out.println();
					elevator.sairElevador();
					System.out.println();
					break;
					
				case 4:
					System.out.println();
					elevator.status();
					System.out.println();
					break;
					
				case 5:
					System.out.println();
					if(elevator.isInsideElev()) {
						System.out.print("Digite o Andar que voce quer: ");
						int andar = leia.nextInt();
						elevator.escolherAndar(andar);
					}else {
						System.out.println("ERRO! Voce precisa está dentro do elevador!!");
					}							
					System.out.println("");
					break;
					
				case 6:
					System.out.println("");
					System.out.println("Saindo...");
					break;
						
				default: 
					System.out.println("");
					System.out.println("Numero invalido!!");
					System.out.println("");
					break;
				
			}
			
		}while(opcao != 6 );
		
	}*/

}
