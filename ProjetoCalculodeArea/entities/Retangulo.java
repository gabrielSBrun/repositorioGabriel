package br.com.ProjetoCalculodeArea.entities;

import br.com.ProjetoCalculodeArea.utils.CalculoDeArea;

public class Retangulo implements CalculoDeArea{
    private double base;
    private double altura;
    
    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double calculaArea() {
        double area = base * altura;
        return area;
    }

}
