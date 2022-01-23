package main;

import curso.Aluno;
import curso.Curso;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Aula4 {
  public static void main(String[] args) {
    Curso curso1 = new Curso("Tech Dive Módulo 1", "João Victor");
    Curso curso2 = new Curso("DEVinHouse Módulo 1", "Michael Nascimento");
    Curso curso3 = new Curso("Tech Dive Módulo 2", "Francisco");
    Curso curso4 = new Curso("Tech Dive Módulo 3", "Elder Pereira");
    Curso curso5 = new Curso("DEVinHouse Módulo 2", "Mauricio Sampaio");

    Aluno a1 = new Aluno("Ivo Ramos", 1);
    Aluno a2 = new Aluno("Eric Larroque", 2);
    Aluno a3 = new Aluno("Júlia Costa", 3);
    Aluno a4 = new Aluno("Vinicius Gabriel", 4);
    Aluno a5 = new Aluno("Manuela Prin", 5);
    Aluno a6 = new Aluno("Jardon Moises", 6);

    curso1.matricula(a1);
    curso1.matricula(a2);
    curso1.matricula(a3);

    curso2.matricula(a4);
    curso2.matricula(a5);
    curso2.matricula(a6);
    curso2.matricula(a3);

    curso3.matricula(a1);

    curso4.matricula(a1);
    curso4.matricula(a2);

    curso5.matricula(a6);

    List<Curso> cursos = new ArrayList<>();
    cursos.add(curso1);
    cursos.add(curso2);
    cursos.add(curso3);
    cursos.add(curso4);
    cursos.add(curso5);

    List<Curso> cursosFiltrados = new ArrayList<>();

    for (Curso curso : cursos) {
      if (curso.getAlunos().size() > 2) {
        cursosFiltrados.add(curso);
      }
    }

    System.out.println(cursosFiltrados);

    Stream<Curso> streamCursos = cursos.stream();

    streamCursos = cursos.stream().filter(c -> c.getAlunos().size() > 2);

    System.out.println("Lista original: ");
    cursos.forEach(System.out::println);

    System.out.println("Stream filtrado: ");
    streamCursos.forEach(System.out::println);

    System.out.println("Stream filtrado v2:");
    cursos.stream()
        .filter(c -> c.getAlunos().size() > 2)
        .forEach(System.out::println);

    System.out.println("Quantidades de alunos nos cursos filtrados:");
    cursos.stream()
        .filter(c -> c.getAlunos().size() > 2)
        .map(c -> c.getAlunos().size())
        .forEach(System.out::println);

    int soma = cursos.stream()
        .filter(c -> c.getAlunos().size() > 2)
        .mapToInt(c -> c.getAlunos().size())
        .sum();

    System.out.println("Soma dos alunos matriculados em cursos com mais de 2 alunos:");
    System.out.println(soma);

    OptionalInt min = cursos.stream()
        .filter(c -> c.getAlunos().size() > 2)
        .mapToInt(c -> c.getAlunos().size())
        .min();

    OptionalInt max = cursos.stream()
        .filter(c -> c.getAlunos().size() > 2)
        .mapToInt(c -> c.getAlunos().size())
        .max();

    Optional<Curso> algumCurso = cursos.stream()
        .filter(c -> c.getAlunos().size() > 2)
        .findAny();

    Curso cursoAny = algumCurso.get();

    Curso cursoAny2 = algumCurso.orElse(new Curso("", ""));

    cursos.stream()
        .filter(c -> c.getAlunos().size() > 2)
        .findAny()
        .ifPresent(System.out::println);

    OptionalDouble media = cursos.stream()
        .mapToInt(c -> c.getAlunos().size())
        .average();

    System.out.println("media: ");
    System.out.println(media.orElse(0));

    List<Curso> cursosVazio = new ArrayList<>();

    OptionalDouble mediaVazia = cursosVazio.stream()
        .mapToInt(c -> c.getAlunos().size())
        .average();

    System.out.println("media vazia: ");
    System.out.println(mediaVazia.orElse(0));

    List<Curso> resultados = cursos.stream().filter(c -> c.getAlunos().size() > 2).collect(Collectors.toList());

    System.out.println("Lista filtrada: ");
    System.out.println(resultados);

    Map<String, Integer> mapaCursos = cursos.stream()
        .filter(c -> c.getAlunos().size() > 2)
        .collect(Collectors.toMap(Curso::getNome, c -> c.getAlunos().size()));
  }
}
