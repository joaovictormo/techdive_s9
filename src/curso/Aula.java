package curso;

public class Aula {
  private String nome;
  private int tempo;

  public Aula(String nome, int tempo) {
    this.nome = nome;
    this.tempo = tempo;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public int getTempo() {
    return tempo;
  }

  public void setTempo(int tempo) {
    this.tempo = tempo;
  }

  @Override
  public String toString() {
    return String.format("Aula %s com duração de: %d horas.", this.nome, this.tempo);
  }
}
