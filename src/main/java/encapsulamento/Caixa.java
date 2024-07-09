package encapsulamento;
       //base-2
public class Caixa {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente();//pontero

		System.out.println(" Antes do setSaldo R$:"+cc.getSaldo());
		cc.setSaldo(100.0);
		System.out.println(" Depois do setSaldo R$: "+cc.getSaldo());
		
	}
}