package banco;

public class ContaCorrente extends Conta implements Comparable<ContaCorrente> {
  double limite;
  Cliente cliente;

  public ContaCorrente(String nomeTitular, String sobrenomeTitular, double saldoInicial, double limiteInicial) throws IllegalArgumentException {
    super(saldoInicial);

    if (limiteInicial < 0) {
      throw new IllegalArgumentException("Limite inicial deve ser zero ou positivo.");
    }

    this.cliente = new Cliente(nomeTitular, sobrenomeTitular);

    this.limite = limiteInicial;

  }

  public double getLimite() {
    return limite;
  }

  public void setLimite(double limite) {
    this.limite = limite;
  }

  public Cliente getCliente() {
    return cliente;
  }

  public void setCliente(Cliente cliente) {
    this.cliente = cliente;
  }

  // Ordenar por double (saldo)

  /*public int compareTo(ContaCorrente outra) {
    if (this.getSaldo() < outra.getSaldo()) {
      return -1;
    }

    if (this.getSaldo() > outra.getSaldo()) {
      return 1;
    }

    return 0;
  }*/

  @Override
  public int compareTo(ContaCorrente outra) {
    return Double.compare(this.getSaldo(), outra.getSaldo());
  }

  /*
  Ordenar por String (nome do cliente)

  @Override
  public int compareTo(ContaCorrente outra) {
    return this.getCliente().getNome().compareTo(outra.getCliente().getNome());
  }*/



  @Override
  public String toString() {
    return String.format("Conta Corrente de %s %s com saldo de: R$%.2f.%n",
        this.getCliente().getNome(), this.getCliente().getSobrenome(), this.getSaldo());
  }
}
