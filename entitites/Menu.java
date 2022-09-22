package entitites;

import java.util.Scanner;
import exceptions.NumeroInvalido;
import utils.ConversorParaNumeroArabico;
import utils.ConversorParaNumeroRomano;

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
					try {
						numeroAConverter = scanner.nextLine();
						if(Integer.parseInt(numeroAConverter) == 0) {
							throw new NumeroInvalido("Digite um numero diferente de 0");
						}
						numeroConvertido1 = converterRomano.converteParaRomano(numeroAConverter);
						System.out.println(numeroConvertido1);
						} catch (NumeroInvalido e) {
							System.out.println(e.getMessage());
						}
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
		scanner.close();
		}
	}
}

