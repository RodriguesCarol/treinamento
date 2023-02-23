package br.com.qualitouch;

import java.util.Scanner;

public class ForSenha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer numeroPacientes = scanner.nextInt();
        Integer ultimaSenha = scanner.nextInt();
        Integer senhaAtual;

        for (senhaAtual = ultimaSenha + 1; senhaAtual <= (numeroPacientes + ultimaSenha); senhaAtual++) {
            System.out.println(senhaAtual);
        }

    }
}
