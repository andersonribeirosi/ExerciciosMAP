/**
 * 
 */

/**
 * @author andersonribeiro
 *
 */

public class GratificacaoDesenvolvedor implements Gratificacao {
	
	@Override
    public double gratificacao(Funcionario func) {
          if (func.getNivel() >= 2) {
              return func.getSalarioBase() * 1.25;
          }
          return func.getSalarioBase() * 1.15;
    }
}