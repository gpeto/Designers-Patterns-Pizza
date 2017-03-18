import java.util.ArrayList;

public abstract class Pizza {

	String nome;
	String massa;
	String molho;
	ArrayList coberturas = new ArrayList();

	void preparar(){
		System.out.println("Preparando " + nome);
		System.out.println("Amassando a massa...");
		System.out.println("Adicionando molho...");
		System.out.println("Adicionando as coberturas: ");
	}
	
	void assar(){
		System.out.println("Assar por 25 minutos a 350º");
	}
	
	void cortar(){
		System.out.println("Cortar a pizza em fatias diagonais");
	}
	
	void caixa(){
		System.out.println("Colocar a pizza na caixa oficial da pizzaria");
	}
	
	public String getNome(){
		return nome;
	}
}
