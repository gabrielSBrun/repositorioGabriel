package conversorparanumeroromano;

public class ConversorParaNumeroArabico {
	
	public ConversorParaNumeroArabico(){}
	
	public int converteParaArabico(String numeroRomano) {
		
		int numeroArabico = 0;
		String numerosEspeciais = numeroRomano;
		
		while(numerosEspeciais.length() >= 2) {
			String numeroAConverter = numerosEspeciais.substring(0,2);
			if(numeroAConverter.contentEquals("CM")) {
				numeroArabico += 900;
				numeroRomano = numeroRomano.replace("CM","");
			} else if(numeroAConverter.contentEquals("CD")) {
				numeroArabico += 400;
				numeroRomano = numeroRomano.replace("CD","");
			} else if(numeroAConverter.contentEquals("XC")) {
				numeroArabico += 90;
				numeroRomano = numeroRomano.replace("XC","");
			} else if(numeroAConverter.contentEquals("XL")) {
				numeroArabico += 40;
				numeroRomano = numeroRomano.replace("XL","");
			} else if(numeroAConverter.contentEquals("IX")) {
				numeroArabico += 9;
				numeroRomano = numeroRomano.replace("IX","");
			} else if(numeroAConverter.contentEquals("IV")) {
				numeroArabico += 4;
				numeroRomano = numeroRomano.replace("IV","");
			}
			numerosEspeciais = numerosEspeciais.substring(1);
		}
		
		while(numeroRomano.length() > 0) {
			String numeroAConverter = Character.toString(numeroRomano.charAt(0));
			if(numeroAConverter.contentEquals("M")) {
				numeroArabico += 1000;
				numeroRomano = numeroRomano.substring(1);
			} else if(numeroAConverter.contentEquals("D")) {
				numeroArabico += 500;
				numeroRomano = numeroRomano.substring(1);
			} else if(numeroAConverter.contentEquals("C")) {
				numeroArabico += 100;
				numeroRomano = numeroRomano.substring(1);
			} else if(numeroAConverter.contentEquals("L")) {
				numeroArabico += 50;
				numeroRomano = numeroRomano.substring(1);
			} else if(numeroAConverter.contentEquals("X")) {
				numeroArabico += 10;
				numeroRomano = numeroRomano.substring(1);
			} else if(numeroAConverter.contentEquals("V")) {
				numeroArabico += 5;
				numeroRomano = numeroRomano.substring(1);
			} else if(numeroAConverter.contentEquals("I")) {
				numeroArabico += 1;
				numeroRomano = numeroRomano.substring(1);
			}
		}
	return numeroArabico;
	}
	
}
