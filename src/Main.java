import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso 1");
        curso1.setDescricao("descrição curso 1");
        curso1.setCargaHoraria(4);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso 2");
        curso2.setDescricao("descrição curso 2");
        curso2.setCargaHoraria(6);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria");
        mentoria.setDescricao("descrição mentoria");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java");
        bootcamp.setDescricao("Descrição bootcamp Java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev dev1 = new Dev();
        dev1.setNome("Fernando");
        dev1.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos: " + dev1.getConteudosInscritos());
        dev1.progredir();
        System.out.println("Conteúdos concluídos: " + dev1.getConteudosConcluidos());
        System.out.println("Conteúdos inscritos: " + dev1.getConteudosInscritos());
        System.out.println("XP: " + dev1.calcularTotalXp());

        System.out.println("=======================");
        Dev dev2 = new Dev();
        dev2.setNome("Claudia");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos: " + dev2.getConteudosInscritos());
        dev2.progredir();
        dev2.progredir();
        dev2.progredir();
        System.out.println("Conteúdos concluídos: " + dev2.getConteudosConcluidos());
        System.out.println("Conteúdos inscritos: " + dev2.getConteudosInscritos());
        System.out.println("XP: " + dev2.calcularTotalXp());


    }
}
