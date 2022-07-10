package br.com.ProjetoCalculodeArea.entities;

import java.util.Scanner;
import br.com.ProjetoCalculodeArea.utils.*;

public class Menu {
    Scanner scanner = new Scanner(System.in);
    VerificaSeETriangulo verificacao = new VerificaSeETriangulo();

    public Menu(){}

    public void inicializar() {
        int opcao = -1;
        while (opcao != 0) {
        MenuInicial.menuInicial();
        opcao = scanner.nextInt();
        switch (opcao) {
            case 1:
                System.out.println("Digite o raio do Circulo: ");
                System.out.print("Raio: ");
                double raioCirculo = scanner.nextDouble();
                System.out.println();
                Circulo circulo = new Circulo(raioCirculo);
                System.out.println(
                    "***********************************\n" + 
                    "Area do Circulo: " + circulo.calculaArea() + 
                    "\n***********************************\n"
                    );
                break;
        
            case 2:
                System.out.println("Digite a base e a altura do Retagulo: ");
                System.out.print("Base: ");
                double baseRetangulo = scanner.nextDouble();
                System.out.print("Altura: ");
                double alturaRetangulo = scanner.nextDouble();
                System.out.println();
                Retangulo retangulo = new Retangulo(baseRetangulo, alturaRetangulo);
                System.out.println("***********************************");
                System.out.println("Area do Retangulo: " + retangulo.calculaArea());
                System.out.println("***********************************");
                break;
            
            case 3:
                System.out.println("Digite a base e os lados do triangulo: ");
                byte flag = -1;
                while (flag != 0) {
                    System.out.print("Base: ");
                    double baseTriangulo = scanner.nextDouble();
                    System.out.print("Lado 1: ");
                    double lado1Triangulo = scanner.nextDouble();
                    System.out.print("Lado 2: ");
                    double lado2Triangulo = scanner.nextDouble();
                    System.out.println();
                    if (verificacao.verificaSeETriangulo(baseTriangulo, lado1Triangulo, lado2Triangulo)) {
                        System.out.println("Digite a altura do Triangulo: ");
                        System.out.print("Altura: ");
                        double alturaTriangulo = scanner.nextDouble();
                        Triangulo triangulo = new Triangulo(baseTriangulo, lado1Triangulo, lado2Triangulo, alturaTriangulo);
                        System.out.println("***********************************");
                        System.out.println("Area do Triangulo: " + triangulo.calculaArea());
                        System.out.println("***********************************");
                        break;
                    }
                }
                break;
            case 4:
                System.out.println("Digite a base maior, a base menor e a altura do Trapezio: ");
                System.out.print("Base maior: ");
                double baseMaiorTrapezio = scanner.nextDouble();
                System.out.print("Base menor: ");
                double baseMenorTrapezio = scanner.nextDouble();
                System.out.print("Altura: ");
                double alturaTrapezio = scanner.nextDouble();
                Trapezio trapezio = new Trapezio(baseMaiorTrapezio, baseMenorTrapezio, alturaTrapezio);
                System.out.println("***********************************");
                System.out.println("Area do trapezio: " + trapezio.calculaArea());
                System.out.println("***********************************");
                break;
            case 0:
                System.out.println("******");
                System.out.println("Adeus!");
                System.out.println("******");
                break;
        }
        }
        scanner.close();
    }

        public static class MenuInicial {
            public static void menuInicial() {
                System.out.println("--------------------------------------------------------------");
                System.out.println("Selecione uma forma geometrica digitando o respectivo numero");
                System.out.println("--------------------------------------------------------------");
                System.out.println("1: Circulo");
                System.out.println("2: Retangulo");
                System.out.println("3: Triangulo");
                System.out.println("4: Trapezio");
                System.out.println("0: Encerrar");
                System.out.println("--------------------------------------------------------------");
                System.out.println("Digite o numero da forma geometrica ou 0 para encerrar: ");
                System.out.println("--------------------------------------------------------------");
            }
        }
        
    
}
