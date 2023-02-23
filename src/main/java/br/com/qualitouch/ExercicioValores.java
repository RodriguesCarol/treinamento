package br.com.qualitouch;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ExercicioValores {
    public static void main(String [] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número");
        Integer a = scanner.nextInt();
        System.out.println("Digite o segundo número");
        Integer b = scanner.nextInt();
        System.out.println("Digite o terceiro número");
        Integer c = scanner.nextInt();






        if (a < b)  {
            if (b < c) {
                System.out.println(a + "\n" + b + "\n" + c);

            } else if (a < c) {
                System.out.println(a + "\n" + c + "\n" + b);
            } else {
                System.out.println(c + "\n" + a + "\n" + b);
            }

        } else if (b < c) {
            if (a < c) {
                System.out.println(b + "\n" + a + "\n" + c);
            } else {
                System.out.println(b + "\n" + c + "\n" + a);
            }
        } else {
            System.out.println(c + "\n" + b + "\n" + a);


        }

    }



}

