package br.com.ProjetoCalculodeArea.entities;

import br.com.ProjetoCalculodeArea.utils.CalculoDeArea;

public class Circulo implements CalculoDeArea{
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calculaArea() {
        double area = Math.PI * Math.pow(raio, 2);
        return area;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

}
