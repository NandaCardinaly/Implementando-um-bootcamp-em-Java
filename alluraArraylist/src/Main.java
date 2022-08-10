/**
 * @author Fernanda Cardinaly
 */


import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {

        String aula1 ="Mais sobre javadoc";
        String aula2 ="programacao orientada a objeto";
        String aula3 ="trabalhando com listas";

        ArrayList<String> aulas = new ArrayList<>();
        aulas.add(aula1);
        aulas.add(aula2);
        aulas.add(aula3);
        System.out.println(aulas);

        //aulas.remove(0); removendo pelo indice
        String primeiraAula = aulas.get(0);

        for (String aula : aulas){ //se lê: para cada string aula dentro de aulas, faça isso
            System.out.println("Aula: " + aula);
        }
        for (int i = 0; i< aulas.size(); i++){ //veja que nesse caso o i tem que ser menor do q aulas size
            System.out.println(" Essas são as aulas: "+aulas.get(i));
                    }

        aulas.forEach(aula ->{
            System.out.println("percorrendo "+aula);
        }); //para cada aula dentro de aulas faça: { instrução } obs: geralmente o lambda usa poucas instruções
    }
}