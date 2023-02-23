package br.com.qualitouch;
import java.time.LocalDate;

//Classe- Representação de algum conceito do sistema
//Public - Visibilidade da classe ou método
// public, private - Visibilidade da classe/propriedade/metodo

public class Data {

    // Campos/propriedades
    // Mas o melhor é sempre deixar privado
//    private int dia;
//    private int mes;
//    private int ano;
    private LocalDate dateLocal;

    // Construtor que recebe dia, mes e ano
    // Atalho pra criar alt+insert -> constructor
    // -> Selecionar todos os parametros

    public Data() {

    }
    // Se vc criar um construtor diferente do padrao
    // o java elimina o construtor padrao.
    public Data(int dia, int mes, int ano) {
        // Valor padrao para dias errados é 1
//        if (dia < 1 || dia > 31) {
//            this.dia = 1;
//        } else {
//            this.dia = dia;
//        }
//        // Valor padrao para mes errado é 1
//        if (mes < 1 || mes > 12) {
//            this.mes = 1;
//        } else {
//            this.mes = mes;
//        }
//        // Valor padrao para ano errado é 1
//        if (ano < 1) {
//            this.ano = 1;
//        } else {
//            this.ano = ano;
//        }
        this.dateLocal = LocalDate.of(ano, mes, dia);
    }

    // 0 se forem iguais
    // 1 se a data corrente é maior
    // -1 se a data do parametro é maior
    public Integer compara(Data outraData) {
        return this.dateLocal.compareTo(outraData.dateLocal);
//        if (this.ano > outraData.ano) {
//            return 1;
//        } else if (this.ano < outraData.ano) {
//            return -1;
//        }
//        // A partir daqui, os anos são iguais
//        if (this.mes > outraData.mes) {
//            return 1;
//        } else if (this.mes < outraData.mes) {
//            return -1;
//        }
//        // A partir daqui, os anos e os meses são iguais
//        if (this.dia > outraData.dia) {
//            return 1;
//        } else if (this.dia < outraData.dia) {
//            return -1;
//        }
//        // A partir daqui, os anos e os meses e os dias são iguais
//        return 0;
    }
}


