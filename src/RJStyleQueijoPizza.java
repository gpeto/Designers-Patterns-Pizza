
public class RJStyleQueijoPizza extends Pizza{
	
	public RJStyleQueijoPizza(){
		nome = "Pizza com molho e queijo no estilo Carioca  ";
		massa = "Massa extra grossa";
		molho = "Molho de tomate";
		coberturas.add("Muita mussarela");
	}
	
	void cortar(){
		System.out.println("Cortar a pizza em fatias quadradas...");
	}

}
