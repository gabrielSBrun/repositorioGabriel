package br.com.ProjetoCalculodeArea.entities;

import br.com.ProjetoCalculodeArea.utils.CalculoDeArea;

public class Triangulo implements CalculoDeArea{
    protected double base;
    protected double lado1;
    protected double lado2;
    protected double altura;
    
    public Triangulo(double base, double lado1, double lado2, double altura) {
        this.base = base;
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.altura = altura;
    }
    
    @Override
    public double calculaArea() {
        double area;
        
        if (base == lado1 && base == lado2) {
                System.out.println("Três lados iguais. Trata-se de um Triangulo Equilatero");
                Triangulo trianguloEquilatero = new TrianguloEquilatero(base, lado1, lado2, altura);
                area = trianguloEquilatero.calculaArea();
            } else if(base == lado1 || lado1 == lado2 || lado2 == base) {
                System.out.println("Dois lados iguais. Trata-se de um Triangulo Isosceles");
                Triangulo trianguloIsosceles = new TriangoIsosceles(base, lado1, lado2, altura);
                area = trianguloIsosceles.calculaArea();
            } else {
                System.out.println("Três lados diferentes. Trata-se de um Triangulo Escaleno");
                Triangulo trianguloEscaleno = new TrianguloEscaleno(base, lado1, lado2, altura);
                area = trianguloEscaleno.calculaArea();
            }
            
        return area;
    }
    
    public double getBase() {
        return base;
    }
    
    public void setBase(double base) {
        this.base = base;
    }
    
    public double getLado1() {
        return lado1;
    }
    
    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }
    
    public double getLado2() {
        return lado2;
    }
    
    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }
    
    public double getAltura() {
        return altura;
    }
    
    public void setAltura(double altura) {
        this.altura = altura;
    }
    
}
