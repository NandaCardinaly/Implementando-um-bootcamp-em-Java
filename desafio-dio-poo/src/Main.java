import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso de Java");
        curso1.setDescricao("Aprendendo poo com java");
        curso1.setCargaHoraria(60);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Aprendendo Phyton");
        curso2.setDescricao("Trabalhando com dados");
        curso2.setCargaHoraria(40);


        Mentoria mentoria1 = new Mentoria(); //polimorfismo
        mentoria1.setTitulo("Mentoria de java");
        mentoria1.setDescricao("Prática de código");
        mentoria1.setData(LocalDate.now());


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("aprendendo java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev dev = new Dev();
        dev.setNome("Fernanda");
        dev.inscreverBootcamp(bootcamp);
        System.out.println(dev.getNome() + ": Conteudos inscritos " +dev.getConteudosInscritos());
        System.out.println(dev.getNome() + ": Conteudos concluidos " +dev.getConteudosConcluidos());



        Dev dev2 = new Dev();
        dev2.setNome("Francisco");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println(dev2.getNome() + ": Conteudos inscritos " +dev2.getConteudosInscritos());
        dev2.progredir();
        System.out.println(dev2.getNome() + ": Conteudos concluidos " +dev2.getConteudosConcluidos());
        System.out.println(dev2.getNome() + ": Conteudos inscritos " +dev2.getConteudosInscritos());
        System.out.println(dev2.getNome() + ": Conteudos concluidos " +dev2.calcularXP());








    }
}