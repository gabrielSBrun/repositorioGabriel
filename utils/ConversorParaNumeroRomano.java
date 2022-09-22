package utils;

public class ConversorParaNumeroRomano {
	public ConversorParaNumeroRomano(){}
	
	public String converteParaRomano(String numeroArabico) {
		String numeroRomano = "";
		int numero = Integer.parseInt(numeroArabico);
		if(numero >= 1000) {
			int milhar = Character.getNumericValue(numeroArabico.charAt(0));
			for(int i = 0; i < milhar; i++) {
				numeroRomano = numeroRomano + "M";
				numero = numero - 1000;
			}
		numeroArabico = numeroArabico.substring(1);
		}
		if(numero < 1000 && numero >= 500) {
			int centena = Character.getNumericValue(numeroArabico.charAt(0));
			if(centena == 9) {
				numeroRomano = numeroRomano + "CM";
				numero = numero - 900;
			} else {
				numeroRomano = numeroRomano + "D";
				numero = numero - 500;
				for(int i = 0; i < centena - 5; i++) {
					numeroRomano = numeroRomano + "C";
					numero = numero - 100;
				}
			}
		numeroArabico = numeroArabico.substring(1);
		}
		if(numero < 500 && numero >= 100) {
			int centena = Character.getNumericValue(numeroArabico.charAt(0));
			if(centena == 4) {
				numeroRomano = numeroRomano + "CD";
				numero = numero - 400;
			} else {
				for(int i = 0; i < centena; i++) {
					numeroRomano = numeroRomano + "C";
					numero = numero - 100;
				}
			}
		numeroArabico = numeroArabico.substring(1);
		}
		if(numero < 100 && numero >= 50) {
			int dezena = Character.getNumericValue(numeroArabico.charAt(0));
			if(dezena == 9) {
				numeroRomano = numeroRomano + "XC";
				numero = numero - 90;
			} else {
				numeroRomano = numeroRomano + "L";
				numero = numero - 50;
				for(int i = 0; i < dezena - 5; i++) {
					numeroRomano = numeroRomano + "X";
					numero = numero - 10;
				}
			}
		numeroArabico = numeroArabico.substring(1);
		}
		if(numero < 50 && numero >= 10) {
			int centena = Character.getNumericValue(numeroArabico.charAt(0));
			if(centena == 4) {
				numeroRomano = numeroRomano + "XL";
				numero = numero - 40;
			} else {
				for(int i = 0; i < centena; i++) {
					numeroRomano = numeroRomano + "X";
					numero = numero - 10;
				}
			}
		numeroArabico = numeroArabico.substring(1);
		}
		if(numero < 10 && numero >= 5) {
			int dezena = Character.getNumericValue(numeroArabico.charAt(0));
			if(dezena == 9) {
				numeroRomano = numeroRomano + "IX";
				numero = numero - 9;
			} else {
				numeroRomano = numeroRomano + "V";
				numero = numero - 5;
				for(int i = 0; i < dezena - 5; i++) {
					numeroRomano = numeroRomano + "I";
					numero = numero - 1;
				}
			}
		numeroArabico = numeroArabico.substring(1);
		}
		if(numero < 5 && numero >= 1) {
			int centena = Character.getNumericValue(numeroArabico.charAt(0));
			if(centena == 4) {
				numeroRomano = numeroRomano + "IV";
				numero = numero - 4;
			} else {
				for(int i = 0; i < centena; i++) {
					numeroRomano = numeroRomano + "I";
					numero = numero - 1;
				}
			}
		numeroArabico = numeroArabico.substring(1);
		}
	return numeroRomano;
	}
	
	/*public void logica1(String numeroArabico, int comparador1, 
						int comparador2, String incremento1, 
						String incremento2, int decremento1, 
						int decremento2) {
		
		int numero = Integer.parseInt(numeroArabico);
			if(numero < comparador1 && numero >= comparador2) {
				int unidade = Character.getNumericValue(numeroArabico.charAt(0));
				if(unidade == 4) {
					numeroRomano = numeroRomano + incremento1;
					numero = numero - decremento1;
				} else {
					for(int i = 0; i < unidade; i++) {
						numeroRomano = numeroRomano + incremento2;
						numero = numero - decremento2;
					}
				}
			numeroArabico = numeroArabico.substring(1);
			}
	}
			
			
		public void logica2(String numeroArabico, int comparador1, 
							int comparador2, String incremento1, 
							String incremento2, String incremento3, int decremento1, 
							int decremento2, int decremento3) {
				
			int numero = Integer.parseInt(numeroArabico);
			
			if(numero < comparador1 && numero >= comparador2) {
					int unidade = Character.getNumericValue(numeroArabico.charAt(0));
					if(unidade == 9) {
						numeroRomano = numeroRomano + incremento1;
						numero = numero - decremento1;
					} else {
						numeroRomano = numeroRomano + incremento2;
						numero = numero - decremento2;
						for(int i = 0; i < unidade - 5; i++) {
							numeroRomano = numeroRomano + incremento3;
							numero = numero - decremento3;
						}
					}
				numeroArabico = numeroArabico.substring(1);
				}
		}*/
	}

