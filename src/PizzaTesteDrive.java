
public class PizzaTesteDrive {

	public static void main(String[] args) {
		PizzaStore spStore = new SPPizzaStore();
		PizzaStore rjStore = new RJPizzaStore();

		Pizza pizza = spStore.orderPizza("Queijo");
		System.out.println("Edson pediu uma " + pizza.getNome() + " \n");

		pizza = rjStore.orderPizza("Queijo");
		System.out.println("Paulo pediu uma " + pizza.getNome() + " \n");
	}

}
