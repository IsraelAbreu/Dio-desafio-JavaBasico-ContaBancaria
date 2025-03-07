package Default;

public class ContaTerminal {
	private int numero;
	private final String agencia = "1010";
	private String nomeCliente;
	private double saldo;
	
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public String getAgencia() {
		return agencia;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public String getNomeCliente() {
		return nomeCliente;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
}
