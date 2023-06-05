package com.mycompany.exercicio1;

public class Exercicio1 {
    public static void main(String[] args) {
        String entrada = "Ana Maria da Silva Coração";
        int quantidade = contarLetrasA(entrada);
        System.out.println("Quantidade de letras 'a' minúsculas: " + quantidade);
    }
    
    public static int contarLetrasA(String textoDeEntrada) {
        int contador = 0;
        char letra;

        for (int i = 0; i < textoDeEntrada.length(); i++) {
            letra = textoDeEntrada.charAt(i);
            if (letra == 'a') {
                contador++;
            }
        }
        return contador;
    }
}
