package treinando.estruturadeSelecao;
/*
Uma loja fornece 10% de desconto para funcionários e 5% de desconto para clientes vips.
Faça um programa que calcule o valor total a ser pago por uma pessoa. O programa deverá
ler o valor total da compra efetuada e um código que identifique se o comprador é um
cliente comum (1), funcionário (2) ou vip (3).

 */
import java.util.Scanner;
public class EstruturaSwitch {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        double valorcompra = 100d;

        System.out.println("========= Digite a opção desejada =========");
        System.out.println("         1  - CLIENTE COMUM           ");
        System.out.println("         2  - FUNCIONARIO             ");
        System.out.println("         3  - CLIENTE VIP             ");
        int opcao = leitor.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("O valor da compra final é : "+ valorcompra);
                break;

            case 2:
                valorcompra -= (valorcompra * 0.1);
                System.out.println("O valor da compra final com desconto é: "+valorcompra);
                break;

            case 3:
                valorcompra -= (valorcompra * 0.05);
                System.out.println("O valor da compra final com desconto é: "+valorcompra);
                break;

            default:
                System.out.println("opção inválida");
        }

    }
}
