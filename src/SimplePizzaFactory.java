
public class SimplePizzaFactory {

	public Pizza createPizza(String type){
		Pizza pizza = null;
		
		if(type.equals("Queijo")){
			pizza = new SPStyleQueijoPizza(); 
		}else if(type.equals("Mussarela")){
			pizza = new RJStyleQueijoPizza();
	}else{
		return null;
	}
		return pizza;
}
}
