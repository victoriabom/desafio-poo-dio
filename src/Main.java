import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Programação Orientada a Objetos");
        curso1.setDescricao("Curso de programação orientada a objetos na linguagem Java");
        curso1.setCargaHoraria(4);

        Curso curso2 = new Curso();
        curso2.setTitulo("Praticando orientação a objetos com Java");
        curso2.setDescricao("Curso de prática de orientação a objetos na linguagem Java");
        curso2.setCargaHoraria(2);

        Curso curso3 = new Curso();
        curso3.setTitulo("Debugging Java");
        curso3.setDescricao("Curso de Debugs na linguagem Java");
        curso3.setCargaHoraria(1);

        Curso curso4 = new Curso();
        curso4.setTitulo("Tratamento de Exceções em Java");
        curso4.setDescricao("Curso de tratamento de exceções na linguagem Java.");
        curso4.setCargaHoraria(2);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de java");
        mentoria.setDescricao("Mentoria na linguagem java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Santander Code Girls 2022");
        bootcamp.setDescricao("Sejam todas bem-vindas ao Santander Bootcamp 2022! Comece sua jornada na trilha de Java, assista as aulas, faça os desafios de códigos e projetos e conclua as atividades. Todas as graduadas receberão certificado e terão chance de ingressar no mercado de trabalho!");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(curso3);
        bootcamp.getConteudos().add(curso4);
        bootcamp.getConteudos().add(mentoria);

        Dev devVictoria = new Dev();
        devVictoria.setNome("Victória Bom");
        devVictoria.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Victória:\n" + devVictoria.getConteudosInscritos());
        devVictoria.progredir();
        devVictoria.progredir();
        devVictoria.progredir();
        devVictoria.progredir();
        devVictoria.progredir();
        System.out.println("\n--------\n");
        System.out.println("Conteúdos Em Curso Victória:\n" + devVictoria.getConteudosInscritos());
        System.out.println("\nConteúdos Concluídos Victória:\n" + devVictoria.getConteudosConcluidos());
        System.out.println("XP:" + devVictoria.calcularTotalXp());

        System.out.println("-------");

    }

}
