package br.com.ProjetoCalculodeArea.entities;

public class TrianguloEscaleno extends Triangulo{

    public TrianguloEscaleno(double base, double lado1, double lado2, double altura) {
        super(base, lado1, lado2, altura);
    }
    
    @Override
    public double calculaArea() {
        double area = (base * altura)/2;
    return area;
    }
}
