package br.com.qualitouch;

public class Cachorro {
    String raca;
    String nome;

    public String Latir (){
        return  nome + " " + raca + " " + "Late muito";
    }

    public static void main(String[] args) {
        Cachorro bichinho1 = new Cachorro();
        bichinho1.nome = "Bob";
        bichinho1.raca = "Pit Bul";


        Cachorro bichinho2 = new Cachorro();
        bichinho2.nome = "Marley";
        bichinho2.raca = "Poodle";

        System.out.println(bichinho1.Latir());
    }

}
