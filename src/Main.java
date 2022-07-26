import br.com.dio.desafio.*;

import java.time.LocalDate;


public class Main {
    public static void main(String [] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Conteudo conteudo = new Curso();
        Conteudo conteudo1 = new Mentoria();

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descriçao mentoria java");
        mentoria.setData(LocalDate.now());


        //System.out.println(curso1);
        //System.out.println(curso2);
        //System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devJose = new Dev();
        devJose.setNome("José");
        devJose.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos José " + devJose.getConteudosInscritos());
        devJose.progredir();
        devJose.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos José " + devJose.getConteudosInscritos());
        System.out.println("Conteudos Concluidos José " + devJose.getConteudosConcluidos());
        System.out.println("XP:" + devJose.calcularTotalXp());

        System.out.println("----------------------------------");


        Dev devGabi = new Dev();
        devGabi.setNome("Gabriele");
        devGabi.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Gabriele " + devGabi.getConteudosInscritos());
        devGabi.progredir();
        devGabi.progredir();
        devGabi.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos Gabriele " + devGabi.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Gabriele " + devGabi.getConteudosConcluidos());
        System.out.println("XP:" + devGabi.calcularTotalXp());



    }
}
