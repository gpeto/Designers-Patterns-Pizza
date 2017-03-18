
public class SPPizzaStore extends PizzaStore{

	 Pizza createPizza(String item){
		if(item.equals("Queijo")){
			return new SPStyleQueijoPizza();
		}else return null;
	}
}
