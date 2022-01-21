package main;

import comparators.ComparadorDeStringPorTamanho;
import consumers.ConsumidorDeString;
import curso.Aula;
import curso.Curso;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

import static java.util.Comparator.comparing;

public class Aula3 {
  public static void main(String[] args) {
    List<String> videosFavoritosDoCasimiro = new ArrayList<>();
    videosFavoritosDoCasimiro.add("Lancheira da Nina");
    videosFavoritosDoCasimiro.add("Vasco 12-0 Rio Claro-SP");
    videosFavoritosDoCasimiro.add("Comprando iPhone");

    //Collections.sort(videosFavoritosDoCasimiro);
    System.out.println(videosFavoritosDoCasimiro);

    Comparator<String> comparator = new ComparadorDeStringPorTamanho();
    //Collections.sort(videosFavoritosDoCasimiro, comparator);

    videosFavoritosDoCasimiro.sort(comparator);
    System.out.println(videosFavoritosDoCasimiro);

    Consumer<String> consumer = new ConsumidorDeString();
    videosFavoritosDoCasimiro.forEach(consumer);

    videosFavoritosDoCasimiro.forEach(
        new Consumer<String>() {
          @Override
          public void accept(String s) {
            System.out.println(s);
          }
        });

    videosFavoritosDoCasimiro.forEach(s -> System.out.println(s));
    videosFavoritosDoCasimiro.forEach(System.out::println);

    videosFavoritosDoCasimiro.sort(
      (s1, s2) -> Integer.compare(s1.length(), s2.length())
    );

    // Function<String, Integer> funcao = s -> s.length();
    // Comparator<String> comparador = Comparator.comparing(funcao);
    videosFavoritosDoCasimiro.sort(comparing(String::length));


    Curso curso = new Curso("Java8", "João Victor");
    curso.adiciona(new Aula("Introdução a Lambda", 3));
    curso.adiciona(new Aula("Introdução a Method Reference", 2));
    curso.adiciona(new Aula("Introdução a Default Methods", 1));

    List<Aula> aulas = new ArrayList<>(curso.getAulas());

    aulas.sort(comparing(Aula::getTempo));

    System.out.println(aulas);
  }
}
