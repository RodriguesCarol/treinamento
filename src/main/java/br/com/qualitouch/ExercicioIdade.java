package br.com.qualitouch;

import java.util.Scanner;

public class ExercicioIdade {
    public static void main (String [] args){
        System.out.println("Digite o ano de seu nascimento");
        Scanner scanner = new Scanner(System.in);
        Integer idade = scanner.nextInt();
        int suaIdade =  2022 - idade;
        System.out.println("Sua idade é " + suaIdade);

        if(suaIdade >= 16 && suaIdade < 18 || (suaIdade >70)) {
            System.out.println("Voce pode votar esse ano!");
        }else if (suaIdade >= 18 && suaIdade <= 70) {;
            System.out.println("Voce deve votar esse ano!");
            }else if (suaIdade < 16){
            System.out.println("Voce só pode votar quando completar 16 anos");

        }





    }
}
