
public class Main {

	public static void main(String[] args) {

		Pai pai = new Pai();
		pai.setNome("Elizaldo");
		pai.setIdade(60);
		System.out.println("Nome: " + pai.nome + ", Idade: " + pai.idade);
		
		Filho filho = new Filho();
		filho.setIdade(33);
		filho.setNome("Anderson");
		filho.setEmail("andersonribeiro.si@hotmail.com");
		System.out.println("Nome: " + filho.nome + ", Idade: " + filho.idade + ", Email: " + filho.email);
		

	}

}
