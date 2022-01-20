package curso;

import java.security.InvalidParameterException;

public class Aluno {
  private String nome;
  private int matricula;

  public Aluno(String nome, int matricula) {
    if (nome == null) {
      throw new InvalidParameterException("nome não pode ser nulo.");
    }

    this.nome = nome;
    this.matricula = matricula;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public int getMatricula() {
    return matricula;
  }

  public void setMatricula(int matricula) {
    this.matricula = matricula;
  }

  @Override
  public String toString() {
    return String.format("Aluno(a) %s com a matrícula %d.", this.nome, this.matricula);
  }

  @Override
  public boolean equals(Object o) {
    if (o == null) {
      return false;
    }

    if (!(o instanceof Aluno)) {
      return false;
    }

    Aluno outroAluno = (Aluno) o;
    return this.nome.equals(outroAluno.nome);
  }

  @Override
  public int hashCode() {
    return this.nome.charAt(0);
  }
}
