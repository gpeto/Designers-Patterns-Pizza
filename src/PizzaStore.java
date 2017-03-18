
public abstract class PizzaStore {

	public Pizza orderPizza(String type){
		Pizza pizza;
		
		pizza  = orderPizza(type);
		pizza.preparar();
		pizza.cortar();
		pizza.assar();
		pizza.caixa();
		return pizza;
	}
	
	abstract Pizza createPizza(String type);
}
