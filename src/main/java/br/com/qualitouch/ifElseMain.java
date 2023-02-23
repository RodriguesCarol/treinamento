package br.com.qualitouch;

import java.util.Scanner;

public class ifElseMain {

    // main executar código ( Botão dentro do código e escolher run..)
    public static void main(String[] args) {
        // sout -> para imprimir no console
        //System.out.println("Digite sua senha");
        Scanner scanner = new Scanner(System.in);
        //Integer idade = scanner.nextInt(); // nextInt -> pede inteiro para usuário
        //System.out.println("A idade digitada foi : " + idade); // Soma de strings, o java sempre tenta tranformar em texto.

        System.out.print("Digite o primeiro número: ");
        Integer a = scanner.nextInt();
        System.out.print("Digite o segundo número: ");
        Integer b = scanner.nextInt();

        if (a > b) {
            System.out.println(a);
        } else if (a < b) {
            System.out.println(b);
        }else{
            System.out.println("Eles são iguais");
        }

        }


    }