package lesson9.labs.prob8;
import java.util.ArrayList;
import java.util.List;

public class Main {
	static List<OrderItem> orderItems = new ArrayList<>();
	public static void main(String[] args) {
		Main m = new Main();
		m.loadOrderItemData();
		//boolean found=findProduct("Fishing Rod");
		boolean found=findProduct("Test");
		System.out.println("Found it "+ found);
		System.out.println("Do any of these Order Items have an order of flowers? " + 
		   m.findProduct("Flowers"));
	}
	
	private static boolean findProduct(String prodName) {
		boolean found = false;
			found=  orderItems.stream()
				.map(OrderItem::getProduct)
				.map(Product :: getProductName)
				.filter(prodName :: equals)
				.findAny()
				.isPresent();
		return found;
	}
	
	private void loadOrderItemData() {
		orderItems.add(new OrderItem(new Product("1016", "Tools", 131.00), 3));
		orderItems.add(new OrderItem(new Product("1017", "Fishing Rod", 111.00), 1));
		orderItems.add(new OrderItem(new Product("1018", "Game of Go",66.00), 2));
		orderItems.add(new OrderItem(new Product("1019", "Flowers", 221.00), 5));
	}
}
