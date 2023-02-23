package br.com.qualitouch;

public class Elevador {

    // Propriedades, atributos...
    private final Integer totalAndares;
    private final Integer capacidadeElevador;
    private Integer andarAtual;
    private Integer numeroDePessoasNoElevador;

    // Construtor
    public Elevador(Integer totalAndares, Integer capacidadeElevador) {
        this.totalAndares = totalAndares;
        this.capacidadeElevador = capacidadeElevador;
        this.setAndarAtual(0); // Começa sempre do terreo
        this.setNumeroDePessoasNoElevador(0); // Começa vazio
    }

    // Comportamentos
    // para acrescentar pessoas no elevador
    // (só deve acrescentar se ainda houver espaço)
    // ctrl+alt+L
    public void entra(Integer numeroDePessoasEntrando) {
        if (this.getNumeroDePessoasNoElevador()
                + numeroDePessoasEntrando <= this.getCapacidadeElevador()) {
            this.setNumeroDePessoasNoElevador(this.getNumeroDePessoasNoElevador() + numeroDePessoasEntrando);
        } else {
            System.out.println("PIIIIIIIIIII, vai explodir!");
        }
    }

    public void sai(Integer numeroDePessoasSaindo) {
        if (this.getNumeroDePessoasNoElevador() >= numeroDePessoasSaindo) {
            this.setNumeroDePessoasNoElevador(this.getNumeroDePessoasNoElevador() - numeroDePessoasSaindo);
        } else {
            System.out.println("Não tem tanta gente no elevador não!");
        }
    }

    //    para subir um andar (não deve subir se já estiver no último andar);
    public void sobeUmAndar() {
        if (this.getAndarAtual() < this.getTotalAndares()) {
            this.setAndarAtual(this.getAndarAtual() + 1);
        } else {
            System.out.println("Quer ir pra lua é?");
        }
    }

    public void desceUmAndar() {
        // Podemos descer um andar, se o andar atual for maior que zero!
        // Exemplos: 0
        if (this.getAndarAtual() > 0) {
            this.setAndarAtual(this.getAndarAtual() - 1);
        } else {
            System.out.println("Quer ir pro inferno é?");
        }
    }

    public void vaiParaOAndar(Integer andarQueQueroIr) {
        // Andar que quero ir nao pode ser maior que o total!
        if (andarQueQueroIr > this.getTotalAndares()) {
            System.out.println("Quer ir pra lua é?");
            return ;
        }
        // Andar que quero ir nao pode ser negativo!
        if (andarQueQueroIr < 0) {
            System.out.println("Quer ir pro inferno é?");
            return ;
        }
        // Andar que quero ir nao pode ser o andar que eu já estou!
        if (andarQueQueroIr.equals(this.getAndarAtual())) {
            System.out.println("Oxe, vc ja ta aqui!");
            return;
        }
        // Ai sim, atualizamos o andar!
        this.setAndarAtual(andarQueQueroIr);
    }

    public void imprimeStatusDoElevador() {
        System.out.println("------ STATUS DO ELEVADOR -----");
        System.out.println("this.numeroDePessoasNoElevador = " + this.getNumeroDePessoasNoElevador());
        System.out.println("this.capacidadeElevador = " + this.getCapacidadeElevador());
        System.out.println("this.andarAtual = " + this.getAndarAtual());
        System.out.println("this.totalAndares = " + this.getTotalAndares());
    }

    public Integer getCapacidadeElevador() {
        return capacidadeElevador;
    }

    public Integer getTotalAndares() {
        return totalAndares;
    }

    public Integer getAndarAtual() {
        return andarAtual;
    }

    public void setAndarAtual(Integer andarAtual) {
        this.andarAtual = andarAtual;
    }

    public Integer getNumeroDePessoasNoElevador() {
        return numeroDePessoasNoElevador;
    }

    public void setNumeroDePessoasNoElevador(Integer numeroDePessoasNoElevador) {
        this.numeroDePessoasNoElevador = numeroDePessoasNoElevador;
    }
}