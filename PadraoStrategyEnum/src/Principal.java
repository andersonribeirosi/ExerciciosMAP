/**
 * 
 */

/**
 * @author andersonribeiro
 *
 */

public class Principal {
	public static void main(String[] args) {
		
		Funcionario gerente = new Funcionario(Funcionario.GERENTE, 3000, 3);
		System.out.println("O GERENTE recebera: " + gerente.gratificacao());

		Funcionario lider = new Funcionario(Funcionario.LIDER, 4500, 4);
		System.out.println("O LIDER recebera: " + lider.gratificacao());
		
		Funcionario dev = new Funcionario(Funcionario.DESENVOLVEDOR, 2100, 1);
		System.out.println("O DESENVOLVEDOR recebera: " + dev.gratificacao());

		Funcionario dba = new Funcionario(Funcionario.DBA, 1700, 2);
		System.out.println("O DBA recebera: " + dba.gratificacao());

		
	}

}