package treinando.estruturadeSelecao;
/*
1 - if (Correspondente ao "se" no portugol)
 //Exemplo de estrututa aninhada
        if (media >= 7) {
            System.out.println("Aprovado");
        } else {
            if (media >= 5) {
                System.out.println("Em recuperação");
            } else {
                System.out.println("Reprovado");
            }
        }

 */
import java.util.Scanner;
public class IfElse {
    public static void main(String[] args) {


    /*Escreva um	 programa que	 leia	 as	 medidas	 dos	 lados	 de	 um	 triângulo	 e
    escreva	se	ele	é	Equilátero,	Isósceles	ou	Escaleno.	Sendo	que:
    − Triângulo	Equilátero:	possui	os	3	lados	iguais.
    − Triângulo	Isóscele:	possui	2	lados	iguais.
    − Triângulo	Escaleno:	possui	3	lados	diferentes. */


        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o primeiro lado: ");
        double ladoA = ler.nextDouble();
        System.out.println("Digite o segundo lado: ");
        double ladoB = ler.nextDouble();
        System.out.println("Digite o terceiro lado: ");
        double ladoC = ler.nextDouble();

        if ((ladoA == ladoB) && (ladoB == ladoC) ) {

            System.out.println("Esse Triângulo é Equilátero: pois possui todos os lados iguais. ");

        }

        else{
            if ((ladoA == ladoB && ladoA != ladoB) || (ladoA == ladoC && ladoA != ladoB) || (ladoC == ladoB && ladoC!= ladoA )){
                System.out.println("Esse Triângulo é Isóscele: pois possui 2 lados iguais. ");

            }

            else{
                System.out.println("Esse Triângulo é Escaleno: pois possui todos os lados diferentes. ");
            }

        }


    }
}

