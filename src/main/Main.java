package main;

import banco.ContaCorrente;
import curso.Aula;
import curso.Curso;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
  public static void main(String[] args) {
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

    System.out.println(listaAula);
  }
}
