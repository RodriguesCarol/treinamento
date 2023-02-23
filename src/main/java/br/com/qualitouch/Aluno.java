package br.com.qualitouch;

public class Aluno {

    Integer matricula;
    String nome;
    Double nota1;
    Double nota2;
    Double trabalho;

    public double media() {
        return (nota1*2.5 + nota2*2.5 + trabalho*2)/7;


    }

    public double provaFinal(){
        if(media() >= 5){
            return 0;

        }
        return 10 - media();

    }



    public static void main(String[] args) {
        Aluno alunoBom = new Aluno();
        alunoBom.matricula = 123;
        alunoBom.nome = "José";
        alunoBom.nota1= 9.5;
        alunoBom.nota2= 8.3;
        alunoBom.trabalho= 8.0;
        System.out.println(alunoBom.media());
        System.out.println(alunoBom.provaFinal());

        Aluno alunoRuim = new Aluno();
        alunoRuim.matricula = 123;
        alunoRuim.nome = "José";
        alunoRuim.nota1= 5.5;
        alunoRuim.nota2= 1.3;
        alunoRuim.trabalho= 8.0;
        System.out.println(alunoRuim.media());
        System.out.println(alunoRuim.provaFinal());
    }










    }


