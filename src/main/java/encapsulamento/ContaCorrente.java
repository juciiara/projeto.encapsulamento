package encapsulamento; //encapsulamento é uma forma de proteger as informações(modificador acs private)
           //base-1

public class ContaCorrente {
	private double saldo = 0;

	public double getSaldo() { //  getters metodo de pegar a informação
		return saldo;
	}

	public void setSaldo(double saldo) {// setters metodo vazio incluir um valor/ atualizar a informação
		this.saldo = saldo;

	}

}
