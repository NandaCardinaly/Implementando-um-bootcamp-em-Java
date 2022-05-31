package treinando.estruturadeRepeticao;
/*
Lê 5 nomes e notas de uma turma,
calcula e exibe a média das notas da turma e em seguida
exibe a relação de nomes cuja nota é superior a esta média
 */
import java.util.Scanner;
public class EstruturaFor {
    public static void main(String[] args) {

        String[] nomes = new String[5];
        float[] notas = new float[5];
        Scanner leitor = new Scanner(System.in);
        float somaNotas = 0f;

        for (int i = 0; i <= 4; i++) {
            System.out.println("Digite o nome do "+(i+1)+"º aluno");
            nomes[i]= leitor.nextLine();
            System.out.println("Digite a nota do "+(i+1)+"º aluno");
            notas[i] = leitor.nextFloat();
            somaNotas += notas[i];
        }

        float media = (somaNotas/5);
        System.out.println("A média das notas da turma é "+media);
        System.out.println("Os seguintes alunos tem nota superior a essa média: ");

        for (int i = 0; i <= 4; i++) {
          if(notas[i] > media){
              System.out.println(nomes[i]);
          }
        }

    }
}

/* MATRIZES

int m[][] = new int[2][4]; // MATRIZ DE DUAS LINHAS E 4 COLUNAS
public static void main(String[] args) {
    int[][] matriz = new int[5][5];
    Scanner leitor = new Scanner(System.in);

    for (int i = 0; i < 5; i++) {
        for (int j = 0; j < 5; j++) {
            System.out.print("Digite o elemento da linha " + (i + 1) + " da coluna " + (j + 1) + ": ");
            matriz[i][j] = leitor.nextInt();
            System.out.println("");
        }
    }

    System.out.println("Agora, apresentando a matriz\n\n");

    for (int i = 0; i < 5; i++) {
        for (int j = 0; j < 5; j++) {
            System.out.print(matriz[i][j] + "   ");
        }
        System.out.println("");
    }

    System.out.println("Fim");


}

 */