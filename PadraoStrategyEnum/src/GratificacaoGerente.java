/**
 * 
 */

/**
 * @author andersonribeiro
 *
 */

public class GratificacaoGerente implements Gratificacao {
	
	@Override
	public double gratificacao(Funcionario func) {
		if (func.getNivel() >= 2) {
			return func.getSalarioBase() * 1.45;
		}
		return func.getSalarioBase() * 1.30;
	}
}