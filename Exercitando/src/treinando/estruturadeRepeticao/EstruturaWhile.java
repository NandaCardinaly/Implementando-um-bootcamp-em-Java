package treinando.estruturadeRepeticao;

import java.util.Scanner;
public class EstruturaWhile {
    public static void main(String[] args) {


    boolean desejaRepetir = true;

    Scanner leitor = new Scanner(System.in);

    String nome;
    byte idade;

        while (desejaRepetir){
        System.out.println("Digite o nome do usuário");
        nome = leitor.nextLine();

        System.out.println("Digite a idade do usuário");
        idade = leitor.nextByte();

        System.out.println(nome + " têm " + idade + " anos!");

        desejaRepetir = leitor.nextBoolean();
    }
    }
}
