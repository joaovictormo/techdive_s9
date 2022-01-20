package main;

import banco.ContaCorrente;
import curso.Aluno;
import curso.Aula;
import curso.Curso;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
  public static void main(String[] args) {


    /*
    // Aula 1
    List<String> lista = new ArrayList<>();
    lista.add("João Victor");
    lista.add("Jardon");
    lista.add("Gustavo");
    lista.add("Arthur");

    System.out.println(lista);

    Collections.sort(lista);

    System.out.println(lista);


    ContaCorrente cc1 = new ContaCorrente("João Victor", "Oliveira", 50, 100);
    ContaCorrente cc2 = new ContaCorrente("Heverson", "Clides", 40, 100);
    ContaCorrente cc3 = new ContaCorrente("Henrique", "Caetano", 80, 100);
    ContaCorrente cc4 = new ContaCorrente("Marcos", "Michel", 20, 100);

    List<ContaCorrente> listaCCs = new ArrayList<>();

    listaCCs.add(cc1);
    listaCCs.add(cc2);
    listaCCs.add(cc3);
    listaCCs.add(cc4);

    System.out.println(listaCCs);

    Collections.sort(listaCCs);

    System.out.println(listaCCs);

    System.out.println(Collections.max(listaCCs));
    System.out.println(Collections.min(listaCCs));

    Collections.reverse(listaCCs);
    System.out.println(listaCCs);

    Curso curso = new Curso("Tech Dive", "João Victor");

    curso.adiciona(new Aula("Coleções", 6));

    List<Aula> listaAula = curso.getAulas();

    // listaAula.get(0).setNome("Collections");

    System.out.println(listaAula);*/



    // Aula 2

    Set<String> alunos = new HashSet<>();
    // Collection<String> alunos = new HashSet<>();
    alunos.add("Uzumaki Naruto");
    alunos.add("Haruno Sakura");
    alunos.add("Uchiha Sasuke");
    alunos.add("Hyuuga Neji");
    alunos.add("Tenten");
    alunos.add("Rock Lee");
    //alunos.add("Tenten");
    //alunos.add("Rock Lee");

    System.out.println(alunos);

    for (String aluno : alunos) {
      System.out.println(aluno);
    }

    System.out.println(alunos.size());

    boolean narutoEstaMatriculado = alunos.contains("Uzumaki Naruto");

    System.out.println(narutoEstaMatriculado);

    alunos.remove("Uchiha Sasuke");

    System.out.println(alunos);
    System.out.println(alunos.size());

    List<String> listaAlunos = new ArrayList<>(alunos);

    System.out.println(listaAlunos);
    System.out.println(listaAlunos.get(0));

    Aluno a1 = new Aluno("Ivo Ramos", 1);
    Aluno a2 = new Aluno("Eric Larroque", 2);
    Aluno a3 = new Aluno("Júlia Costa", 3);

    Curso curso = new Curso("Tech Dive", "João Victor");

    curso.adiciona(new Aula("Coleções", 6));

    curso.matricula(a1);
    curso.matricula(a2);
    curso.matricula(a3);

    System.out.println(curso.getAlunos());

    System.out.println(curso.estaMatriculado(a1));

    String nomeBuscado = "Ivo Ramos";
    Aluno alunoParaBuscar = new Aluno(nomeBuscado, 10);

    System.out.println("Os dois alunos são o mesmo? \n" + alunoParaBuscar.equals(a1));

    System.out.println("O aluno está matriculado?");
    System.out.println(curso.estaMatriculado(alunoParaBuscar));
  }
}
