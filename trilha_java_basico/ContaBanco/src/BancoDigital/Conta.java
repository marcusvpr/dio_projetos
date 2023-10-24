
public abstract class Conta extends Banco implements IConta {

	private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;

	protected int agencia;
	protected int numero;
	protected double saldo;
	private Cliente cliente;

	public Conta() {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	@Override
	public void sacar(double valor) {
		this.saldo = this.saldo - valor;
	}

	@Override
	public void depositar(double valor) {
		this.saldo = this.saldo + valor;
	}

	@Override
	public void transferir(double valor, Conta contaDestino) {

		if (saldo > valor) {
			this.sacar(valor);
			contaDestino.depositar(valor);
		} else {
			System.out.println("Saldo insuficiente");
		}
	}

	protected void infoComuns() {
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Numero: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
	}

}
