package curso;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

public class Curso {

  private String nome;
  private String instrutor;
  private List<Aula> aulas = new LinkedList<>();
  private Set<Aluno> alunos = new HashSet<>();
  private Map<Integer, Aluno> matriculaParaAluno = new HashMap<>();

  public Curso(String nome, String instrutor) {
    this.nome = nome;
    this.instrutor = instrutor;
  }

  public String getNome() {
    return nome;
  }

  public String getInstrutor() {
    return instrutor;
  }

  public List<Aula> getAulas() {
    return Collections.unmodifiableList(aulas);
  }

  public void adiciona(Aula aula) {
    this.aulas.add(aula);
  }

  public Set<Aluno> getAlunos() {
    return Collections.unmodifiableSet(alunos);
  }

  public void matricula(Aluno aluno) {
    this.alunos.add(aluno);
    this.matriculaParaAluno.put(aluno.getMatricula(), aluno);
  }

  public boolean estaMatriculado(Aluno aluno) {
    return this.alunos.contains(aluno);
  }

  public Aluno buscaMatriculado(int numero) {
    /*for (Aluno aluno : this.alunos) {
      if (aluno.getMatricula() == numero) {
        return aluno;
      }
    }
    throw new NoSuchElementException("Matrícula " + numero + " não foi encontrada.");*/

    return this.matriculaParaAluno.get(numero);
  }

  public Map<Integer, Aluno> getMatriculaParaAluno() {
    return matriculaParaAluno;
  }
}
