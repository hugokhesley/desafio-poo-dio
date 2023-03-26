package br.com.dominio.dominio;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();

        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição do Curso Java");
        curso1.setCargaHoraria(8);


        Curso curso2 = new Curso();

        curso2.setTitulo("Curso Python");
        curso2.setDescricao("Descrição do Curso Python");
        curso2.setCargaHoraria(4);



        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de JAVA");
        mentoria.setDescricao("Descrição da mentoria JAVA");
        mentoria.setData(LocalDate.now());




        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição do Curso Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devHugo = new Dev();
        devHugo.setNome("Hugo");
        devHugo.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos: " + devHugo.getConteudosInscritos());
        devHugo.progredir();
        System.out.println("---");
        System.out.println("Conteúdos inscritos: " + devHugo.getConteudosInscritos());
        System.out.println("Conteúdos inscritos: " + devHugo.getConteudosConcluidos());


        Dev devDavi = new Dev();
        devDavi.setNome("Davi");
        devDavi.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos: " + devDavi.getConteudosInscritos());
        devDavi.progredir();
        System.out.println("---");
        System.out.println("Conteúdos inscritos: " + devDavi.getConteudosConcluidos());
        System.out.println("Conteúdos inscritos: " + devDavi.getConteudosConcluidos());
    }
}