package conversorparanumeroromano;

import java.util.Scanner;

public class Menu {
	public Menu(){}
	
	public void inicializar() {
		Scanner scanner =new Scanner(System.in);
		int opcao = -1;
		String numeroAConverter;
		String numeroConvertido1;
		int numeroConvertido2;
		ConversorParaNumeroRomano converterRomano = new ConversorParaNumeroRomano();
		ConversorParaNumeroArabico converterArabico = new ConversorParaNumeroArabico();
		
		while(opcao != 0) {
			System.out.println("**Menu de Seleção**");
			System.out.println("[1] Converter de Arabico para Romano");
			System.out.println("[2] Converter de Romano para Arabico");
			System.out.println("[0] Sair");
			System.out.print("Digite sua opcao: ");
			opcao = scanner.nextInt();
			scanner.nextLine();
		
			switch(opcao) {
				case 1:
					System.out.print("Digite o numero a converter: ");
					numeroAConverter = scanner.nextLine();
					numeroConvertido1 = converterRomano.converteParaRomano(numeroAConverter);
					System.out.println(numeroConvertido1);
					break;
				case 2:
					System.out.print("Digite o numero a converter: ");
					numeroAConverter = scanner.nextLine();
					numeroConvertido2 = converterArabico.converteParaArabico(numeroAConverter);
					System.out.println(numeroConvertido2);
					break;
				case 0:
					System.out.print("Tchau!");
					break;
		}
		}
	}
}
