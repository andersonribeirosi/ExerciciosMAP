/**
 * 
 */

/**
 * @author andersonribeiro
 *
 */

public class Funcionario {

	protected double salario;
	protected int cargo;
	protected int nivel;
	protected Gratificacao bonus;
	public static final int LIDER = 3;
	public static final int GERENTE = 4;
	public static final int DESENVOLVEDOR = 1;
	public static final int DBA = 2;
	

	public Funcionario(int cargo, double salario, int nivel) {
		this.salario = salario;
		this.nivel = nivel;
		
		switch (cargo) {
		case LIDER:
			bonus = new GratificacaoLider();
			cargo = LIDER;
			break;
		case GERENTE:
			bonus = new GratificacaoGerente();
			cargo = GERENTE;
			break;
		case DESENVOLVEDOR:
			bonus = new GratificacaoDesenvolvedor();
			cargo = DESENVOLVEDOR;
			break;
		case DBA:
			bonus = new GratificacaoDBA();
			cargo = DBA;
			break;
		default:
			throw new RuntimeException("Cargo não encontrado amigo :/");
		}
	}

	public double gratificacao() {
		return bonus.gratificacao(this);
	}

	public double getSalarioBase() {
		return salario;
	}

	public int getNivel() {
		return nivel;
	}

}