/**
 * 
 */

/**
 * @author andersonribeiro
 *
 */

public class GratificacaoDBA implements Gratificacao{
	
	@Override
    public double gratificacao(Funcionario func) {
          if (func.getNivel() >= 2) {
              return func.getSalarioBase() * 1.30;
          }
          return func.getSalarioBase() * 1.20;
    }
}