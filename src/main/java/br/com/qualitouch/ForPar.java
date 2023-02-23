package br.com.qualitouch;

public class ForPar {
    public static void main(String[] args) {
        for (Integer i = 0; i <= 10; i++) {
            if (i % 2 == 0 ) {

                System.out.println(i * 5 + "par");
            }else{
                System.out.println(i *10 +"impar");


            }

        }
    }
}