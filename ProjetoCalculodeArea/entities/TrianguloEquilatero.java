package br.com.ProjetoCalculodeArea.entities;

public class TrianguloEquilatero extends Triangulo{

    public TrianguloEquilatero(double base, double lado1, double lado2, double altura) {
        super(base, lado1, lado2, altura);
    }

    @Override
    public double calculaArea() {
        double area = (Math.pow(lado1, 2) * Math.sqrt(3))/4; 
    return area;
    }
    
}
