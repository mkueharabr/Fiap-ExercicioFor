import java.util.Scanner;

public class ChecarDesculpaRodizio {

	public static void main(String[] args) {
		/*
		 * Checar se a placa do veiculo do funcionário foi afetado pelo rodízio de carros do dia
		 * 
		 * Para todos os 150 funcionários, solicitar:
		 * 
		 * 		. Nome do funcionário
		 * 		. Setor
		 * 		. Meio de transporte (carro ou ônibus)
		 * 
		 * Ações:
		 * 
		 * 		1) Caso o funcionário use carro, checar se o último dígito corresponde ao rodízio. Caso
		 * 			seja afirmativo, mostrar a frase: "Seu dia de rodízio é", seguida do dia de rodízio.
		 * 
		 * 		2) Caso o funcionário utilize um ônibus, mostrar a mensagem: "Rodízio não se aplica"
		 */
		
		Scanner leitor = new Scanner(System.in);
		
		int numFuncionarios;
		int meioTransporte, finalPlaca;
		String nomeFuncionario; 
		String setor;
		String diaDaSemana;
		
		System.out.println("Número de funcionários: ");
		numFuncionarios = leitor.nextInt();
		
		for(int i = 1; i <= numFuncionarios; i++) {
			System.out.println("Contagem de funcionarios: " + i);
			System.out.println("");
			
			System.out.println("Nome: ");
			nomeFuncionario = leitor.next();
			
			System.out.println("Setor: ");
			setor = leitor.next();
			
			System.out.println("Meio de transporte (1-Carro, 2-Ônibus): ");
			meioTransporte = leitor.nextInt();
			
			if(meioTransporte == 1) {
				finalPlaca = -1;
				
				while(!(finalPlaca >= 0 && finalPlaca <=9)) {
					System.out.println("Informe o final da placa (0-9): ");
					finalPlaca = leitor.nextInt();	
				}
						
				switch (finalPlaca) {
				case 1:
				case 2:
					diaDaSemana = "segunda-feira";
					break;
					
				case 3:
				case 4:
					diaDaSemana = "terça-feira";
					break;
					
				case 5:
				case 6:
					diaDaSemana = "quarta-feira";
					break;
					
				case 7:
				case 8:
					diaDaSemana = "quinta-feira";
					break;
					
				case 9:
				case 0:
					diaDaSemana = "sexta-feira";
					break;
					
				default:
					diaDaSemana = "não se aplica";
				}
				
				System.out.println("Seu dia de rodízio é: " + diaDaSemana);
				

			} else {
				System.out.println("Rodízio não se aplica!");
			}
			
			System.out.println("");
			System.out.println("-----------------------------------------------------");
			System.out.println("");
			
		}
		
		
		leitor.close();
		
	}

}
