package br.com.alura.screenmatch.desafios.desafio02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class testes02 {

    @FunctionalInterface
    interface Multiplicacao {
        int multiplicar(int a, int b);
    }

    @FunctionalInterface
    interface VerificaPrimo {
        boolean ehPrimo(int numero);
    }

    @FunctionalInterface
    interface Maiuscula {
        String converter(String texto);
    }

    @FunctionalInterface
    interface VerificaPalindromo {
        boolean verificarPalindromo(String str);
    }

    @FunctionalInterface
    interface Divisao {
        double dividir(double a, double b) throws ArithmeticException;
    }

    public static void main(String[] args) {
        // Exercício 1
        Multiplicacao multiplicacao = (a, b) -> a * b;
        System.out.println("Multiplicação: " + multiplicacao.multiplicar(5, 3));

        // Exercício 2
        VerificaPrimo verificaPrimo = num -> {
            if (num <= 1) return false;
            for (int i = 2; i <= Math.sqrt(num); i++)
                if (num % i == 0) return false;
            return true;
        };
        System.out.println("É primo? " + verificaPrimo.ehPrimo(17));

        // Exercício 3
        Maiuscula maiuscula = str -> str.toUpperCase();
        System.out.println("Maiúscula: " + maiuscula.converter("teste"));

        // Exercício 4
        VerificaPalindromo palindromo = str ->
                str.equals(new StringBuilder(str).reverse().toString());
        System.out.println("É palíndromo? " + palindromo.verificarPalindromo("arara"));

        // Exercício 5
        List<Integer> numeros = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        numeros.replaceAll(n -> n * 3);
        System.out.println("Lista multiplicada: " + numeros);

        // Exercício 6
        List<String> palavras = new ArrayList<>(List.of("zebra", "abacaxi", "casa"));
        Collections.sort(palavras, (s1, s2) -> s1.compareTo(s2));
        System.out.println("Lista ordenada: " + palavras);

        // Exercício 7
        Divisao divisao = (a, b) -> {
            if (b == 0) throw new ArithmeticException("Divisão por zero!");
            return a / b;
        };
        try {
            System.out.println("Divisão: " + divisao.dividir(10, 2));
        } catch (ArithmeticException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
