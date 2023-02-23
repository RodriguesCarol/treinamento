package br.com.qualitouch;

import java.util.Scanner;

public class EXercicioSenha {
    public static  void main(String [] args){
        System.out.println("Por favor,digite aqui sua senha");
        Scanner scanner = new Scanner(System.in);
        Integer senha = scanner.nextInt();

        if (senha == 1234) {
            System.out.println("ACESSO PERMITIDO");
        }else if (senha != 1234) {
            System.out.println("ACESSO NEGADO");


        }



    }
}
