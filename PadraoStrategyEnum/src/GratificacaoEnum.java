/**
 * 
 */

/**
 * @author andersonribeiro
 *
 */

public enum GratificacaoEnum implements Gratificacao {

	LIDER {
		public double gratificacao(Funcionario func) {
			if (func.getNivel() >= 2) {
				return func.getSalarioBase() * 1.35;
			}
			return func.getSalarioBase() * 1.25;
		}
	},

	GERENTE {
		public double gratificacao(Funcionario func) {
			if (func.getNivel() >= 2) {
				return func.getSalarioBase() * 1.45;
			}
			return func.getSalarioBase() * 1.30;
		}
	},

	DBA {
		public double gratificacao(Funcionario func) {
			if (func.getNivel() >= 2) {
				return func.getSalarioBase() * 1.30;
			}
			return func.getSalarioBase() * 1.20;
		}
	},

	DESENVOLVEDOR {
		public double gratificacao(Funcionario func) {
			if (func.getNivel() >= 2) {
				return func.getSalarioBase() * 1.25;
			}
			return func.getSalarioBase() * 1.15;
		}
	},

};
