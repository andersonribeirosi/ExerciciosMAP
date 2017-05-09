/**
 * 
 */

/**
 * @author andersonribeiro
 *
 */

public class GratificacaoLider implements Gratificacao {
	
	@Override
    public double gratificacao(Funcionario func) {
          if (func.getNivel() >= 2) {
              return func.getSalarioBase() * 1.35;
          }
          return func.getSalarioBase() * 1.25;
    }
}