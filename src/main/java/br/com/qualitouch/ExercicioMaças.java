package br.com.qualitouch;

import java.util.Scanner;

public class ExercicioMaças {
    public static void main(String [] args){
        System.out.println("Quantas maças voce deseja comprar?");
        Scanner scanner = new Scanner(System.in);
        Integer quantidade = scanner.nextInt();
        double a = 0.30;
        double b = 0.25;

        if(quantidade < 12) {
            System.out.println("O total da compra é: R$" + quantidade*a + " Sendo " + quantidade + " Maças X R$ "+ a );
            }else if (quantidade >=12) {
            System.out.println("O total da compra é: R$" + quantidade*b+ " Sendo " + quantidade + " Maças X R$ "+ b);

        }



    }
}
