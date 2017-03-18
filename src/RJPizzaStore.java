
public class RJPizzaStore extends PizzaStore{

	protected Pizza createPizza(String item){
		if(item.equals("Queijo")){
			return new SPStyleQueijoPizza();
		}else return null;
	}

}
