package br.com.ProjetoCalculodeArea.utils;

public class VerificaSeETriangulo {
    
    public VerificaSeETriangulo() {}

    public Boolean verificaSeETriangulo(double base, double lado1, double lado2) { 

        if (base < lado1 + lado2 && lado1 < base + lado2 && lado2 < base + lado1){
            return true;
        } else {
            System.out.println("Não forma um triangulo, favor repetir os dados!");
            return false;
        }
    }
}
