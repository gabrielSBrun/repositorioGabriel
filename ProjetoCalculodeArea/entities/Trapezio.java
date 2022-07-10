package br.com.ProjetoCalculodeArea.entities;

import br.com.ProjetoCalculodeArea.utils.CalculoDeArea;

public class Trapezio implements CalculoDeArea{
    private double baseMaior;
    private double baseMenor;
    private double altura;
    
    public Trapezio(double baseMaior, double baseMenor, double altura) {
        this.baseMaior = baseMaior;
        this.baseMenor = baseMenor;
        this.altura = altura;
    }

    @Override
    public double calculaArea() {
        double area = ((baseMaior + baseMenor) * altura)/2;
        return area;
    }

}
